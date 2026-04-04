package com.alexc.ejercicios.week03;

public class Estudiante {

    // TODO: agregar atributos privados: nombre, edad y promedio.
    private String nombre;
    private int edad;
    private double promedio;
    
    // TODO: crear constructor, getters, setters y un metodo para mostrar resumen.
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    // Método para mostrar resumen
    public void mostrarResumen() {
        System.out.println("Estudiante: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Promedio: " + this.promedio);
    }
}
