package com.alexc.ejercicios.week03;

public class CuentaBancaria {

    // TODO: agregar atributos privados como titular y saldo.
    private String titular;
    private double saldo;

    // TODO: crear metodos depositar, retirar y mostrarSaldo.
    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        this.saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo de " + this.titular + ": $" + this.saldo);
    }

}
