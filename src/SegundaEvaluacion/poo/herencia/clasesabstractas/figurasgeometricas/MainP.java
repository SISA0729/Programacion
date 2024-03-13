package SegundaEvaluacion.poo.herencia.clasesabstractas.figurasgeometricas;

import java.util.ArrayList;

public class MainP {
    public static void main(String[] args) {
        // Creamos cuatro puntos
        System.out.println("Puntos: ");
        System.out.println("========");
        Punto A = new Punto(4, 4);
        System.out.println(A);
        Punto B = new Punto(10, 4);
        System.out.println(B);
        Punto C = new Punto(4, 0);
        System.out.println(C);
        Punto D = new Punto(10,0);
        System.out.println(D);

        // Creamos las cuatro líneas que forman un rectángulo con esos cuatro puntos, y también la hipotenusa
        System.out.println("\n\nLíneas:");
        System.out.println("========");
        Linea AB = new Linea(A, B);
        System.out.println(AB);
        AB.dibujarLinea();

        Linea BC = new Linea(B, C);
        System.out.println(BC);
        BC.dibujarLinea();

        Linea BD = new Linea(B, D);
        System.out.println(BD);
        BD.dibujarLinea();

        Linea CD = new Linea(C, D);
        System.out.println(CD);
        CD.dibujarLinea();

        Linea AC = new Linea(A, C);
        System.out.println(AC);
        AC.dibujarLinea();

        // intento hacer un objeto a partir de la  clase abstracta Figura2D -> no se puede

        // creamos un rectángulo con el segundo constructor
        System.out.println("Rectángulo:");

        ArrayList<Punto> puntos = new ArrayList<>();
        puntos.add(A);
        puntos.add(B);
        puntos.add(C);
        puntos.add(D);

        Rectangulo rectangulo = new Rectangulo(puntos);
        System.out.println(rectangulo);


    }
}
