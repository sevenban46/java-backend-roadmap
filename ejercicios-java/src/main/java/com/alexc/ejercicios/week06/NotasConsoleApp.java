package com.alexc.ejercicios.week06;

public class NotasConsoleApp {

    public static void main(String[] args) {
        // TODO: conectar presentacion, servicio y persistencia en una app de consola.
        NotaService notaService = new NotaService();
        try {
            notaService.setNota(8.5);
            System.out.println("Nota ingresada: " + notaService.getNota());
        } catch (DatoInvalidoException e) {
            System.out.println("Error al ingresar la nota: " + e.getMessage());
        }

        //Pongamos a prueba el manejo de excepciones con una nota inválida
        try {
            notaService.setNota(12); // Esto debería lanzar una excepción
        } catch (DatoInvalidoException e) {
            System.out.println("Error al ingresar la nota: " + e.getMessage());
            System.out.println("--- Error detectado ---");
            e.printStackTrace();
        }

        //Y para finalizar, probemos con una nota negativa
        try {
            notaService.setNota(-3); // Esto también debería lanzar una excepción
        } catch (DatoInvalidoException e) {
            System.out.println("Error al ingresar la nota: " + e.getMessage());
            System.out.println("--- Error detectado ---");
            e.printStackTrace();
        }

    }
}
