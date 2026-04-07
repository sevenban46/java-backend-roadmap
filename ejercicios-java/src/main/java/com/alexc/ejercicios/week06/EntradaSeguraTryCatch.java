package com.alexc.ejercicios.week06;

import java.util.Scanner;
public class EntradaSeguraTryCatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: capturar una entrada invalida sin cerrar el programa.

        while (true) {
            System.out.print("Ingrese un numero entero: ");
            try {
                int numero = scanner.nextInt();
                System.out.println("El numero ingresado es: " + numero);
                break; // Salir del bucle si la entrada es válida
            } catch (Exception e) {
                System.out.println("Entrada invalida. Por favor, ingrese un numero entero.");
                scanner.nextLine(); // Limpiar el buffer de entrada
            }
        }

        scanner.close(); // Cerrar el scanner después de cada intento
    }
}
