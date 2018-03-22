package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderMasterRepositoryTest {
    @Autowired
    private OrderMasterRepository repository;

    @Autowired
    private ProductCategoryRepository categoryRepository;

    @Test
    public void saveTest() {

    }

    @Test
    public void findByBuyerOpenid() throws Exception {
        PageRequest pageRequest = PageRequest.of(0, 2);
        Page<OrderMaster> byBuyerOpenid = repository.findByBuyerOpenid("ew3euwhd7sjw9diwkq", pageRequest);
        System.out.println(byBuyerOpenid.getContent());
    }


}