package com.alexc.ejercicios.week05;

import java.util.HashSet;
import java.util.Set;
public class EliminarDuplicadosSet {

    public static void main(String[] args) {
        // TODO: usar Set para eliminar elementos repetidos.
        String[] nombres = {"Juan", "María", "Pedro", "Juan", "Ana", "María"};

        Set<String> nombresSinDuplicados = new HashSet<>();
        for (String nombre : nombres) {
            nombresSinDuplicados.add(nombre);
        }
        System.out.println("Nombres sin duplicados: " + nombresSinDuplicados);
    }
}
