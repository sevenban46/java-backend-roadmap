package com.alexc.ejercicios.week01;

import java.util.Scanner;

public class PromedioNotas {

    public static void main(String[] args) {
        // TODO: pedir tres notas y calcular el promedio.
        double nota1, nota2, nota3, promedio;
        Scanner leer = new Scanner(System.in);

        System.out.println("///###Registro de nota###///");
        System.out.print("Ingrese la primer Nota:");
        nota1 = leer.nextDouble();
        System.out.print("Ingrese la segunda Nota:");
        nota2 = leer.nextDouble();
        System.out.print("Ingrese la tercer Nota:");
        nota3 = leer.nextDouble();

        promedio = (nota1 + nota2 + nota3)/3;
        System.out.println("\nEl promedio es de :"+ promedio);
    }
}
