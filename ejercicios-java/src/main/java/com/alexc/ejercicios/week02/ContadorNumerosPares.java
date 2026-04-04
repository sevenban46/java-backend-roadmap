package com.alexc.ejercicios.week02;

import java.util.Scanner;
public class ContadorNumerosPares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        System.out.println("Ingrese los números (ingrese 0 para terminar):");
        int numero;
        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();
            if (numero != 0 && numero % 2 == 0) {
                contador++;
            }
        } while (numero != 0);

        System.out.println("La cantidad de números pares ingresados es: " + contador);
        scanner.close();
    }
}
