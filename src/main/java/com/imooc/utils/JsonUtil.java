package com.imooc.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/3/26
 * @copyright: 上海英和
 * @QQ: 583760722
 */
public class JsonUtil {
    public static String toJson(Object o) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();

        return gson.toJson(o);
    }
}
