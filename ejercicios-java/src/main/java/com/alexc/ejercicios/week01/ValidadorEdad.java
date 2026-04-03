package com.alexc.ejercicios.week01;

import java.util.Scanner;

public class ValidadorEdad {

    public static void main(String[] args) {
        // TODO: pedir una edad y mostrar si la persona es mayor de edad.
        int edad;

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese una edad: ");
        edad = leer.nextInt();

        if(edad >= 18){
            System.out.println("Ud es mayor de edad...Sea Bienvenido!");
        }else if(edad > 0){
            System.out.println("Advertencia. Ud es menor de edad!...");
        }else{
            System.out.println("Error: Edad no válida");
        }
    }
}
