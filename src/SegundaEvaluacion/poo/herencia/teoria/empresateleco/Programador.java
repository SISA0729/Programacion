package SegundaEvaluacion.poo.herencia.teoria.empresateleco;

import java.util.Arrays;

public class Programador extends Empleado{
    protected String[] lenguajes;



    public Programador() {

        this.lenguajes = lenguajes;
    }

    public String[] getLenguajes() {

        return lenguajes;
    }

    public void setLenguajes(String[] lenguajes) {

        this.lenguajes = lenguajes;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "lenguajes=" + Arrays.toString(lenguajes) +
                ", fecha_inicio=" + fecha_inicio +
                ", salario=" + salario +
                ", nombre='" + nombre + '\'' +
                ", año=" + año +
                ", direccion='" + direccion + '\'' +
                '}';
    }
    public void añadirLeguaje(String lenguaje){
        String[] lenguajeMasUno = new String[lenguajes.length + 1];
            for (int i = 0; i < lenguajes.length; i++) {
                lenguajeMasUno[i] = lenguajes[i];
            }
            lenguajeMasUno[lenguajeMasUno.length - 1] = lenguaje;
    }




}
