package SegundaEvaluacion.poo.clasesyobjetos.ejercito;

public class General {
    private String nombre;
    static int general;

    public General(String nombre) {
        this.nombre = nombre;
        general++;
    }

    @Override
    public String toString() {
        return "General{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
