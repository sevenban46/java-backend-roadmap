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

    // Agrega más pruebas unitarias según sea necesario
    @Test
    void dividirRetornaResultadoEsperado() {
        assertEquals(2, calculadoraUtil.dividir(10, 5));
    }

    @Test
    void dividirLanzaIllegalArgumentExceptionCuandoSegundoValorEsCero() {
        IllegalArgumentException exception = org.junit.jupiter.api.Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> calculadoraUtil.dividir(10, 0)
        );
        assertEquals("No se puede dividir por cero", exception.getMessage());
    }

}
