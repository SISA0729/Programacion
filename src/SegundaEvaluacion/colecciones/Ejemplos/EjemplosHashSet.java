package SegundaEvaluacion.colecciones.Ejemplos;

import java.util.HashSet;

public class EjemplosHashSet {
    public static void main(String[] args) {
        // los conjuntos (set) son estructuras dinámicas en que
        // - no importa el orden en que se guarden los elementos
        // - no contienen elementos repetidos

        // cómo utilizo los conjuntos:
        HashSet<Integer> conjunto = new HashSet<>();

        // los métodos a utilizar son prácticamente los mismos que con arraylist
        conjunto.add(5);
        conjunto.add(5);
        conjunto.add(7);
        conjunto.add(8);
        conjunto.add(9);
        conjunto.add(10);
        System.out.println(conjunto);
    }

}
