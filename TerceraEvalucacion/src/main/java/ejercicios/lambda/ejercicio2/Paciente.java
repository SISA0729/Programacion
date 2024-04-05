package ejercicios.lambda.ejercicio2;

import java.util.Arrays;

public class Paciente {
    String nombre;
    int edad;
    String[]sintomas;
    public Paciente() {
        this.nombre = "Desconocido";
        this.edad = 999;
        this.sintomas = new String[]{"NInguna"};
    }

    public Paciente(String nombre, int edad, String[] sintomas) {
        this.nombre = nombre;
        this.edad = edad;
        this.sintomas = sintomas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (!nombre.equals(null)){
            this.nombre = nombre;
        }
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
        return nombre + " | " + edad + " | " + Arrays.toString(sintomas) + "\n";
    }
}
