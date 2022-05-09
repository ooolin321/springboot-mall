package com.bjergsen.springbootmall.dao;

import com.bjergsen.springbootmall.constant.ProductCategory;
import com.bjergsen.springbootmall.dto.ProductRequest;
import com.bjergsen.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getProducts(ProductCategory category,String search);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId,ProductRequest productRequest);
    void deleteProductById(Integer productId);
}
