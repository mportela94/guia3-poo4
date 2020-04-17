package com.company.ejercicio2;

public class Alumno extends Persona{
    private int añoIngreso;
    private String carrera;
    private float cuotaMensual;

    public Alumno(){}

    public Alumno(int dni, String nombre, String apellido, String email, String direccion, int añoIngreso, String carrera, float cuotaMensual){
        super(dni, nombre, apellido, email, direccion);
        this.añoIngreso=añoIngreso;
        this.carrera=carrera;
        this.cuotaMensual=cuotaMensual;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public float getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(float cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    @Override
    public String toString(){
        return (super.toString() +
                "\nAño de Ingreso: " + this.añoIngreso +
                "\nCarrera: " + this.carrera +
                "\nCuota Mensual: " + this.cuotaMensual);
    }

}
