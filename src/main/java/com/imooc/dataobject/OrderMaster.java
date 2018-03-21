package com.imooc.dataobject;

import com.imooc.enums.OrderMasterEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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
@DynamicUpdate
public class OrderMaster implements Serializable{
    private static final long serialVersionUID = 1300473346294733575L;

    /** 订单id **/
    @Id
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
    private Integer orderStatus = OrderMasterEnum.NEW.getCode();

    /** 支付状态，默认为未支付 **/
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    private Date createTime;

    private Date updateTime;

}
