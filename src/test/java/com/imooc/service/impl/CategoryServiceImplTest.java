package com.imooc.service.impl;

import com.imooc.dataobject.ProductCategory;
import com.imooc.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class CategoryServiceImplTest {
    @Autowired
    private CategoryService categoryService;

    @Test
    public void findOne() throws Exception {
        ProductCategory one = categoryService.findOne(1);
        log.info("one:{}",one);
        Assert.assertNotNull(one);
    }

    @Test
    public void findAll() throws Exception {
        List<ProductCategory> all = categoryService.findAll();
        log.info("all:{}",all);
        Assert.assertNotEquals(0, all.size());
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<Integer> categoryTypeList = Arrays.asList(2, 3, 4, 5, 6);
        List<ProductCategory> byCategoryTypeIn = categoryService.findByCategoryTypeIn(categoryTypeList);
        log.info("all:{}",byCategoryTypeIn);
        Assert.assertNotEquals(0, byCategoryTypeIn.size());
    }

    @Test
    @Transactional
    public void save() throws Exception {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryType(3);
        productCategory.setCategoryName("天榜");
        productCategory.setCategoryId(9);

        ProductCategory save = categoryService.save(productCategory);
        log.info("save:{}",save);
        Assert.assertNotNull(save);
    }

}