package com.alexc.ejercicios.week04;

public class EmpleadoPorHora extends EmpleadoBase {
    // TODO: agregar atributos y comportamiento especifico para pago por hora.
    private double tarifaHora;
    private double horasTrabajadas;
    
    public EmpleadoPorHora(String nombre, String apellido, String dui, double tarifaHora, double horasTrabajadas) {
        super(nombre, apellido, dui);
        this.tarifaHora = tarifaHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double calcularPago() {
        return tarifaHora * horasTrabajadas;
    }

    public void mostrarResumen() {
        System.out.println("Empleado por hora:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("DUI: " + getDui());
        System.out.println("Tarifa por hora: " + getTarifaHora());
        System.out.println("Horas trabajadas: " + getHorasTrabajadas());
        System.out.println("Pago total: " + calcularPago());
    }
}
