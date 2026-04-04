package com.alexc.ejercicios.week03;

import java.util.Scanner;

public class SistemaGestionConsola {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: crear un mini sistema que use al menos tres clases de esta semana.
        Producto producto = new Producto("Laptop", 1500.0, 10);
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 1000.0);
        Empleado empleado = new Empleado("María García", "Desarrollador", 3000.0);
        Estudiante estudiante = new Estudiante("Carlos López", 20, 8.5);

        cuenta.depositar(500.0);
        cuenta.retirar(200.0);
        cuenta.mostrarSaldo();

        empleado.aplicarAumento(10.0);
        empleado.mostrarInformacion();

        estudiante.mostrarResumen();

        producto.actualizarStock(-2);
        System.out.println("Producto: " + producto.getNombre() + ", Precio: " + producto.getPrecio() + ", Stock: " + producto.getStock());
    }
}

