package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<Integer> categoryList = new ArrayList<>();
        categoryList.add(1);
        categoryList.add(2);
        categoryList.add(4);
        List<ProductCategory> byCategoryTypeIn = repository.findByCategoryTypeIn(categoryList);
        System.out.println(byCategoryTypeIn);
        Assert.assertNotEquals(0,byCategoryTypeIn.size());
    }

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    @Transactional
    public void fun1() {
        ProductCategory p = repository.getOne(1);
        System.out.println(p);
    }

    @Test
    @Transactional
    public void fun2() {
        ProductCategory p = new ProductCategory();
        p.setCategoryName("男士最爱");
        p.setCategoryType(3);
        ProductCategory save = repository.save(p);
        System.out.println(save);

        Assert.assertNotNull(save);

    }

    @Test
    public void saveTest() {
        Optional<ProductCategory> byId = repository.findById(9);
        ProductCategory p = byId.get();
        p.setCategoryType(11);
        ProductCategory save = repository.save(p);
        System.out.println(save);
    }




}