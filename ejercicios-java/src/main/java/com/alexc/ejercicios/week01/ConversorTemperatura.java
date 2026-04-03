package com.alexc.ejercicios.week01;

import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        // TODO: pedir grados Celsius y convertirlos a Fahrenheit.
        double celsius, fahrenheit;
        final double FACTOR = 1.8;
        final int OFFSET = 32;

        Scanner leer = new Scanner(System.in);
        System.out.println("\n<***///CONVERSOR DE TEMPERATURA///***>");
        System.out.print("Ingrese los grados celsius a convertir: ");
        celsius = leer.nextDouble();

        fahrenheit = (celsius * FACTOR)+OFFSET;

        System.out.println("\n###***MOSTRANDO EL RESULTADO***###");
        System.out.println("Conversion es: "+ fahrenheit + "Fahrenheit");
    }
}
