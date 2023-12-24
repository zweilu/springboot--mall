package com.example.wei.service.impl;

import com.example.wei.constant.ProductCategory;
import com.example.wei.dao.ProductDao;
import com.example.wei.dto.ProductRequest;
import com.example.wei.model.Product;
import com.example.wei.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getProducts(ProductCategory category,String search) {
        return productDao.getProducts(category,search);
    }

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }


    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest) {
        productDao.updateProduct(productId,productRequest);
    }

    @Override
    public void deleteProductById(Integer productId) {
        productDao.deleteProductById(productId);
    }
}
