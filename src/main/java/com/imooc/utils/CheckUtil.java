package com.imooc.utils;

import ch.qos.logback.classic.gaffer.PropertyUtil;

import java.security.MessageDigest;
import java.util.Arrays;

/**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/3/23
 * @copyright: 上海英和
 * @QQ: 583760722
 */
public class CheckUtil {
    public static boolean checkSignature(String signature, String timestamp, String nonce) {
        String token = "hornyun";
        String[] arr = new String[]{token, timestamp, nonce};
        Arrays.sort(arr);
        StringBuffer content = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            content.append(arr[i]);
        }

        // sha1加密
        String temp = getSha1(content.toString());
        return temp.equals(signature);

    }

    private static String getSha1(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        char hexDigits[] = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        try {
            MessageDigest temp = MessageDigest.getInstance("SHA1");
            temp.update(str.getBytes("UTF-8"));

            byte[] md = temp.digest();
            int j = md.length;
            char buf[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                buf[k++] = hexDigits[byte0 >>> 4 & 0xf];
                buf[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(buf);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
