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

    /**
     * Deposita dinero en la cuenta.
     * @param cantidad La cantidad a depositar.
     */
    public void depositar(double cantidad) {
        this.saldo += cantidad;
    }

    /**
     * Retira dinero de la cuenta.
     * @param cantidad La cantidad a retirar.
     */
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
