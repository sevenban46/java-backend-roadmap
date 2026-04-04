package com.alexc.ejercicios.week02;

import java.util.Scanner;
public class SumaPrimerosNNumeros {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO: pedir N y sumar los primeros N numeros usando un ciclo.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número N: ");
        int n = scanner.nextInt();

        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        System.out.println("La suma de los primeros " + n + " números es: " + suma);

        scanner.close();
    }
}