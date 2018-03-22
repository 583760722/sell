package com.imooc.dto;

import com.imooc.dataobject.OrderDetail;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author zhy
 * @version 1.0
 * @classDesc: 订单数据传输对象
 * @date 2018/3/21
 * @copyright: 上海英和
 * @QQ: 583760722
 */
@Data
public class OrderDTO implements Serializable {
    private static final long serialVersionUID = -2379617806245302430L;

    private String orderId;

    /** 买家姓名 **/
    private String buyerName;

    /** 买家手机号 **/
    private String buyerPhone;

    /** 买家地址 **/
    private String buyerAddress;

    /** 买家微信openid **/
    private String buyerOpenid;

    /** 订单总金额 **/
    private BigDecimal orderAmount;
    /** 订单状态，默认为新下单 **/
    private Integer orderStatus;

    /** 支付状态，默认为未支付 **/
    private Integer payStatus;

    private Date createTime;

    private Date updateTime;

    List<OrderDetail> orderDetailList;

}
