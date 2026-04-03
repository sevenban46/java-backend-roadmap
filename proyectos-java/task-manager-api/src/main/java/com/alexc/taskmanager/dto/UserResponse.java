package com.alexc.taskmanager.dto;

public record UserResponse(
        Long id,
        String name,
        String email
) {
}

