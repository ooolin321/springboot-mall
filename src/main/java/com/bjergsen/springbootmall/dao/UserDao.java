package com.bjergsen.springbootmall.dao;

import com.bjergsen.springbootmall.dto.UserRegisterRequest;
import com.bjergsen.springbootmall.model.User;

public interface UserDao {
    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
