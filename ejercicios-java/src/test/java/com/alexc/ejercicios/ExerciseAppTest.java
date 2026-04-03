package com.alexc.ejercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ExerciseAppTest {

    @Test
    void welcomeMessageMentionsWeekPackages() {
        String message = ExerciseApp.buildWelcomeMessage();

        assertTrue(message.contains("week01"));
        assertTrue(message.contains("week08"));
    }
}

