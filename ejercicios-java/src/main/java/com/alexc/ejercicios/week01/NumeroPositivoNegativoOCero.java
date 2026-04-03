package com.alexc.ejercicios.week01;

import java.util.Scanner;

public class NumeroPositivoNegativoOCero {

    public static void main(String[] args) {
        // TODO: pedir un numero y mostrar si es positivo, negativo o cero.
        int numero;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero:");
        numero = leer.nextInt();

        if(numero > 0){
            System.out.println("Es Positivo");
        }else if(numero < 0){
            System.out.println("Es Negativo");
        }else{
            System.out.println("Es un Cero");
        }
        leer.close();
    }
}
