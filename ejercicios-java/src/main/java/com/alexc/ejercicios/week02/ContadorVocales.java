package com.alexc.ejercicios.week02;

import java.util.Scanner;
public class ContadorVocales {

    public static void main(String[] args) {
        // TODO: pedir una palabra o frase corta y contar sus vocales.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra o frase corta: ");
        String entrada = scanner.nextLine();

        int contador = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < entrada.length(); i++) {
            if (vocales.indexOf(entrada.charAt(i)) != -1) {
                contador++;
            }
        }

        System.out.println("La palabra o frase '" + entrada + "' tiene " + contador + " vocales.");

        scanner.close();
    }
}
