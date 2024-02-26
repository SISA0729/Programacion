package SegundaEvaluacion.poo.herencia.clasesabstractas.figurasgeometricas;

import java.util.ArrayList;

public abstract class Figura20 {
    int lados;
    final int DIMENSIONES = 2;

    public Figura20(int lados) {
        this.lados = lados;
    }

    public String nombreFigura(){
        if (lados == 3){
            return "Triangulo";
        }else if (lados == 4){
            return "Rectangulo";
        }else {
            return " añadiremos figuras de " + lados + " em el futuro.";
        }
    }
    public abstract ArrayList<Linea> crearLineas();

    public abstract double calcularPerimetro();

    public abstract double calcularArea();


}
