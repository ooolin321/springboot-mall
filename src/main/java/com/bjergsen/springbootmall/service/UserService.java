package com.bjergsen.springbootmall.service;

import com.bjergsen.springbootmall.dto.UserLoginRequest;
import com.bjergsen.springbootmall.dto.UserRegisterRequest;
import com.bjergsen.springbootmall.model.User;

public interface UserService {
    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);
    User login(UserLoginRequest userLoginRequest);
}
