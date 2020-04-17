package com.company.ejercicio2;

public class Staff extends Persona{

    private float salario;
    private String turno; //Manana o Tarde;

    public Staff(){}

    public Staff(int dni, String nombre, String apellido, String email, String direccion, float salario, String turno){
        super();
        this.salario=salario;
        this.turno=turno;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public float getSalarioAnual(){
        return this.salario*12;
    }

    @Override
    public String toString(){
        return (super.toString() +
                "\nSalario Mensual: " + this.salario +
                "\nTurno: " + this.turno);
    }
}
