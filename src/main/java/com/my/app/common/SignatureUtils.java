package com.my.app.common;

import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

import javax.crypto.Cipher;

/**
 * 存管加密验签工具类
 * @author zhangdonglei
 *
 */
public class SignatureUtils {
	
	/**
     * MD5加密
     * @param encryptString
     * @return
     */
    public static String encryptMD5(String encryptString)
    {
        java.security.MessageDigest digest;
        try {
            digest = java.security.MessageDigest.getInstance("MD5");
            digest.update(encryptString.getBytes("utf-8"));
            return bytes2Hex(digest.digest());
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }
    
    /**
     * 创建RSA秘钥对
     * 数组0 私钥
     * 数组1 公钥
     * @return
     */
    public static String[] generateRSAKeys()
    {
        String[] keys=new String[2];
        try
        {
            KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
            keyPairGen.initialize(1024, new SecureRandom());
            KeyPair keyPair = keyPairGen.generateKeyPair();
            keys[0]= Base64.getEncoder().encodeToString(((RSAPrivateKey)keyPair.getPrivate()).getEncoded());
            keys[1]=Base64.getEncoder().encodeToString(((RSAPublicKey)keyPair.getPublic()).getEncoded());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return keys;
    }

    /**
     * 二进制转16进制字符串
     * @param bts
     * @return
     */
    public static String bytes2Hex(byte[] bts) {

        String des = "";
        String tmp = null;
        for (int i = 0; i < bts.length; i++) {
            tmp = (Integer.toHexString(bts[i] & 0xFF));
            if (tmp.length() == 1) {
                des += "0";
            }
            des += tmp;
        }
        des = des.toUpperCase(); // ת�ɴ�д
        return des;
    }

    /**
     * 公钥加密
     *
     * @param data
     * @param publicKey
     * @return
     * @throws Exception
     */
    public static String encryptByPublicKey(String data, String publicKey)
            throws Exception {
        byte[] pubKeyArray=Base64.getDecoder().decode(publicKey);
        X509EncodedKeySpec x509ek =new X509EncodedKeySpec(pubKeyArray);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PublicKey  pubKey = keyFactory.generatePublic(x509ek);
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, pubKey);
        byte[] resultBytes = cipher.doFinal(data.getBytes("UTF-8"));
        return Base64.getEncoder().encodeToString(resultBytes);
    }

    /**
     * 私钥解密
     *
     * @param encryptString
     * @param privateKey
     * @return
     * @throws Exception
     */
    public static String decryptByPrivateKey(String encryptString, String privateKey)
            throws Exception {
        byte[] prvKeyArray=Base64.getDecoder().decode(privateKey);
        byte[] targetData=Base64.getMimeDecoder().decode(encryptString);
        PKCS8EncodedKeySpec s8ek  = new PKCS8EncodedKeySpec(prvKeyArray);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PrivateKey  prvKey = keyFactory.generatePrivate(s8ek);
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, prvKey);
        byte[] resultBytes = cipher.doFinal(targetData);
        return new String(resultBytes);
    }

    public static void main(String[] args) throws Exception {

        String[] keys=generateRSAKeys();
        System.out.println(keys[0]);
        System.out.println(keys[1]);
        String targetString="XXDAFASFSA1231231FASFAS";
        System.out.println(targetString);
        String encryptString=encryptByPublicKey(targetString,keys[1]);
        System.out.println(encryptString);
        System.out.println(decryptByPrivateKey(encryptString,keys[0]));

    }
}
