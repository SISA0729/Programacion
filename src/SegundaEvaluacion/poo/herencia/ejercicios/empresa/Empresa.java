package SegundaEvaluacion.poo.herencia.ejercicios.empresa;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleado;
    private ArrayList<Cliente> clientes;



    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", empleado=" + empleado +
                ", clientes=" + clientes +
                '}';
    }

    public void mostrar(){
        System.out.println("Mostrar");
    }

}
