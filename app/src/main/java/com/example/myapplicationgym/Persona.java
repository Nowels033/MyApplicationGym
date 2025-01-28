package com.example.myapplicationgym;

public class Persona {
    private String usuario;
    private String contrasena;
    private String nombre;
    private String apellido;
    private String correo;
    private double peso;
    private double estatura;

    public Persona(String usuario, String contrasena, String nombre, String apellido, String correo, double peso, double estatura) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.peso = peso;
        this.estatura = estatura;
    }

    public String getUsuario() {
        return usuario;
    }
    public String getContrasena() {return contrasena;}
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

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", peso=" + peso +
                ", estatura=" + estatura +
                '}';
    }
}
