package com.example.wei.service.impl;

import com.example.wei.dao.ProductDao;
import com.example.wei.dto.ProductRequest;
import com.example.wei.model.Product;
import com.example.wei.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }


    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
