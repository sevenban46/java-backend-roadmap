package com.alexc.ejercicios.week01;
import java.util.Scanner;

public class MayorDeDosNumeros {

    public static void main(String[] args) {
        // TODO: pedir dos numeros y mostrar cual es mayor.
        int numUno, numDos;
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        numUno = leer.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        numDos = leer.nextInt();

        if(numUno > numDos){
            System.out.println("El Primer numero es mayor");
        }else if(numUno < numDos){
            System.out.println("El Segundo numero es mayor");
        }else{
            System.out.println("Ambos números son iguales");
        }

        leer.close();
    }
}
