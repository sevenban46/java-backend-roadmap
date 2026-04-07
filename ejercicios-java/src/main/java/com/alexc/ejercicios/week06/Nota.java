package com.alexc.ejercicios.week06;

public class Nota {

    // TODO: agregar atributos privados como nombreMateria y valor.
    private String nombreMateria;
    private double valor;

    // TODO: agregar constructor
    public Nota(String nombreMateria, double valor) {
        this.nombreMateria = nombreMateria;
        this.valor = valor;
    }

    // TODO: agregar métodos getter y setter
    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
