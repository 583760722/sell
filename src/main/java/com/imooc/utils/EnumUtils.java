package com.imooc.utils;

import com.imooc.enums.CodeEnum;

/**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/3/28
 * @copyright: 上海英和
 * @QQ: 583760722
 */
public class EnumUtils {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
