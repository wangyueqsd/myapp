package com.my.app.common;

import org.apache.commons.lang3.StringUtils;

public enum ServiceCode {

	SUCCESS("0000", "请求成功"),

	PARAMETER_DEFICIENCY("0001", ""),

	TOKEN_ERROR("0002", "无效的token"),

	NOT_ACCOUNT("0003", "此用户尚未开户"),

	NOT_BANK_CARD("0004", "银行卡不存在"),

	AUTHENTICATION_FAIL("0005", "用户令牌检证失败"),

	DEPOSIT_MONEY_ERROR("0006", "提现金额错误"),

	APP_TYPE_NOT_BLANK("0007", "APP类型不能为空"),

	NOT_TRADE_FLOW_ID("0008", "流水号不能为空"),

	NO_REPAYMENT_RECORD("0024", "当前流水不存在"),
	
	SYSTEM_ERROR("9999", "操作异常，请稍后重试"),

	NO_REQUEST_BEFORE("0036", "尚未开户"),

	ORDER_NO_IS_NULL("0016", "订单号不能为空"),

	DEPOSIT_HANDING("0032", "提现处理中"),

	DEPOSIT_FREEZE("0033",
			"尊敬的平台用户：为符合国家及上海地区对于网络借贷中介机构的合规审核要求，平台在您申请借款提现时设置了time小时冷静期。在借款冷静期结束后，您可使用提现功能。如您在借款冷静期后三日内不进行提现操作，平台将自动结清并终止借款。"),

	DEPOSIT_MONEY_EQUALS("0021", "提现金额必须与可提现金额一致"),

	DEPOSIT_MONEY_MORE("0019", "提现金额不能大于可提现金额"),

	DEPOSIT_UNLOCK_FAIL("0034", "提现解锁失败"),

	RECORD_IS_LOCKED("0025", "系统正在处理交易，请15分钟后再重新操作。"),

	DYMANICCODE("", ""),

	NO_BANK_CARD("0020", "尚未绑定银行卡"),

	NO_id_CARD("0029", "身份证不能为空"),

	NO_USER_MOBILE("0030", "手机号不能为空"),

	HANDLING_GO_ON("0054", "处理中，继续轮询执行"),

	NO_WAY_RECHARGE("0028", "该笔流水无法提现"),

	NO_REQUIREMENT_PARAMS("0040", "缺少必要参数"),

	SIGN_FAIL("0023", "签名认证失败"),

	NO_WITHDRAW_MONEY("0055", "无可提现的金额"),

	WITHDRAW_MONEY_LESS_THAN_TWO("0056", "提现金额不能小于2元");

	/**
	 * 错误码
	 */
	private String code;

	/**
	 * 错误信息
	 */
	private String text;

	ServiceCode(String code, String text) {
		this.code = code;
		this.text = text;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public static ServiceCode getEnums(String code) {
		for (ServiceCode enums : values()) {
			if (StringUtils.equalsIgnoreCase(code, enums.getCode())) {
				return enums;
			}
		}

		return null;
	}
}
