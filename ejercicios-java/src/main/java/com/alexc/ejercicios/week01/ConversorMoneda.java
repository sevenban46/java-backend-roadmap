package com.alexc.ejercicios.week01;

import java.util.Scanner;

public class ConversorMoneda {

    public static void main(String[] args) {
        // TODO: pedir una cantidad y convertirla usando una tasa fija.
        final double TASA_CONVERSION = 0.866446;
        double dolares, euros;

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cantidad en USD: ");
        dolares = leer.nextDouble();

        euros = dolares * TASA_CONVERSION;

        System.out.printf("%.2f USD equivalen a %.2f EUR%n", dolares, euros);

        leer.close();
    }
}
