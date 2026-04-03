package com.alexc.ejercicios.week01;

import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        final int saldoInicial = 1000;
        final int montoMaximo = 500;
        final int montoMinimo = 5;
        final String[] billeteDisponible = { "$5", "$10", "$20" };
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al cajero automático");
        System.out.println("Los billetes disponibles son: " + String.join(", ", billeteDisponible));
        System.out.println("Su saldo inicial es: " + saldoInicial);
        System.out.print("Ingrese el monto a retirar: ");
        int montoRetirar = scanner.nextInt();

        while (montoRetirar < montoMinimo || montoRetirar > saldoInicial || montoRetirar > montoMaximo
                || montoRetirar % 5 != 0) {
            if (montoRetirar > saldoInicial) {
                System.out.println("Error: Fondos insuficientes. Su saldo es " + saldoInicial);
            } else if (montoRetirar > montoMaximo) {
                System.out.println("Error: El monto máximo es " + montoMaximo);
            } else if (montoRetirar < montoMinimo) {
                System.out.println("Error: El monto mínimo es " + montoMinimo);
            } else if (montoRetirar % 5 != 0) {
                System.out.println("Error: El monto debe ser múltiplo de 5.");
            }
            System.out.print("Ingrese un monto válido: ");
            montoRetirar = scanner.nextInt();
        }
        int saldoFinal = saldoInicial - montoRetirar;
        System.out.println("Retiro exitoso. Su nuevo saldo es: " + saldoFinal);

        scanner.close();
    }
}
