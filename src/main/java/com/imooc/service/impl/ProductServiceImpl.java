package com.imooc.service.impl;

import com.imooc.dataobject.ProductInfo;
import com.imooc.dto.CartDTO;
import com.imooc.enums.ProductStatusEnum;
import com.imooc.repository.ProductInfoRepository;
import com.imooc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/3/20
 * @copyright: 上海英和
 * @QQ: 583760722
 */
@Service
@Transactional(rollbackFor = RuntimeException.class)
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductInfoRepository repository;

    @Override
    public ProductInfo findOne(String id) {
        Optional<ProductInfo> productInfoOptional = repository.findById(id);

        return productInfoOptional.get();
    }

    @Override
    public List<ProductInfo> findUpAll() {

        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }

    @Override
    public void increaseStock(List<CartDTO> cartDTOList) {

    }

    @Override
    public void decreaseStock(List<CartDTO> cartDTOList) {

    }
}


