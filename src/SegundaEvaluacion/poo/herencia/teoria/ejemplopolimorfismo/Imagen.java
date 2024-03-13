package SegundaEvaluacion.poo.herencia.teoria.ejemplopolimorfismo;

public class Imagen extends Fichero {


    protected int width;
    protected int height;
    protected byte[] contenido;



    // constructor

    public Imagen(String nombreCompleto, int width, int height, byte[] contenido) {
        super(nombreCompleto);
        this.width = width;
        this.height = height;
        this.contenido = contenido;
    }

    // getters y setters

    @Override
    protected String getInfoFichero() {
        //return String.format("Imagen: %s, width: %d, height: %d", nombreCompleto, width, height);
        return "Imagen: " + nombreCompleto + ", width: " + width + ", height: " + height;
    }


}
