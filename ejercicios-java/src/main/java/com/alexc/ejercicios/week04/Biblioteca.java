package com.alexc.ejercicios.week04;

import java.util.Arrays;

public class Biblioteca {

    // TODO: usar composicion para almacenar varios libros.
    private Libro[] libros;
    private int contador;

    public Biblioteca() {
        this.libros = new Libro[100]; // Asumimos un máximo de 100 libros
        this.contador = 0;
    }

    public void agregarLibro(Libro libro) {
        if (contador < libros.length) {
            libros[contador] = libro;
            contador++;
        }
    }

    public Libro[] getLibros() {
        return Arrays.copyOf(libros, contador);
    }
}
