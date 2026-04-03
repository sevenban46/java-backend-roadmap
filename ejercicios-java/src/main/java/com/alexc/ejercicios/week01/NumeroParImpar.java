package com.alexc.ejercicios.week01;

import java.util.Scanner;

public class NumeroParImpar {

    public static void main(String[] args) {
        // TODO: pedir un numero y mostrar si es par o impar.
        int numero;
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un numero:");
        numero = leer.nextInt();

        if(numero % 2 == 0){
            System.out.println("Es un numero Par");
        }else{
            System.out.println("Es un numero Impar");
        }
        leer.close();
    }
}
