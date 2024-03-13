package SegundaEvaluacion.poo.clasesyobjetos.ejercito;

public class Unidad {
    // Atributos: nombre, unidades (int, estático).
    private String nombre;
    static int unidades;
    // Constructor: recibe un nombre para la unidad que se crea e incrementa cada vez el número de unidades.

    public Unidad(String nombre) {
        this.nombre = nombre;
        unidades++;
    }
}
