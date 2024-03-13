package SegundaEvaluacion.poo.herencia.clasesabstractas.figurasgeometricas;

import java.util.ArrayList;

public abstract class Figura20 {
    int lados;
    final int DIMENSIONES = 2;

    public Figura20(int lados) {
        this.lados = lados;
    }

    // este método devuelve rectángulo o triángulo según el número de lados de la figura
    public String nombreFigura() {
        if (lados == 3) {
            return "triángulo";
        } else if (lados == 4) {
            return "rectángulo";
        } else {
            return " gracias por la sugerencia; añadiremos figuras de " + lados + " lados en el futuro";
        }
    }

    // métodos abstracto: los declaro pero no los desarrollo
    public abstract ArrayList<Linea> crearLineas();
    public abstract double calcularPerimetro();
    public abstract double calcularArea();
}
