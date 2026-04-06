package com.alexc.ejercicios.week04;

public class EmpleadoBase {

    // TODO: convertir esta clase en la base de una jerarquia de empleados.
    private String nombre;
    private String apellido;
    private String dui;

    public EmpleadoBase(String nombre, String apellido, String dui) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dui = dui;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDui() {
        return dui;
    }

}
