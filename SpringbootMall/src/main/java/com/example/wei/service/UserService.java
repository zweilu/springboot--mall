package com.example.wei.service;

import com.example.wei.dto.UserRegisterRequest;
import com.example.wei.model.User;

public interface UserService {

    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);
}
