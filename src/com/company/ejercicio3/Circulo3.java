package com.company.ejercicio3;

public class Circulo3 extends Figura{

    private double radio;

    public Circulo3(){
        this.radio=1.0;
    }

    public Circulo3(String color, double radio){
        super(color);
        this.radio=radio;
    }

    public void setRadio(){
        this.radio=radio;
    }

    public double getRadio(){
        return radio;
    }

    @Override
    public double getPerimetro() {
        double perimetro=0;
        perimetro =(2* Math.PI * this.radio);
        return perimetro;
    }

    @Override
    public double getArea(){
        double area;
        area= (Math.PI * Math.pow(this.radio, 2));
        return area;
    }

    @Override
    public String toString (){
        return ("\nCirculo: " +
                "\nColor: " + color +
                "\nRadio: " + radio);
    }

}
