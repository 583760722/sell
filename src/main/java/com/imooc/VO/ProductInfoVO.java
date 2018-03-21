package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author zhy
 * @version 1.0
 * @classDesc: 商品详情
 * @date 2018/3/21
 * @copyright: 上海英和
 * @QQ: 583760722
 */
@Data
public class ProductInfoVO implements Serializable{
    private static final long serialVersionUID = -4823396971246925990L;
    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}
