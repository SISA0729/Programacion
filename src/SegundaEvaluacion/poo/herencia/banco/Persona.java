package SegundaEvaluacion.poo.herencia.banco;

public class Persona {
    String nombre,apellido1,getApellido2,DNI;

    public Persona(String nombre, String apellido1, String getApellido2, String DNI) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.getApellido2 = getApellido2;
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", getApellido2='" + getApellido2 + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}
