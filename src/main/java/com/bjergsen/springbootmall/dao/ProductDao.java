package com.bjergsen.springbootmall.dao;

import com.bjergsen.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
