package com.example.hrms.service;

import com.example.hrms.entity.User;

public interface UserService {
    User registerUser(User user);
    String loginUser(String email, String password);
}
