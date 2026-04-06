package com.alexc.ejercicios.week05;

import java.util.List;
import java.util.Map;
import java.util.Set;
public class RefactorColeccionesApp {

    public static void main(String[] args) {
        // TODO: refactorizar un ejercicio anterior para usar colecciones donde tenga sentido.
        List<String> estudiantes = List.of("Juan", "María", "Pedro", "Ana");
        System.out.println("Lista de estudiantes:");
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }
            Set<String> materias = Set.of("Matemáticas", "Historia", "Ciencias");
        System.out.println("\nMaterias disponibles:");
        for (String materia : materias) {
            System.out.println(materia);
        }
        Map<String, Integer> calificaciones = Map.of(
                "Juan", 85,
                "María", 92,
                "Pedro", 78,
                "Ana", 88
        );
        System.out.println("\nCalificaciones de los estudiantes:");
        for (Map.Entry<String, Integer> entry : calificaciones.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
