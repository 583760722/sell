package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/3/22
 * @copyright: 上海英和
 * @QQ: 583760722
 */
public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String openid,String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);

}
