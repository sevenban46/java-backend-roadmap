package com.alexc.ejercicios.week06;

public class NotaService {

    // TODO: crear la logica de negocio que valide y procese notas.
    private double nota;
    public void setNota(double nota) throws DatoInvalidoException {
        if (nota < 0 || nota > 10) {
            throw new DatoInvalidoException("La nota debe estar entre 0 y 10.", new IllegalArgumentException("Valor de nota inválido: " + nota));
        }
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }
}
