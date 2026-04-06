package com.alexc.ejercicios.week04;

public class Libro {

    // TODO: agregar atributos como titulo, autor y disponibilidad.
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }
    
    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("Has prestado el libro: " + titulo);
        } else {
            System.out.println("El libro " + titulo + " no está disponible.");
        }
    }

    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("Has devuelto el libro: " + titulo);
        } else {
            System.out.println("El libro " + titulo + " ya está disponible.");
        }
    }

    
}
