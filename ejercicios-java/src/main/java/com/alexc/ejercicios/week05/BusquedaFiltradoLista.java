package com.alexc.ejercicios.week05;

import java.util.Scanner;
public class BusquedaFiltradoLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: buscar y filtrar datos dentro de una lista.
        String[] nombres = {"Alice", "Bob", "Charlie", "David", "Eve"};
        System.out.print("Ingrese el nombre a buscar: ");
        String nombreBuscado = scanner.nextLine();
        boolean encontrado = false;

        for (String nombre : nombres) {
            if (nombre.equals(nombreBuscado)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Nombre encontrado.");
        } else {
            System.out.println("Nombre no encontrado.");
        }
    }
}
