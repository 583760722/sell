package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import com.imooc.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/3/20
 * @copyright: 上海英和
 * @QQ: 583760722
 */
public interface ProductService {
    ProductInfo findOne(String id);

    /**
     * 获取所有上架的商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 分页查询商品列表
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);


    ProductInfo save(ProductInfo productInfo);


    /**
     * 加库存
     * @param cartDTOList
     */
    void increaseStock(List<CartDTO> cartDTOList);

    /**
     * 减库存
     * @param cartDTOList
     */
    void decreaseStock(List<CartDTO> cartDTOList);















}
