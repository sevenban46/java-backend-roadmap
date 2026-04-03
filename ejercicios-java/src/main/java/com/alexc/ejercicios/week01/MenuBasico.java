package com.alexc.ejercicios.week01;

import java.util.Scanner;

public class MenuBasico {

    public static void main(String[] args) {
        // TODO: mostrar un menu simple con al menos tres opciones.
        Scanner miScanner = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("\n--- MENÚ SIMPLE ---");
            System.out.println("1. Calculadora básica");
            System.out.println("2. Conversor de Moneda");
            System.out.println("3. Conversor de Temperatura");
            System.out.println("4. Mayor de dos Numeros");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion (1-5): ");
            opcion = miScanner.nextInt();
            System.out.println("****************************");

            switch(opcion){
            case 1:
                System.out.println("Bienvenido a la Calculadora Basica");
                break;
            case 2:
                System.out.println("Bienvenido a la Conversor de Moneda");
                break;
            case 3:
                System.out.println("Bienvenido a la Conversor de Temperatura");
                break;
            case 4:
                System.out.println("Bienvenido al Mayor de dos Numeros");
                break;
            case 5:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opcion no encontrada!.Intenta de nuevo");
            }
            /*if (opcion == 1) {
                System.out.println("Bienvenido a la Calculadora Basica");
            }else if(opcion == 2){
                System.out.println("Bienvenido a la Conversor de Moneda");
            }else if(opcion == 3){
                System.out.println("Bienvenido a la Conversor de Temperatura");
            }else if(opcion ==4){
                System.out.println("Bienvenido al Mayor de dos Numeros");
            }else if(opcion ==5){
                System.out.println("Saliendo del programa");
            }else{
                System.out.println("Opcion no encontrada!.Intenta de nuevo");
            }*/
        }while(opcion != 5);

        miScanner.close();
    }
}
