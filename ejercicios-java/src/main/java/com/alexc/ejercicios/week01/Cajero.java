package com.alexc.ejercicios.week01;

import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        int saldoInicial = 1000;
        final int MONTO_MAX = 500;
        final int MONTO_MIN = 5;
        final String[] billeteDisponible = { "$5", "$10", "$20" };
        int montoRetirar = 0;
        String respuesta = "n";
        int intentos = 0;
        String nombreUsuario = "Alex";
        String contrasenaUsuario = "1234";
        Scanner scanner = new Scanner(System.in);

        boolean accesoConcedido = false;

        System.out.println("Bienvenido al cajero CSC Bank");

        System.out.print("Ingrese su nombre de usuario: ");
        String nombreIngresado = scanner.next();
        System.out.print("Ingrese su contraseña: ");
        String contrasenaIngresada = scanner.next();

        do {
            if (nombreIngresado.equals(nombreUsuario) && contrasenaIngresada.equals(contrasenaUsuario)) {
                accesoConcedido = true;
                break;
            } else {
                intentos++;
                System.out.println("Error: Nombre de usuario o contraseña incorrectos. Intento " + intentos + " de 3.");
                if (intentos >= 3) {
                    System.out.println("Demasiados intentos fallidos. Acceso bloqueado.");
                    scanner.close();
                    return;
                }
                System.out.print("Ingrese su nombre de usuario: ");
                nombreIngresado = scanner.next();
                System.out.print("Ingrese su contraseña: ");
                contrasenaIngresada = scanner.next();
            }
        } while (true);

        if (accesoConcedido == true) {
            System.out.println("Acceso exitoso. Bienvenido " + nombreUsuario + "!");
            do {
                System.out.print("\nBienvenido " + nombreUsuario + "! Puedes retirar dinero de tu cuenta.");
                System.out.println("\n--- Nueva Operación ---");
                System.out.println("Los billetes disponibles son: " + String.join(", ", billeteDisponible));
                System.out.println("Su saldo inicial es: $" + saldoInicial);
                System.out.print("Ingrese el monto a retirar: ");
                montoRetirar = scanner.nextInt();

                while (montoRetirar < MONTO_MIN || montoRetirar > saldoInicial || montoRetirar > MONTO_MAX
                        || montoRetirar % 5 != 0) {

                    if (montoRetirar > saldoInicial) {
                        System.out.println("Error: Fondos insuficientes. Su saldo es " + saldoInicial);
                    } else if (montoRetirar > MONTO_MAX) {
                        System.out.println("Error: El monto máximo es $" + MONTO_MAX);
                    } else if (montoRetirar < MONTO_MIN) {
                        System.out.println("Error: El monto mínimo es $" + MONTO_MIN);
                    } else if (montoRetirar % 5 != 0) {
                        System.out.println("Error: El monto debe ser múltiplo de 5.");
                    }
                    System.out.print("Ingrese un monto válido: $");
                    montoRetirar = scanner.nextInt();
                }
                saldoInicial -= montoRetirar;
                System.out.println("Has retirado: $" + montoRetirar);
                System.out.println("Tu saldo actual es: $" + saldoInicial);

                if (saldoInicial < MONTO_MIN) {
                    System.out.println("Saldo insuficiente para más operaciones.");
                    respuesta = "n";
                } else {
                    System.out.print("\n¿Desea realizar otra operación? (s/n): ");
                    respuesta = scanner.next();
                }
            } while (respuesta.equalsIgnoreCase("s"));

            scanner.close();
        } else {
            System.out.println("Acceso denegado. Nombre de usuario o contraseña incorrectos.");
        }
    }
}
