package SegundaEvaluacion.colecciones.Ejemplos;

import java.util.HashSet;

public class EjemplosHashSet {
    public static void main(String[] args) {
        HashSet<Integer> conjunto = new HashSet<>();
        conjunto.add(5);
        conjunto.add(5);
        conjunto.add(7);
        System.out.println(conjunto);
    }

}
