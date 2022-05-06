package com.bjergsen.springbootmall.service;

import com.bjergsen.springbootmall.model.Product;
import org.springframework.stereotype.Component;

public interface ProductService {
    Product getProductById(Integer productId);
}
