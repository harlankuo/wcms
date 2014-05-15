package com.harlankuo.hyacinth.wcms.utils;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * 
 ****************************************************************************************
 * 功能描述: 加密解密辅助类                                                                                                  
 *                                                                                                    
 *                                                                                                         
 *                                                                                                         
 ****************************************************************************************
 * 作 者: 
 * 文件名称: 
 *
 */
public class CryptUtils {
	private final static Log logger = LogFactory.getLog(CryptUtils.class); // 日志记录
	private final static String DES = "DES";
	private final static String AES = "AES";

	/**
	 * 加密
	 * 
	 * @param src
	 *            数据源
	 * @param key
	 *            密钥，长度必须是8的倍数
	 * @return 返回加密后的数据
	 * @throws Exception
	 */
	public static byte[] encrypt(byte[] src, byte[] key)
			throws RuntimeException {
		// DES算法要求有一个可信任的随机数源
		try {
			SecureRandom sr = new SecureRandom();
			// 从原始密匙数据创建DESKeySpec对象
			DESKeySpec dks = new DESKeySpec(key);
			// 创建一个密匙工厂，然后用它把DESKeySpec转换成
			// 一个SecretKey对象
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
			SecretKey securekey = keyFactory.generateSecret(dks);
			// Cipher对象实际完成加密操作
			Cipher cipher = Cipher.getInstance(DES);
			// 用密匙初始化Cipher对象
			cipher.init(Cipher.ENCRYPT_MODE, securekey, sr);
			// 现在，获取数据并加密
			// 正式执行加密操作
			return cipher.doFinal(src);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 解密
	 * 
	 * @param src
	 *            数据源
	 * @param key
	 *            密钥，长度必须是8的倍数
	 * @return 返回解密后的原始数据
	 * @throws RuntimeException
	 */
	public static byte[] decrypt(byte[] src, byte[] key)
			throws RuntimeException {
		try {
			// DES算法要求有一个可信任的随机数源
			SecureRandom sr = new SecureRandom();
			// 从原始密匙数据创建一个DESKeySpec对象
			DESKeySpec dks = new DESKeySpec(key);
			// 创建一个密匙工厂，然后用它把DESKeySpec对象转换成
			// 一个SecretKey对象
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
			SecretKey securekey = keyFactory.generateSecret(dks);
			// Cipher对象实际完成解密操作
			Cipher cipher = Cipher.getInstance(DES);
			// 用密匙初始化Cipher对象
			cipher.init(Cipher.DECRYPT_MODE, securekey, sr);
			// 现在，获取数据并解密
			// 正式执行解密操作
			return cipher.doFinal(src);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 数据解密
	 * 
	 * @param data
	 * @param key
	 *            密钥
	 * @return
	 * @throws Exception
	 */
	public final static String decrypt(String data, String key)
			throws Exception {
		return new String(decrypt(hex2byte(data.getBytes()), key.getBytes()));
	}

	/**
	 * 数据加密
	 * 
	 * @param data
	 * @param key
	 *            密钥
	 * @return
	 * @throws Exception
	 */
	public final static String encrypt(String data, String key) {
		if (data != null)
			try {
				return byte2hex(encrypt(data.getBytes(), key.getBytes()));
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		return null;
	}

	/**
	 * 二行制转字符串
	 * 
	 * @param b
	 * @return
	 */
	private static String byte2hex(byte[] b) {
		StringBuilder hs = new StringBuilder();
		String stmp;
		for (int n = 0; b != null && n < b.length; n++) {
			stmp = Integer.toHexString(b[n] & 0XFF);
			if (stmp.length() == 1)
				hs.append('0');
			hs.append(stmp);
		}
		return hs.toString().toUpperCase();
	}

	/**
	 * 16进制数据转二行制
	 * 
	 * @param b
	 * @return
	 */
	private static byte[] hex2byte(byte[] b) {
		if ((b.length % 2) != 0)
			throw new IllegalArgumentException();
		byte[] b2 = new byte[b.length / 2];
		for (int n = 0; n < b.length; n += 2) {
			String item = new String(b, n, 2);
			b2[n / 2] = (byte) Integer.parseInt(item, 16);
		}
		return b2;
	}

	/**
	 * 对文件进行md5散列
	 * @param str 
	 * @return
	 */
	public static String md5(String str) {
		return DigestUtils.md5Hex(str);
	}
	/**
	 * AES加密算法
	 * @param sSrc 要加密的内容
	 * @param sKey 加密的密钥
	 * @return
	 * @throws Exception
	 */
	public static String AESEncrypt(String sSrc, String sKey) throws Exception {
        if (sKey == null) {
        	logger.info("Key为空null！");
            return null;
        }
        // 判断Key是否为16位
        if (sKey.length() != 16) {
        	logger.info("Key长度不是16位");
            return null;
        }
        byte[] raw = sKey.getBytes("utf-8");
        SecretKeySpec skeySpec = new SecretKeySpec(raw, AES);
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");//"算法/模式/补码方式"
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = cipher.doFinal(sSrc.getBytes("utf-8"));
        String str = Base64.encodeBase64String(encrypted);
        System.out.println(str.length());
        return byte2hex(encrypted);
    }
    
	/**
	 * AES解密算法
	 * @param sSrc 要解密的内容
	 * @param sKey 加密的密钥
	 * @return
	 * @throws Exception
	 */
    public static String AESDecrypt(String sSrc, String sKey) throws Exception {
        try {
            // 判断Key是否正确
            if (sKey == null) {
            	logger.info("Key为空null");
                return null;
            }
            // 判断Key是否为16位
            if (sKey.length() != 16) {
            	logger.info("Key长度不是16位");
                return null;
            }
            byte[] raw = sKey.getBytes("utf-8");
            SecretKeySpec skeySpec = new SecretKeySpec(raw, AES);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec);
            byte[] encrypted1 = hex2byte(sSrc.getBytes());//先用base64解密
            byte[] original = cipher.doFinal(encrypted1);
            String originalString = new String(original,"utf-8");
            return originalString;
        } catch (Exception e) {
        	logger.error("在使用AES解密时出现异常："+e.toString());
            return null;
        }
    }
    
    public static void main(String[] args){
//    	System.out.println(CryptUtils.md5("LGxxd123"));
//        System.out.println(DateTime.now().toString("yyyy-MM-dd"));
//        System.out.println(DateTime.now().plusDays(29).toString("yyyy-MM-dd"));
//        DateTime dStart = DateTime.parse("2013-01-01");
//        DateTime dEnd = DateTime.parse("2013-01-31");
//        DateTime dTemp = dStart;
//        Period p =new Period(dStart, dEnd, PeriodType.days());
//        int n = p.getDays();
//        System.out.println(n);
//        for (int i=1;i<=(n/29+1);i++){
//            dTemp = dStart.plusDays(29);
//            if(dTemp.compareTo(dEnd)>=0){
//                dTemp = dEnd;
//            }
//            System.out.println(dStart.toString("yyyy-MM-dd")+":"+dTemp.toString("yyyy-MM-dd"));
//            dStart = dTemp.plusDays(1);
////            System.out.println(dStart.toString("yyyy-MM-dd"));
//        }
        Date d = new Date(1369929600000l);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String st = sdf.format(d);
        System.out.println(st);

    }
}
