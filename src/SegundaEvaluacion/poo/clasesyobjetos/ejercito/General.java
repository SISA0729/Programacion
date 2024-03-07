package SegundaEvaluacion.poo.clasesyobjetos.ejercito;

public class General {
    //  Atributos: nombre, generales (int, estático).
    private String nombre;
    static int generales;
    //  Constructor: recibe un nombre para el objeto creado e incrementa cada vez el número de generales.

    public General(String nombre) {
        this.nombre = nombre;
        generales++;
    }
}
