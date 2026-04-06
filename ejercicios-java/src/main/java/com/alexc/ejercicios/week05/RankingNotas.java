package com.alexc.ejercicios.week05;

import com.alexc.ejercicios.week06.Nota;

public class RankingNotas {
    static class Nota {
        private String materia;
        private double valor;

        public Nota(String materia, double valor) {
            this.materia = materia;
            this.valor = valor;
        }

        public String getMateria() {
            return materia;
        }

        public double getValor() {
            return valor;
        }
    }
    
    public static void main(String[] args) {
        // TODO: cargar notas, ordenarlas y mostrar un ranking simple.
        Nota[] notas = {
                new Nota("Matemáticas", 8.5),
                new Nota("Historia", 7.0),
                new Nota("Ciencias", 9.0),
                new Nota("Literatura", 6.5)
        };
        // Ordenar las notas de mayor a menor
        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = 0; j < notas.length - i - 1; j++) {
                if (notas[j].getValor() < notas[j + 1].getValor()) {
                    // Intercambiar notas[j] y notas[j + 1]
                    Nota temp = notas[j];
                    notas[j] = notas[j + 1];
                    notas[j + 1] = temp;
                }
            }
        }
        // Mostrar el ranking
        System.out.println("Ranking de notas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println((i + 1) + ". " + notas[i].getMateria() + " - " + notas[i].getValor());
        }
    }


}