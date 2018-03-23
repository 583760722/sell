package com.imooc.service.impl;

import com.imooc.dataobject.OrderDetail;
import com.imooc.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceImplTest {
    @Autowired
    private OrderServiceImpl orderService;

    public static final String openid = "123asd";
    public static final String orderid = "1521689030135754711";


    @Test
    public void create() throws Exception {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerAddress("富士山");
        orderDTO.setBuyerName("佐佐木");
        orderDTO.setBuyerOpenid("asdadasd");
        orderDTO.setBuyerPhone("18037022408");

        List<OrderDetail> orderDetailList = new ArrayList<>();

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setProductId("S686");
        orderDetail.setProductQuantity(2);

        orderDetailList.add(orderDetail);
        orderDTO.setOrderDetailList(orderDetailList);
        OrderDTO orderDTO1 = orderService.create(orderDTO);
        log.info("orderDTO1:{}", orderDTO1);

    }

    @Test
    public void findOne() throws Exception {
        OrderDTO orderDTO = orderService.findOne("1521689030135754711");
        log.info("orderDTO={}", orderDTO);
        Assert.assertNotNull(orderDTO);

    }

    @Test
    public void findList() throws Exception {
        PageRequest pageRequest = PageRequest.of(0, 3);
        Page<OrderDTO> page = orderService.findList("ew3euwhd7sjw9diwkq", pageRequest);
        log.info("pageOrderDTO={}", page.getContent());


    }

    @Test
    public void cancel() throws Exception {
        OrderDTO orderDTO = orderService.findOne(orderid);

        OrderDTO cancel = orderService.cancel(orderDTO);
        log.info("cancel={}",cancel);

    }

    @Test
    public void finish() throws Exception {

        OrderDTO orderDTO = orderService.findOne(orderid);
        OrderDTO finish = orderService.finish(orderDTO);
        log.info("finish={}",finish);
    }

    @Test
    public void paid() throws Exception {
        OrderDTO orderDTO = orderService.findOne(orderid);
        OrderDTO paid = orderService.paid(orderDTO);
        log.info("paid={}",paid);
    }

}