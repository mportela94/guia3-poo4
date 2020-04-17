package com.company.ejercicio3;

public class Cuadrado extends Rectangulo {

    public Cuadrado(){}
    public Cuadrado (String color, double base){
        super(color, base, base);
    }

    @Override
    public String toString(){
        return ("\nCirculo:" +
                "\nBase: " + base);
    }


}
