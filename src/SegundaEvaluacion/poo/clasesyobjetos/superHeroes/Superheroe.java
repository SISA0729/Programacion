package SegundaEvaluacion.poo.clasesyobjetos.superHeroes;

public class Superheroe {
    // Propiedades = ATRIBUTOD
    //Sus propiedades serán:
    // Nombre (nombre del superhéroe)
    private String nombre;
    // Descripción (cadena para describir brevemente su aspecto)
    private String descripcion;
    // Capa (booleano que indica si el superhéroe lleva o no capa)
    private boolean capa;

    //Constructores
    //Haga un constructor con parámetros que reciba solo el nombre del
    //superhéroe. La descripción se inicializará a vacío (cadena vacía) y la capa
    //se inicializará al valor false (sin capa)

    public Superheroe(String nombre) {
        this.nombre = nombre;
        // La descripción se inicializará a vacío (cadena vacía)
        this.descripcion = "";
        // la capa se inicializará al valor false (sin capa)
        this.capa = false;
    }


    //Métodos get y set
    //Programe los get y set para cada propiedad de la clase.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCapa() {
        return capa;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }


    //Método toString
    //Programe el método toString de forma que devuelva una cadena con
    //todas sus propiedades.

    @Override
    public String toString() {
        // si capa = false que ponga sin capa
        // si capa = true que ponga con capa
        String infoCapa = "";
        if (this.capa) { // recuerda que es lo mismo que: capa == true
            infoCapa = " con capa";
        } else {
            infoCapa = " sin capa";
        }
        return "Superheroe{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                infoCapa +
                '}';
    }
}
