package SegundaEvaluacion.poo.herencia.clasesabstractas.figurasgeometricas;

import java.util.ArrayList;

public class MainP {
    public static void main(String[] args) {
        Punto A = new Punto(4,4);
        Punto B = new Punto(10,4);
        Punto C = new Punto(4,0);
        Punto D = new Punto(10,0);

        System.out.println();

        Linea AB = new Linea(A,B);
        Linea BC = new Linea(B,C);
        Linea CD = new Linea(C,D);
        Linea AC = new Linea(A,C);

        System.out.println(AB);
        AB.dibujarLInea();
        System.out.println(BC);
        BC.dibujarLInea();
        System.out.println(CD);
        CD.dibujarLInea();
        System.out.println(AC);
        AC.dibujarLInea();

        ArrayList<Punto> puntos = new ArrayList<>();
        puntos.add(A);
        puntos.add(B);
        puntos.add(C);
        puntos.add(D);

        Rectangulo rectangulo = new Rectangulo(puntos);
        System.out.println(rectangulo);

    }
}
