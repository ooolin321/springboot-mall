package com.bjergsen.springbootmall.dao;

import com.bjergsen.springbootmall.dto.ProductRequest;
import com.bjergsen.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId,ProductRequest productRequest);
}
