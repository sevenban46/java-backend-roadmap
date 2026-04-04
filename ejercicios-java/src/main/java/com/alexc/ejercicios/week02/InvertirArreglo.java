package com.alexc.ejercicios.week02;

import java.util.Scanner;
public class InvertirArreglo {

    public static void main(String[] args) {
        // TODO: invertir el orden de los elementos de un arreglo.
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el tamaño del arreglo y luego crear un arreglo de ese tamaño.
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

        // Leer los elementos del arreglo desde el usuario y almacenarlos en el arreglo original 
        // y luego invertir el orden de los elementos.
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        // Invertir el orden de los elementos
        for (int i = 0; i < n / 2; i++) {
            int temp = arreglo[i];
            arreglo[i] = arreglo[n - 1 - i];
            arreglo[n - 1 - i] = temp;
        }

        // Mostrar el arreglo invertido
        System.out.println("El arreglo invertido es:");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }

        scanner.close();
    }
}
