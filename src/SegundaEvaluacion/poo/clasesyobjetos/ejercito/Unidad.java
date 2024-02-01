package SegundaEvaluacion.poo.clasesyobjetos.ejercito;

public class Unidad {
    private String nombre;
    static int unidades;


    public Unidad(String nombre) {
        this.nombre = nombre;
        unidades++;
    }

    @Override
    public String toString() {
        return "Unidad{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
