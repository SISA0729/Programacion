package SegundaEvaluacion.poo.herencia.teoria.ejemploclaseabstracta;

public abstract class Mascota {
    protected String nombre;
    protected int edad;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void dice();


}
