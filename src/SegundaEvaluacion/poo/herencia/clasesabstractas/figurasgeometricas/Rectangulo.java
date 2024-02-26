package SegundaEvaluacion.poo.herencia.clasesabstractas.figurasgeometricas;

import java.util.ArrayList;

public class Rectangulo extends Figura20{
    Punto p1;
    Punto p2;
    Punto p3;
    Punto p4;


    public Rectangulo(Punto p1, Punto p2, Punto p3, Punto p4) {
        super(4);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public Rectangulo(ArrayList<Punto> puntos) {
        super(4);
        this.p1 = puntos.get(0);
        this.p2 = puntos.get(1);
        this.p3 = puntos.get(2);
        this.p4 = puntos.get(3);


    }

    @Override
    public ArrayList<Linea> crearLineas() {
        return null;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }

    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public String toString() {
        return p1 + " " +p2 + " " + p3 + " " + p4 + " ";
    }

}
