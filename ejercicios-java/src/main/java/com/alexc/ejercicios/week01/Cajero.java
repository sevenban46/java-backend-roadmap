package com.alexc.ejercicios.week01;

import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        final int saldoInicial = 1000;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al cajero automático");
        System.out.println("Su saldo inicial es: " + saldoInicial);
        System.out.print("Ingrese el monto a retirar: ");
        int montoRetirar = scanner.nextInt();
        if (montoRetirar > saldoInicial) {
            System.out.println("Fondos insuficientes. No se puede realizar el retiro.");
        } else {
            int saldoFinal = saldoInicial - montoRetirar;
            System.out.println("Retiro exitoso. Su nuevo saldo es: " + saldoFinal);
        }
        scanner.close();
    }
}
