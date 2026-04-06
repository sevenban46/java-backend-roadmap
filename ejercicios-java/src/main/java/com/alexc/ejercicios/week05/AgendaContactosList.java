package com.alexc.ejercicios.week05;

import java.util.ArrayList;
public class AgendaContactosList {

    public static void main(String[] args) {
        // TODO: usar ArrayList para guardar, mostrar y buscar contactos.
        ArrayList<Contacto> contactos = new ArrayList<>();
        contactos.add(new Contacto("Alice", "123456789"));
        contactos.add(new Contacto("Bob", "987654321"));
        // Mostrar contactos
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
        // Buscar contacto por nombre
        String nombreBuscado = "Alice";
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombreBuscado)) {
                System.out.println("Contacto encontrado: " + contacto);
                break;  
            }
        }
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
