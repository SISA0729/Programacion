package SegundaEvaluacion.poo.clasesyobjetos.ejercito;

public class Medico {
    // Atributos: nombre, médicos (int, estático).
    private String nombre;
    static int medicos;
    // Constructor: recibe un nombre para el objeto creado e incrementa cada vez el número de médicos.

    public Medico(String nombre) {
        this.nombre = nombre;
        medicos++;
    }
}
