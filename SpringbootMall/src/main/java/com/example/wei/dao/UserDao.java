package com.example.wei.dao;

import com.example.wei.dto.UserRegisterRequest;
import com.example.wei.model.User;

public interface UserDao {

    User getUserById(Integer userId);
    Integer createUser(UserRegisterRequest userRegisterRequest);
}
