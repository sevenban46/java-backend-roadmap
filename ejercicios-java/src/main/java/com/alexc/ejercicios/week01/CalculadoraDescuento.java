package com.alexc.ejercicios.week01;

import java.util.Scanner;

public class CalculadoraDescuento {

    public static void main(String[] args) {
        // TODO: pedir precio y porcentaje de descuento, luego mostrar el total.
        double precio,total,descuento,porcentaje;
        boolean bandera = false;
        Scanner leer = new Scanner(System.in);

        do{
            System.out.println("///***Descuento de producto***///");
            System.out.print("Ingrese el precio del producto : $");
            precio = leer.nextDouble();
            System.out.print("Ingrese el porcentaje de descuento: %");
            porcentaje = leer.nextDouble();

            descuento = precio * (porcentaje / 100);

            total = precio - descuento;
            System.out.println("Descuento aplicado: $" + descuento);
            System.out.println("Precio final de producto: $"+ total);

            System.out.print("Ingrese '1' para continuar o '0' para salir!: ");
            int respuesta = leer.nextInt();

            if (respuesta == 0) {
                bandera = true;
                System.out.println("Saliendo del programa!...");
            }
        }while(bandera != true);
    }
}
