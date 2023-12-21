package com.example.wei.dao;

import com.example.wei.dto.ProductRequest;
import com.example.wei.model.Product;
import org.springframework.stereotype.Component;

@Component
public interface ProductDao {

    Product getProductById(Integer productId);


    Integer createProduct(ProductRequest productRequest);
}
