package SegundaEvaluacion.poo.herencia.ejercicios.empresa;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;
    private ArrayList<Cliente> clientes;

    public Empresa(String nombre, ArrayList<Empleado> empleados, ArrayList<Cliente> clientes) {
        this.nombre = nombre;
        this.empleados = empleados;
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", empleados=" + empleados +
                ", clientes=" + clientes +
                '}';
    }

    public void mostrar() {
        System.out.println(toString());
    }
}
