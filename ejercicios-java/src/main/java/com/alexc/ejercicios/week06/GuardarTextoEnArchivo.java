package com.alexc.ejercicios.week06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class GuardarTextoEnArchivo {

    public static void main(String[] args) {
        // TODO: guardar datos simples en un archivo de texto.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el texto que desea guardar en el archivo: ");
        String texto = scanner.nextLine();
        scanner.close();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("texto_guardado.txt"))) {
            writer.write(texto);
            System.out.println("Texto guardado en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al guardar el texto en el archivo.");
        }
    }
}
