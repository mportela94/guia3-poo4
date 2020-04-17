package com.company.ejercicio1;

public class Cilindro extends Circulo{

    private double altura = 1.0;

    public Cilindro (){
        super();
    }

    public Cilindro(double radio, String color, double altura){
        super(radio, color);
        this.altura=altura;
    }

    public void setAltura(double altura){
        this.altura=altura;
    }

    public double getAltura(){
        return altura;
    }

    public double getVolumen(){
        double volumen;
        volumen=super.getArea()*altura;
        return volumen;
    }

    public void imprimirCilindro(){
        super.imprimirCirculo();
        System.out.println("Altura: "+ this.getAltura());
        System.out.println("Volumen: "+ this.getVolumen());
    }

    @Override
    public String toString() {
        return ("\nSubclase de: " + super.toString()+
                "\nAltura: " + getAltura());
    }

    @Override
    public double getArea(){
        double area;
        area=(2*Math.PI*Math.pow(this.getRadio(),2))+(2*Math.PI*this.getRadio()*this.getAltura());
        return area;
    }
}
