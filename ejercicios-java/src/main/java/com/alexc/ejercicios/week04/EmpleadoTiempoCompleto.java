package com.alexc.ejercicios.week04;

public class EmpleadoTiempoCompleto extends EmpleadoBase {
    // TODO: agregar atributos y comportamiento especifico para tiempo completo.
    private double salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, String apellido, String dui, double salarioMensual) {
        super(nombre, apellido, dui);
        this.salarioMensual = salarioMensual;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public double calcularPago() {
        return salarioMensual;
    }

    public void mostrarResumen() {
        System.out.println("Empleado de tiempo completo:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("DUI: " + getDui());
        System.out.println("Salario mensual: " + getSalarioMensual());
    }

}
