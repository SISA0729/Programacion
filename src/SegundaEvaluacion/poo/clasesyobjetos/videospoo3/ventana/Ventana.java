package SegundaEvaluacion.poo.clasesyobjetos.videospoo3.ventana;

public class Ventana {
    //propiedades, attributos, campos, variables miembro
    private int ancho;
    private int alto;
    private Color color;

    public Ventana(int ancho, int alto, Color color) {
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        if (ancho > 2048){
            System.out.println("tamaño maximo es 2048");
        } else {
            this.ancho = ancho;
        }

    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ventana{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", color=" + color +
                '}';
    }

    public void aparecer(){
        System.out.println("la ventana aparecer");
    }
    public void cerrar(){
        System.out.println("la venta se cierra");
    }

}
