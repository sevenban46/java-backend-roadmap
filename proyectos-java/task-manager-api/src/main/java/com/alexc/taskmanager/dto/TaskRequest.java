package com.alexc.taskmanager.dto;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record TaskRequest(
        @NotBlank(message = "El titulo es obligatorio")
        @Size(max = 120, message = "El titulo no puede superar 120 caracteres")
        String title,
        @Size(max = 500, message = "La descripcion no puede superar 500 caracteres")
        String description,
        @NotNull(message = "El estado es obligatorio")
        String status,
        @FutureOrPresent(message = "La fecha limite no puede estar en el pasado")
        LocalDate dueDate,
        @NotNull(message = "El usuario es obligatorio")
        Long userId
) {
}

