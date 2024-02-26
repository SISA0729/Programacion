package SegundaEvaluacion.poo.herencia.teoria.ejemplopolimorfismo;

public class Fichero {
    protected String nombreCompleto;

    public Fichero(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    protected String getInfoFichero(){
        return "Fichero" + nombreCompleto;
    }

    public void imprimeInfoFichero (){
        String info = this.getInfoFichero();
        System.out.println(info);
    }



}
