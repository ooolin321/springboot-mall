package com.bjergsen.springbootmall.service;

import com.bjergsen.springbootmall.dto.CreateOrderRequest;
import com.bjergsen.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

}
