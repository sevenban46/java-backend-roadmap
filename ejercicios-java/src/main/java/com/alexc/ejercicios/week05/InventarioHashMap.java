package com.alexc.ejercicios.week05;

import java.util.HashMap;
public class InventarioHashMap {

    public static void main(String[] args) {
        // TODO: usar HashMap para relacionar producto con cantidad disponible.
        HashMap<String, Integer> inventario = new HashMap<>();
        inventario.put("Manzanas", 50);
        inventario.put("Naranjas", 30);
        inventario.put("Plátanos", 20);
        // Imprimir el inventario
        System.out.println("Inventario:");
        for (String producto : inventario.keySet()) {
            System.out.println(producto + ": " + inventario.get(producto) + " unidades");
        }
    }
}
