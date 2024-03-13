package SegundaEvaluacion.poo.clasesyobjetos.cajero;

public class Gestor {
    // nombre, teléfono y el importe máximo autorizado con el que pueden operar.
    public String nombre;
    private String telefono;
    double importeMaximoAutorizado; // default package, protección de paquete

    // constructor/es

    public Gestor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        // si no se asigna el importe es 10000
        this.importeMaximoAutorizado = 10000;
    }

    // para asignar un importe máximo al crear un gestor tenemos que poner otro constructor que sí lo incluya
    public Gestor(String nombre, String telefono, double importeMaximoAutorizado) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximoAutorizado = importeMaximoAutorizado;
    }

    // Un gestor, una vez asignado, no podrá cambiar su número de teléfono. Y todo el mundo podrá consultarlo

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Gestor{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", importeMaximoAutorizado=" + importeMaximoAutorizado +
                '}';
    }
}
