package com.alexc.ejercicios.week04;

public class GestorBibliotecaConsola {

    public static void main(String[] args) {
        // TODO: crear un proyecto pequeno de consola usando herencia, interfaz y composicion.
        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", true);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", true);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        libro1.prestar();
        libro1.prestar();
        libro1.devolver();
        libro2.devolver();

    }
}
