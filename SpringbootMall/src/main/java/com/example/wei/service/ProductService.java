package com.example.wei.service;

import com.example.wei.model.Product;
import org.springframework.stereotype.Component;

@Component
public interface ProductService {
    Product getProductById(Integer productId);
}
