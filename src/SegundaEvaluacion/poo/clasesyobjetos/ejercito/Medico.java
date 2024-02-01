package SegundaEvaluacion.poo.clasesyobjetos.ejercito;

public class Medico {
    private String nombre;
    static int medicos;

    public Medico(String nombre) {
        this.nombre = nombre;
        medicos++;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
