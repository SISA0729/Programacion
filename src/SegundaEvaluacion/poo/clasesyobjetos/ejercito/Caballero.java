package SegundaEvaluacion.poo.clasesyobjetos.ejercito;

public class Caballero {
    private String nombre;
    static int caballeros;

    public Caballero(String nombre) {
        this.nombre = nombre;
        caballeros++;
    }

    @Override
    public String toString() {
        return "Caballero{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
