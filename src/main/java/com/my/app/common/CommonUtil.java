package com.my.app.common;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.crypto.Cipher;

import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonUtil {

    private static final Logger logger = LoggerFactory.getLogger(CommonUtil.class);

	static Random random = new Random();

	private static Lock lock = new ReentrantLock();

	// bugfix 20180917 流水号防止重复
	public static String serverFlag;

	private static long _flowID = 1L;
	
	/**
	 * 设置参数缺失返回信息
	 ** 
	 * @return
	 */
	public static ResultMessageObject setResultMessage(ResultMessageObject message, String result) {
		if (message == null) {
			message = new ResultMessageObject();
		}

		message.setCode("0002");
		message.setMessage(result);
		return message;
	}

	/**
	 * 设置返回信息
	 *
	 * @param serviceCode
	 * @return
	 */
	public static ResultMessageObject setResultMessage(ResultMessageObject message, ServiceCode serviceCode) {
		if (message == null) {
			message = new ResultMessageObject();
		}
		if ("0000".equals(serviceCode.getCode())) {
			message.setSuccess("1");
		} else {
			message.setSuccess("0");
		}
		message.setCode(serviceCode.getCode());
		message.setMessage(serviceCode.getText());

		return message;
	}
	/**
	 * 转换获取十八位身份证号
	 * 
	 * @param idCard
	 * @return
	 */
	public static String getIdCardByLength(String idCard) {
		String retId = "";
		String id17 = "";
		int sum = 0;
		int y = 0;

		// 定义数组存放加权因子（weight factor）
		final int[] wf = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };
		// 定义数组存放校验码（check code）
		final String[] cc = { "1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2" };

		if (idCard.length() != 15) {
			return idCard;
		}

		// 加上两位年19
		id17 = idCard.substring(0, 6) + "19" + idCard.substring(6);
		// 十七位数字本体码加权求和
		for (int i = 0; i < 17; i++) {
			sum = sum + Integer.valueOf(id17.substring(i, i + 1)) * wf[i];
		}

		// 计算模
		y = sum % 11;
		// 通过模得到对应的校验码 cc[y]
		retId = id17 + cc[y];
		return retId;
	}

	/**
	 * 取n位随机数
	 * 
	 * @return
	 */
	public static String getRandom(int n) {
		StringBuilder s = new StringBuilder();

		for (int i = 0; i < n; i++) {
			s.append(random.nextInt(10));
		}

		return s.toString();
	}

	/**
	 * 根据身份证号获取性别
	 * 
	 * @param cardNum
	 * @return
	 */
	public static String getSexByIDCard(String cardNum) {
		// 获取身份证倒数第二位
		String index = cardNum.substring(cardNum.length() - 2, cardNum.length() - 1);

		// 性别
		String sex = "";

		if (Integer.parseInt(index) % 2 == 0) {
			sex = "1";
		} else {
			sex = "0";
		}

		return sex;
	}

	/**
	 * 计算日期差
	 * 
	 * @return
	 * @throws ParseException
	 */
	public static int calculateDateDiffer(String startDate, String endDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		Date specificStartDate = sdf.parse(startDate);
		Date specificEndDate = sdf.parse(endDate);

		int days = (int) ((specificEndDate.getTime() - specificStartDate.getTime()) / (1000 * 3600 * 24));

		return days;
	}

	/**
	 * 打印异常信息
	 * 
	 * @param thr
	 * @return
	 */
	public static String printException(Throwable thr) {
		if (thr == null)
			return null;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			thr.printStackTrace(new PrintStream(baos));
			baos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (baos != null)
				try {
					baos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		return baos.toString();
	}

	/**
	 * 打印异常信息类别
	 * 
	 * @param thr
	 * @return
	 */
	public static String printExceptionClass(Throwable thr) {

		return thr.getClass().toString();
	}

	public static String formatTimeString(Date date, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);
	}

	// Bean --> Map 1: 利用Introspector和PropertyDescriptor 将Bean --> Map
	public static Map<String, Object> transBean2Map(Object obj) {

		if (obj == null) {
			return null;
		}
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
			PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
			for (PropertyDescriptor property : propertyDescriptors) {
				String key = property.getName();

				// 过滤class属性
				if (!key.equals("class")) {
					// 得到property对应的getter方法
					Method getter = property.getReadMethod();
					Object value = getter.invoke(obj);

					map.put(key, value);
				}
			}
		} catch (Exception e) {
			System.out.println("transBean2Map Error " + e);
		}

		return map;
	}

	public static <T extends Object> List<Map<String, Object>> entityConvertMap(List<T> list) {
		List<Map<String, Object>> l = new LinkedList<>();
		try {
			for (T t : list) {
				Map<String, Object> map = new HashMap<>();
				Method[] methods = t.getClass().getMethods();
				for (Method method : methods) {
					if (method.getName().startsWith("get")) {
						String name = method.getName().substring(3);
						name = name.substring(0, 1).toLowerCase() + name.substring(1);
						if (!"class".equalsIgnoreCase(name)) {
							Object value = method.invoke(t);
							map.put(name, value);
						}
					}
				}
				l.add(map);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return l;
	}

	/**
	 * 封装返回列表
	 * 
	 * @param list
	 * @return
	 */
	public static List<Map<String, Object>> packageResultList(List<Map<String, Object>> list) {
		List<Map<String, Object>> lisMaps1 = new ArrayList<Map<String, Object>>();
		for (Map<String, Object> messageMap : list) {
			List<Map<String, Object>> lisMaps = new ArrayList<Map<String, Object>>();
			lisMaps.add(messageMap);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("createdTime", MapUtils.getString(messageMap, "createdTime", ""));
			map.put("detailList", lisMaps);
			lisMaps1.add(map);
		}
		return lisMaps1;
	}

	/**
	 * 参数是否全部不为空
	 * 
	 * @param params
	 * @return
	 */
	public static boolean emptyParams(String... params) {
		if (params.length < 1)
			return true;
		for (String str : params) {
			if (StringUtils.isBlank(str)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 判断是否事数字
	 * 
	 * @param str 字符串
	 * @param b   大于0
	 * @return
	 */
	public static boolean isNumber(String str, boolean b) {

		boolean result = StringUtils.isNumeric(str);
		// 如果要求大于0
		if (b && result) {
			return Integer.parseInt(str) > 0;
		}

		return result;
	}


	/**
	 * 银行卡隐藏除头尾4位
	 * 
	 * @param bankNumber
	 * @return
	 */
	public static String replaceToRelatedAccNo(String bankNumber) {
		if (StringUtils.isBlank(bankNumber)) {
			return "";
		}
		// 头尾4位保留，将字符串分为3组
		String regex = "(\\d{4})(.*)(\\d{4})";
		// 按regex分组编译得到的匹配类,并按pattern编译指定的字符串
		Matcher m = Pattern.compile(regex).matcher(bankNumber);
		// 如果匹配
		if (m.find()) {
			// 要替换的组
			String rep = m.group(2);
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < rep.length(); i++) {
				// 判断只支持4位星号20180515
				// for (int i = 0; i < 4; i++) {
				sb.append("*");
			}

			if (rep.equals(sb.toString()))
				return bankNumber;
			// 要替换的内容，替换为内容
			return bankNumber.replace(rep, sb.toString());
		} else {
			return "";
		}
	}


	/**
	 * 校验身份证
	 * 
	 * @param cardcode
	 * @return
	 */
	public static boolean cardCodeVerifySimple(String cardcode) {
		// 第一代身份证正则表达式(15位)
		String isIDCard1 = "^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$";
		// 第二代身份证正则表达式(18位)
		String isIDCard2 = "^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])((\\d{4})|\\d{3}[A-Z])$";

		// 验证身份证
		if (cardcode.matches(isIDCard1) || cardcode.matches(isIDCard2)) {
			return true;
		}
		return false;
	}

	/**
	 * 将参数设置到JSON中
	 * 
	 * @param json
	 * @param map
	 * @return
	 */
	public static void setParamaterInJSON(ResultMessageObject message, Map<String, Object> map) {
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			message.getData().put(entry.getKey(), entry.getValue());
		}
	}

	/**
	 * 交换字符串顺序
	 * 
	 * @param flowId
	 * @param firstIndex
	 * @param secondIndex
	 * @return
	 */
	public static String changeStrPostion(String flowId, int firstIndex, int secondIndex) {
		// System.out.println(flowId+","+firstIndex+","+secondIndex+","+flowId.charAt(firstIndex)+","+flowId.charAt(secondIndex));
		if (StringUtils.isBlank(flowId) || firstIndex >= flowId.length() || secondIndex >= flowId.length()
				|| firstIndex < 0 || secondIndex < 0) {
			return flowId;
		}
		char[] chars = new char[flowId.length()];
		flowId.getChars(0, flowId.length(), chars, 0);
		// System.out.println(chars.length+","+chars[firstIndex]+","+chars[secondIndex]);
		// 交换
		char flag = chars[firstIndex];
		chars[firstIndex] = chars[secondIndex];
		chars[secondIndex] = flag;
		return String.valueOf(chars);
	}
	
	/**
	 * 创建平安交易流水号
	 * @param masterId
	 * @return
	 */
	public static String createPATradeFlow(String masterId) {
		lock.lock();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

		try {
			StringBuffer sbf = new StringBuffer();

			sbf.append(masterId).append(sdf.format(new Date())).append(CommonUtil.serverFlag).append(_flowID);

			++_flowID;
			if (_flowID >= 10L) {
				_flowID = 1L;
			}

			return sbf.toString();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}

		return "";
	}

	/**
	 * 对象转map
	 * 
	 * @param bean
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public static Map<String, Object> convertBeanToMap(Object bean) throws Exception {
		Class type = bean.getClass();
		Map<String, Object> returnMap = new HashMap<String, Object>();
		BeanInfo beanInfo = Introspector.getBeanInfo(type);
		PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
		for (int i = 0; i < propertyDescriptors.length; i++) {
			PropertyDescriptor descriptor = propertyDescriptors[i];
			String propertyName = descriptor.getName();
			if (!propertyName.equals("class")) {
				Method readMethod = descriptor.getReadMethod();
				Object result = readMethod.invoke(bean, new Object[0]);
				if (result != null) {
					returnMap.put(propertyName, result);
				} else {
					returnMap.put(propertyName, "");
				}
			}
		}
		return returnMap;
	}

	/**
	 * 获取银行卡后四位
	 * @param bankNo
	 * @return
	 */
	public static String getLastFourNo(String bankNo) {
		if (StringUtils.isNotBlank(bankNo)) {
			String str = bankNo.substring(bankNo.length()-4, bankNo.length());

			return str;
		}

		return "";
	}

	/**
	 * 判断当天或者历史
	 * @param time
	 * @return
	 */
	public static String judgeDateHistory(Date time) {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		if (fmt.format(c.getTime()).equals(fmt.format(time))) {
			return "1";
		} else {
			return "2";
		}
	}
	
	public static BigDecimal calularChargeFee(BigDecimal balance) {

		//手续费为千分之一,四舍五入保留两位小数
		BigDecimal cacularValue = balance.multiply(BigDecimal.valueOf(0.001)).setScale(2,BigDecimal.ROUND_HALF_UP);

		BigDecimal baseValue = new BigDecimal(2);

		//最少是2块，所以如果小于2，就返回2
		return cacularValue.compareTo(baseValue)>=0 ? cacularValue : baseValue;
	}

    /**
	 * 公钥加密
	 * @param data
	 * @param publicKey
	 * @return
	 * @throws Exception
	 */
	public static String encryptByPublicKey(String data, String publicKey)
			throws Exception {
		byte[] pubKeyArray = Base64.getDecoder().decode(publicKey);
		X509EncodedKeySpec x509ek = new X509EncodedKeySpec(pubKeyArray);
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		PublicKey pubKey = keyFactory.generatePublic(x509ek);
		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.ENCRYPT_MODE, pubKey);
		byte[] resultBytes = cipher.doFinal(data.getBytes("UTF-8"));
		return Base64.getUrlEncoder().encodeToString(resultBytes);
	}

	/**
	 * 私钥解密
	 * @param privateKey
	 * @return
	 * @throws Exception
	 */
	public static String decryptByPrivateKey(String encryptString, String privateKey)
			throws Exception {
		byte[] prvKeyArray = Base64.getDecoder().decode(privateKey);
		byte[] targetData = Base64.getUrlDecoder().decode(encryptString.getBytes("utf-8"));
		PKCS8EncodedKeySpec s8ek  = new PKCS8EncodedKeySpec(prvKeyArray);
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		PrivateKey prvKey = keyFactory.generatePrivate(s8ek);
		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.DECRYPT_MODE, prvKey);
		byte[] resultBytes = cipher.doFinal(targetData);
		return new String(resultBytes);
	}

	/**
	 * 基于MD5算法的单向加密
	 * @param s
	 * @return
	 */
	public static String encryptBasedMd5(String s) {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

		try {
			byte[] strTemp = s.getBytes();
			MessageDigest mdTemp = MessageDigest.getInstance("MD5");
			mdTemp.update(strTemp);
			byte[] md = mdTemp.digest();
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}

			return new String(str);
		} catch (Exception e) {
			return null;
		}
	}
}
