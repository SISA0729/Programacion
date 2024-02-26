package SegundaEvaluacion.poo.herencia.teoria.ejemplopolimorfismo;

public class Imagen extends Fichero {

    protected int width;
    protected int height;
    protected byte[] contenido;


    public Imagen(String nombreCompleto, int width, int height, byte[] contenido) {
        super(nombreCompleto);
        this.width = width;
        this.height = height;
        this.contenido = contenido;
    }


}
