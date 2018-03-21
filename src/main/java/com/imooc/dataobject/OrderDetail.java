package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/3/21
 * @copyright: 上海英和
 * @QQ: 583760722
 */
@Entity
@Data
public class OrderDetail implements Serializable {
    private static final long serialVersionUID = 8781513365442327067L;

    @Id
    /** 详情id **/
    private String detailId;

    /** 订单id **/
    private String orderId;

    /** 商品id **/
    private String productId;

    /** 商品名称 **/
    private String productName;

    /** 商品单价 **/
    private BigDecimal productPrice;

    /** 商品数量 **/
    private Integer productQuantity;

    /** 商品小图 **/
    private String productIcon;


}
