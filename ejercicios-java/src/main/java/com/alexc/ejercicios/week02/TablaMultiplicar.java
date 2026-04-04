package com.alexc.ejercicios.week02;

import java.util.Scanner;
public class TablaMultiplicar {

    public static void main(String[] args) {
        // TODO: pedir un numero e imprimir su tabla de multiplicar.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}
