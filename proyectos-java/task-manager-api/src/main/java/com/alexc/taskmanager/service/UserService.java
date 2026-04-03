package com.alexc.taskmanager.service;

import com.alexc.taskmanager.dto.UserRequest;
import com.alexc.taskmanager.dto.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse create(UserRequest request);

    List<UserResponse> findAll();

    UserResponse findById(Long id);
}

