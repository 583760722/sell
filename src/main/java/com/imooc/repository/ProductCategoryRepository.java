package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/3/19
 * @copyright: 上海英和
 * @QQ: 583760722
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
