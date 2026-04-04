package com.alexc.ejercicios.week02;

import java.util.Scanner;
public class FactorialConMetodo {

    public static void main(String[] args) {
        // TODO: pedir un numero y calcular su factorial usando un metodo.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        long factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);

        scanner.close();
    }

    /* Método para calcular el factorial de un número 
        * El factorial de un número n se define como n! = n * (n-1)! con 0! = 1
    */
    public static long calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }
}
