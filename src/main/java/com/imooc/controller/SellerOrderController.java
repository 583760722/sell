package com.imooc.controller;

import com.imooc.dataobject.OrderDetail;
import com.imooc.dto.OrderDTO;
import com.imooc.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.engine.jdbc.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/3/28
 * @copyright: 上海英和
 * @QQ: 583760722
 */
@Controller
@RequestMapping("/seller/order")
@Slf4j
public class SellerOrderController {

    @Autowired
    private OrderService orderService;


    @GetMapping("/list")
    public ModelAndView list(@RequestParam(value = "page",defaultValue = "1") Integer page,
                             @RequestParam(value = "size",defaultValue = "20") Integer size,
                             Map<String,Object> map) {


        PageRequest request = PageRequest.of(page-1, size);
        Page<OrderDTO> orderDTOPage = orderService.findList(request);
        List<OrderDTO> content = orderDTOPage.getContent();



        List<OrderDetail> detailList = new ArrayList<>();
        content.get(0).setOrderDetailList(detailList);

        map.put("page", orderDTOPage);
        map.put("currentPage", page);
        map.put("size", size);
        return new ModelAndView("order/list", map);
    }
}
