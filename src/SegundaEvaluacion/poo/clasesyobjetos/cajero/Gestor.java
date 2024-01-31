package SegundaEvaluacion.poo.clasesyobjetos.cajero;

public class Gestor {
    private String nombre;
    private String telefono;
     double importe;

    private Gestor gestor;

    public Gestor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }



    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    @Override
    public String toString() {
        return "Gestor{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", importe=" + importe +
                ", gestor=" + gestor +
                '}';
    }
}
