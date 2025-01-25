package com.example.myapplicationgym;

public class Persona {
    private String nombre;
    private String apellido;
    private String correo;
    private double peso;
    private double estatura;

    public Persona(String nombre, String apellido, String correo, double peso, double estatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.peso = peso;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public double getPeso() {
        return peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public double calcularIMC() {
        return peso / (estatura * estatura);
    }
}
