package SegundaEvaluacion.poo.clasesyobjetos.superHeroes;

public class Superheroe {
    private String nombre;
    private String descripcion;
    private boolean capa;

    public Superheroe(String nombre) {
        this.nombre = nombre;
        this.descripcion = "";
        this.capa = false;
    }


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

    @Override
    public String toString() {
        String infoCapa = "";
        if (this.capa){
            infoCapa = "con capa ";
        }else {
            infoCapa = "sin capa ";
        }
        return "Superheroe " +
                "nombre = " + nombre + " " +
                " descripcion = " + descripcion + " " +
                " capa = " + infoCapa + "";
    }
}
