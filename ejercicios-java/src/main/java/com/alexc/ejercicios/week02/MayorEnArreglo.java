package com.alexc.ejercicios.week02;

import java.util.Scanner;
public class MayorEnArreglo {

    public static void main(String[] args) {
        // TODO: cargar varios numeros en un arreglo y encontrar el mayor.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();

        // Validar que el tamaño del arreglo sea mayor que 0
        if (n <= 0) {
            System.out.println("El tamaño del arreglo debe ser un número positivo.");
            scanner.close();
            return;
        }

        // Crear un arreglo de enteros con el tamaño especificado por el usuario.
        int[] arreglo = new int[n];

        // Leer los elementos del arreglo desde el usuario y almacenarlos en el arreglo.
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        // Encontrar el mayor elemento en el arreglo
        int mayor = arreglo[0];
        for (int i = 1; i < n; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }

        // Mostrar el mayor elemento
        System.out.println("El mayor elemento en el arreglo es: " + mayor);

        scanner.close();
    }
}
