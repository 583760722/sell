package com.imooc.utils;

import java.util.Random;

/**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/3/21
 * @copyright: 上海英和
 * @QQ: 583760722
 */
public class KeyUtil {

    public static synchronized String genUniqueKey() {
        Random random = new Random();
        System.currentTimeMillis();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }

    public static void main(String[] args) {
        System.out.println(genUniqueKey());
    }
}
