package com.company.ejercicio2;

public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;

    public Persona(){
    }

    public Persona(int dni, String nombre, String apellido, String email, String direccion){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.direccion=direccion;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    @Override
    public String toString() {
        return ("\nDNI: " + this.dni +
                "\nNombre: " + this. nombre +
                "\nApellido: " + this.apellido +
                "\nEmail: " + this.email +
                "\nDireccion: " + this.direccion);
    }
}
