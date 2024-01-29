package SegundaEvaluacion.poo.clasesyobjetos.teoria.hospital;

import java.util.Arrays;

public class Paciente {
    private String nombre;
    private int edad;
    private String[] sintomas;




    public Paciente() {
    }

    public Paciente(String nombre, int edad, String[] sintomas) {
        this.nombre = nombre;
        this.edad = edad;
        this.sintomas = sintomas;
    }

    public Paciente(String nombre) {
        this.nombre = nombre;
        this.edad = 999;
        this.sintomas = new String[] {"desconocido"};
        // ademas le puedo decir que valores para los otros parametros
        // sin o se la edad , que valga 999 por defecto
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String[] getSintomas() {
        return sintomas;
    }

    public void setSintomas(String[] sintomas) {
        this.sintomas = sintomas;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sintomas=" + Arrays.toString(sintomas) +
                '}';
    }
}
