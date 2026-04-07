package com.alexc.ejercicios.week06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerTextoDesdeArchivo {

    public static void main(String[] args) {
        // TODO: leer datos desde archivo y mostrarlos en consola.
        try (BufferedReader reader = new BufferedReader(new FileReader("texto_guardado.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }
}
