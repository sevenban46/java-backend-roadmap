package com.alexc.ejercicios.week02;

import java.util.Scanner;
public class PromedioArreglo {

    public static void main(String[] args) {
        // TODO: llenar un arreglo de numeros y calcular su promedio.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();

        // Validar que el tamaño del arreglo sea mayor que 0
        if (n <= 0) {
            System.out.println("El tamaño del arreglo debe ser un número positivo.");
            scanner.close();
            return;
        }

        // Crear el arreglo y calcular la suma de sus elementos
        int[] arreglo = new int[n];
        int suma = 0;

        // Llenar el arreglo con los números ingresados por el usuario
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
            suma += arreglo[i];
        }

        // Calcular el promedio y mostrar el resultado
        double promedio = (double) suma / n;
        System.out.println("El promedio del arreglo es: " + promedio);

        scanner.close();
    }
}
