package com.alexc.ejercicios.week02;

import java.util.Scanner;
public class MatrizTresPorTres {

    public static void main(String[] args) {
        // TODO: crear e imprimir una matriz 3x3.
        Scanner scanner = new Scanner(System.in);

        // Crear una matriz 3x3
        int[][] matriz = new int[3][3];

        // Leer los elementos de la matriz desde el usuario
        System.out.println("Ingrese los elementos de la matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Imprimir la matriz
        System.out.println("La matriz 3x3 es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
