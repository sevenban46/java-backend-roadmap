package com.alexc.ejercicios.week07;

public class CalculadoraUtil {

    public int sumar(int primerValor, int segundoValor) {
        return primerValor + segundoValor;
    }

    public int restar(int primerValor, int segundoValor) {
        return primerValor - segundoValor;
    }

    public int multiplicar(int primerValor, int segundoValor) {
        return primerValor * segundoValor;
    }
    
    public int dividir(int primerValor, int segundoValor) {
        if (segundoValor == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return primerValor / segundoValor;
    }
}
