package com.company.ejercicio3;

public class Rectangulo extends Figura {

    protected double base;
    protected double alto;

    public Rectangulo (){
        this.base=1.0;
        this.alto=1.0;
    }

    public Rectangulo (String color, double ancho, double alto){
        super(color);
        this.base=ancho;
        this.alto=alto;
    }

    public void setBase(double base){
        this.base=base;
    }
    public double getBase(){
        return base;
    }
    public void setAlto(double alto){
        this.alto=alto;
    }
    public double getAlto(){
        return alto;
    }

    @Override
    public double getPerimetro(){
        double perimetro= getAlto() + getBase();
        return perimetro;
    }

    @Override
    public double getArea(){
        double area = getAlto() * getBase();
        return area;
    }

    @Override
    public String toString(){
        return ("\nRectangulo:" +
                "\nAncho: " + getBase() +
                "\nAlto: " + getAlto());
    }

}
