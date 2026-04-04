package com.alexc.ejercicios.week02;

import java.util.Scanner;
public class BuscarElemento {

    public static void main(String[] args) {
        // TODO: buscar si un elemento existe dentro de un arreglo.
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

        // Pedir al usuario el elemento a buscar
        System.out.print("Ingrese el elemento a buscar: ");
        int elementoABuscar = scanner.nextInt();

        // Buscar el elemento en el arreglo
        boolean encontrado = false;
        for (int i = 0; i < n; i++) {
            if (arreglo[i] == elementoABuscar) {
                encontrado = true;
                break;
            }
        }

        // Mostrar el resultado de la búsqueda
        if (encontrado) {
            System.out.println("El elemento " + elementoABuscar + " existe en el arreglo.");
        } else {
            System.out.println("El elemento " + elementoABuscar + " no existe en el arreglo.");
        }

        scanner.close();
    }
}
