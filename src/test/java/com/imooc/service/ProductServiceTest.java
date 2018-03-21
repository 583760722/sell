package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductServiceTest {
    @Autowired
    private ProductService service;

    @Test
    public void findOne() throws Exception {
        ProductInfo a = service.findOne("a");
        log.info("productInfo:{}",a);
        Assert.assertNotNull(a);
    }

    @Test
    public void findUpAll() throws Exception {
        List<ProductInfo> upAll = service.findUpAll();
        log.info("upAll:{}", upAll);

        Assert.assertNotEquals(0, upAll.size());
    }

    @Test
    public void findAll() throws Exception {
        PageRequest pageRequest = PageRequest.of(0,2);
        Page<ProductInfo> all = service.findAll(pageRequest);
        log.info("upAll:{}", all);

        Assert.assertNotEquals(0, all.getContent().size());
    }

    @Test
    public void save() throws Exception {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("d");
        productInfo.setProductName("羊肉板面");
        productInfo.setProductPrice(new BigDecimal(6.6));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("家乡的味道，劲爽，火爆");
        productInfo.setProductIcon("http://www.noddle.com");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);

        ProductInfo save = service.save(productInfo);
        log.info("save:{}", save);
        Assert.assertNotNull(save);


    }

}