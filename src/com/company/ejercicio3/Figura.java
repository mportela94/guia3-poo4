package com.company.ejercicio3;

public abstract class Figura {

    protected String color;

    public Figura(){
        this.color=null;
    }

    public Figura (String color) {
        if (color == null) {
            this.color = "Sin color";
        } else {
            this.color = color;

        }
    }

    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }

    public abstract double getArea();
    public abstract double getPerimetro();

    @Override
    public String toString() {
        return ("Figura: " +
                "\nColor: " + color);
    }
}

