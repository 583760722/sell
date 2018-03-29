package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhy
 * @version 1.0
 * @classDesc: 商品（包含类目）
 * @date 2018/3/21
 * @copyright: 上海英和
 * @QQ: 583760722
 */
@Data
public class ProductVO implements Serializable{


    private static final long serialVersionUID = 7097863777546530545L;

    @JsonProperty("name")
    private String categoryName;
    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;


}
