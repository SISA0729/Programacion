package SegundaEvaluacion.poo.herencia.ejercicios.empresa;

import java.time.LocalDate;

public class Persona {
    protected String nombre;
    protected LocalDate fechaNacimiento;

    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

    public void mostrar(){
        System.out.println(toString());
    }


}
