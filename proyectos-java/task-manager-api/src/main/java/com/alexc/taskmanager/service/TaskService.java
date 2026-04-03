package com.alexc.taskmanager.service;

import com.alexc.taskmanager.dto.TaskRequest;
import com.alexc.taskmanager.dto.TaskResponse;

import java.util.List;

public interface TaskService {

    TaskResponse create(TaskRequest request);

    List<TaskResponse> findAll();

    TaskResponse findById(Long id);

    TaskResponse update(Long id, TaskRequest request);

    void delete(Long id);

    List<TaskResponse> findByUserId(Long userId);
}

