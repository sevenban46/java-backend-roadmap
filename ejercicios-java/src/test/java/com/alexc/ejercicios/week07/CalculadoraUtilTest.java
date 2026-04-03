package com.alexc.ejercicios.week07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraUtilTest {

    private final CalculadoraUtil calculadoraUtil = new CalculadoraUtil();

    @Test
    void sumarRetornaResultadoEsperado() {
        assertEquals(7, calculadoraUtil.sumar(3, 4));
    }

    @Test
    void restarRetornaResultadoEsperado() {
        assertEquals(2, calculadoraUtil.restar(5, 3));
    }

    @Test
    void multiplicarRetornaResultadoEsperado() {
        assertEquals(15, calculadoraUtil.multiplicar(3, 5));
    }
}
