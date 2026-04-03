package com.alexc.ejercicios;

import java.util.List;

public final class ExerciseApp {

    private ExerciseApp() {
    }

    public static void main(String[] args) {
        System.out.println(buildWelcomeMessage());
    }

    static String buildWelcomeMessage() {
        List<String> weeks = List.of(
                "week01",
                "week02",
                "week03",
                "week04",
                "week05",
                "week06",
                "week07",
                "week08"
        );

        return "Proyecto base listo. Trabaja tus ejercicios en los paquetes: " + String.join(", ", weeks);
    }
}

