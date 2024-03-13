package SegundaEvaluacion.poo.clasesyobjetos.superHeroes;

public class Dimencion {
    // Propiedades = ATRIBUTOS
    //Contiene las siguientes propiedades (todas ellas double):
    // Alto. Medida correspondiente al alto del objeto.
    private double alto;
    // Ancho. Medida correspondiente al ancho del objeto.
    private double ancho;
    // Profundidad. Medida correspondiente a la profundidad del objeto.
    private double profundidad;

    //Constructores
    //Haga un constructor sin parámetros que inicialice todas las propiedades a 0.
    public Dimencion() {
        this.alto = 0;
        this.ancho = 0;
        this.profundidad = 0;
    }

    //Haga un constructor que reciba como parámetro un alto, un ancho y una
    //profundidad y asigne los valores a sus respectivas propiedades.

    public Dimencion(double alto, double ancho, double profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    //Métodos get y set
    //Programe los get y set para cada propiedad.

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    //Método toString
    //Programe el método toString de forma que devuelva una cadena con el
    //alto, ancho, profundidad y volumen máximo del objeto.

    @Override
    public String toString() {
        return "Dimension{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", profundidad=" + profundidad +
                '}';
    }


    //Métodos de cálculo
    //Programe un método llamado getVolumen() que devuelva el volumen
    //máximo que ocuparía el objeto (alto x ancho x profundidad)
    public double getVolumen() {
        return alto * ancho * profundidad;
    }
}
