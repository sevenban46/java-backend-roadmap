package com.alexc.ejercicios.week01;

import java.util.Scanner;

public class CalculadoraBasica {

	public static void main(String[] args) {
		// TODO: pedir dos numeros, pedir una operacion y mostrar el resultado.
		int valorUno, valorDos, resultado=0;

		Scanner miScanner = new Scanner(System.in);
		int opcion;

		do{
			System.out.println("\n--- MENÚ DE CALCULADORA ---");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Residuo");
			System.out.println("6. Salir");
			System.out.print("Seleccione una opcion (1-6): ");
			opcion = miScanner.nextInt();
			System.out.println("****************************");
			
			if (opcion >= 1 && opcion <= 5) {
				System.out.print("Ingrese el primer valor: ");
				valorUno =  miScanner.nextInt();
				System.out.print("Ingrese el segundo valor: ");
				valorDos =  miScanner.nextInt();

				System.out.println("\n**///Resultado de Operación///**");
				switch(opcion){
				case 1:
					resultado = valorUno + valorDos;
					System.out.println("Suma: " + valorUno + " + "+ valorDos +" = " + resultado);
					break;
				case 2:
					resultado = valorUno - valorDos;
					System.out.println("Resta: "+ valorUno + " - "+ valorDos +" = " + resultado);
					break;
				case 3:
					resultado = valorUno * valorDos;
					System.out.println("Multiplicación: "+ valorUno + " x "+ valorDos +" = " + resultado);
					break;
				case 4:
					if(valorDos != 0){
						resultado = valorUno / valorDos;
						System.out.println("Division: " + valorUno + " / "+ valorDos +" = " + resultado);
					}else{
						System.out.println("No se puede dividir por Cero");
					}
					break;
				case 5:
					if(valorDos != 0){
						resultado = valorUno % valorDos;
						System.out.println("Residuo: " + valorUno + " % "+ valorDos +" = " + resultado);
					}else{
						System.out.println("No se puede calcular el residuo con divisor cero");
					}
					break;
				}
				System.out.print("***///**********************///***");
			}else if(opcion == 6){
				System.out.println("Saliendo del programa...");
			}else{
				System.out.println("Opción no válida!...");
			}
		}while(opcion != 6);

		miScanner.close();
	}
}
