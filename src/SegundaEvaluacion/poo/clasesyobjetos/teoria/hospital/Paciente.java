package SegundaEvaluacion.poo.clasesyobjetos.teoria.hospital;

import java.util.Arrays;

public class Paciente {
    private String nombre;
    private int edad;
    private String[] sintomas;


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
