package com.alexc.ejercicios.week03;

public class Empleado {

    // TODO: agregar atributos privados: nombre, cargo y salario.
    private String nombre;
    private String cargo;
    private double salario;

    // TODO: crear un metodo para aplicar aumento salarial.
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aplicarAumento(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    public void mostrarInformacion() {
        System.out.println("Empleado: " + this.nombre);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salario: $" + this.salario);
    }
}
