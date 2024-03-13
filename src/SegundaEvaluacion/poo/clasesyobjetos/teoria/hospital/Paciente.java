package SegundaEvaluacion.poo.clasesyobjetos.teoria.hospital;

import java.util.Arrays;

public class Paciente {
    // atributos
    private String nombre;
    private int edad;
    private String[] sintomas;

    // sobrecarga de constructores: tener uno o más constructores, cada uno con diferente número u orden de parámetros
    // 1) Constructor sin parámetros: sería el constructor por defecto si no hubiera ningún constructor explícito
    public Paciente() {
    }

    // 2) Constructor con los tres atributos como parámetros
    public Paciente(String nombre, int edad, String[] sintomas) {
        this.nombre = nombre;
        this.edad = edad;
        this.sintomas = sintomas;
    }

    // 3) Quiero un constructor para cuando tenga que crear un objeto de tipo paciente y solamente sepa el nombre

    public Paciente(String nombre) {
        this.nombre = nombre;
        // además le puedo indicar valores para los otros parámetros
        // si no sé la edad, que valga 999 por defecto
        this.edad = 999;
        // si no sé los síntomas, inicializo el array de síntomas, ponemos "Desconocido"
        this.sintomas = new String[] {"Desconocido"};
    }


    // getters y setters

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

    // toString

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sintomas=" + Arrays.toString(sintomas) +
                '}';
    }

    // métodos de usuario
}
