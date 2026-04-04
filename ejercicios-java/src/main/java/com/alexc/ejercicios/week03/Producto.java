package com.alexc.ejercicios.week03;

public class Producto {
    // TODO: agregar atributos privados: nombre, precio y stock.
    private String nombre;
    private double precio;
    private int stock;

    // TODO: crear constructor, getters, setters y un metodo para actualizar stock.
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Método para actualizar el stock
    public void actualizarStock(int cantidad) {
        this.stock += cantidad;
    }
}
