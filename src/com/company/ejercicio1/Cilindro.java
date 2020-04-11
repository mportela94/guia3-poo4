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
        volumen=super.getAreaCirculo()*altura;
        return volumen;
    }

    public void imprimirCilindro(){
        super.imprimirCirculo();
        System.out.println("Altura: "+ this.getAltura());
        System.out.println("Volumen: "+ this.getVolumen());
    }

    @Override
    public String toString() {
        return (super.toString()+
                "\nAltura: " + getAltura() +
                "\nVolumen: " + getVolumen());
    }
}
