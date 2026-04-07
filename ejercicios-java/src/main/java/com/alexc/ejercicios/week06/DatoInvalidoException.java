package com.alexc.ejercicios.week06;

public class DatoInvalidoException extends Exception {

    public DatoInvalidoException(String message) {
        super(message);
    }

    public DatoInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }
}
