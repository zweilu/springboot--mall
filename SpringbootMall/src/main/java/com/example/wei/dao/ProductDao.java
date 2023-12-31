package com.example.wei.dao;

import com.example.wei.constant.ProductCategory;
import com.example.wei.dto.ProductQueryParams;
import com.example.wei.dto.ProductRequest;
import com.example.wei.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);
    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);


    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
