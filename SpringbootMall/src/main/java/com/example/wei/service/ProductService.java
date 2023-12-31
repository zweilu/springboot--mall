package com.example.wei.service;

import com.example.wei.dao.ProductDao;
import com.example.wei.dto.ProductQueryParams;
import com.example.wei.dto.ProductRequest;
import com.example.wei.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductService {

    Integer countProduct(ProductQueryParams productQueryParams);
    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void deleteProductById(Integer productId);


    @Component
    class ProductServiceImpl implements ProductService {

        @Autowired
        private ProductDao productDao;

        @Override
        public Integer countProduct(ProductQueryParams productQueryParams) {
            return productDao.countProduct(productQueryParams);
        }

        @Override
        public List<Product> getProducts(ProductQueryParams productQueryParams) {
            return productDao.getProducts(productQueryParams);
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
}
