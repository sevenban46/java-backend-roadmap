package com.alexc.ejercicios.week05;

import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;
public class AgendaContactosList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean encontrado = false;
        // TODO: usar ArrayList para guardar, mostrar y buscar contactos.
        ArrayList<Contacto> contactos = new ArrayList<>();
        contactos.add(new Contacto("Alice", "123456789"));
        contactos.add(new Contacto("Bob", "987654321"));
        // Mostrar contactos
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
        // Buscar contacto por nombre
        System.out.print("Ingrese el nombre a buscar: ");
        String nombreBuscado = scanner.nextLine();
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombreBuscado)) {
                System.out.println("Contacto encontrado: " + contacto);
                encontrado = true;
                break;  
            }
        }

        if (!encontrado) {
            System.out.println("Contacto no encontrado.");
        }
        scanner.close();
    }
}

class Contacto {
    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
