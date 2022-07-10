package com.bjergsen.springbootmall.service;

import com.bjergsen.springbootmall.dto.CreateOrderRequest;
import com.bjergsen.springbootmall.dto.OrderQueryParams;
import com.bjergsen.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

}
