package com.company.ejercicio1;



public class Circulo {

    private double radio = 1.0;
    private String color = "Rojo";

    public Circulo(){
    }

    public Circulo(double radio, String color){
        this.radio=radio;
        this.color=color;
    }


    public void setRadio(double radio){
        this.radio=radio;
    }

    public double getRadio(){
        return radio;
    }

    public void setColor(String color){
        this.color=color;
    }

    public String getColor(){
        return color;
    }

    public double getAreaCirculo(){
        double area;
        area=Math.PI * Math.pow(radio, 2);
        return area;
    }

    public void imprimirCirculo(){
        System.out.println("Radio: "+ this.getRadio());
        System.out.println("Color: "+ this.getColor());
        System.out.println("Area: "+ getAreaCirculo());
    }

    @Override
    public String toString() {
        return ("Radio: " + this.getRadio()
                +"\nColor: " + this.getColor()
                + "\nArea: " + getAreaCirculo());
    }
}
