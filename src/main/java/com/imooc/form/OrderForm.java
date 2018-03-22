package com.imooc.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/3/22
 * @copyright: 上海英和
 * @QQ: 583760722
 */
@Data
public class OrderForm {
    /**
     * 买家姓名
     */
    @NotEmpty(message = "姓名必填")
    private String name;

    /**
     * 买家手机号
     */
    @NotEmpty(message = "手机号必填")
    private String phone;

    /**
     * 地址必填
     */
    @NotEmpty(message = "地址必填")
    private String address;

    /**
     * openid必填
     */
    @NotEmpty(message = "openid必填")
    private String openid;

    @NotEmpty(message = "购物车不能为空")
    private String items;


}
