package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void saveTest() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("S686");
        productInfo.setProductName("炸酱面");
        productInfo.setProductPrice(new BigDecimal(3.2));

        productInfo.setProductStock(100);
        productInfo.setProductDescription("口感滑嫩");
        productInfo.setProductIcon("http://www.xxx.png");
        productInfo.setCategoryType(2);

        productInfo.setProductStatus(0);
        ProductInfo save = repository.save(productInfo);

        log.info("productInfo:{}",save);
        Assert.assertNotNull(save);

    }

    @Test
    public void findByIdTest() {
        Optional<ProductInfo> productInfoOptional = repository.findById("S686");
        if (productInfoOptional.isPresent()) {
            System.out.println(productInfoOptional);
        }
        Assert.assertNotNull(productInfoOptional);

    }

    @Test
    public void findByProductStatusTest() {
        List<ProductInfo> byProductStatus = repository.findByProductStatus(0);
        log.info("productInfoList={}", byProductStatus);

        Assert.assertNotEquals(0, byProductStatus.size());
    }
    @Test
    public void findByProductStatus() throws Exception {

    }

}