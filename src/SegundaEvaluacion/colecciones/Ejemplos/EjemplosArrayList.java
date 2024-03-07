package SegundaEvaluacion.colecciones.Ejemplos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EjemplosArrayList {
    public static void main(String[] args) {
        // son como los array, pero pueden cambiar de tamaño
        // una diferencia importante: no pueden guardar tipos primitivos: int boolean, double
        // en su lugar hay que utilizar lo que se llaman clases envoltorio (wrapper):
        // en vez de int usamos Integer, en vez de double usamos Double, en vez de boolean usamos Boolean, en vez de char usamos Character
        ArrayList<Integer> enteros = new ArrayList<>();
        // métodos a utilizar:
        System.out.println(enteros.size()); // tamaño: es el equivalente en los arrays a length
        // para añadir elementos: add
        enteros.add(53);
        System.out.println(enteros.size()); // tamaño: es el equivalente en los arrays a length
        for (int i = 30; i <= 40 ; i++) {
            enteros.add(i);
        }
        System.out.println(enteros.size()); // tamaño: es el equivalente en los arrays a length
        // y si quiero ver qué elementos tiene: get()
        for (int i = 0; i < enteros.size(); i++) {
            System.out.print(enteros.get(i) + " ");
        }
        System.out.println("\n\n===========================================");
        // ahora cogemos los ejemplos  de los apuntes
        ArrayList<String> nombres = new ArrayList<>();
        // añadimos dos elementos
        nombres.add("Justino");      // [Justino]
        nombres.add("Helena");       // [Justino, Helena]
        System.out.println(nombres); // imprimir un arraylist es mucho más fácil que un array

        // añadimos dos nombres más pero al principio: es decir, en los índices 0 y 1
        nombres.add(1, "Joshua");   // [Justino, Joshua, Helena]
        System.out.println("Meto a Joshua en el índice 1: " + nombres);
        nombres.add(0, "Laura");    // [Laura, Justino, Joshua, Helena]
        System.out.println("Meto a Laura en el índice 0: " + nombres);

        // set sirve para reemplazar un elemento por otro diciendo el índice
        // queremos meter a Mario en el lugar de Helena, que está en el índice 3
        nombres.set(3, "Mario");
        System.out.println("He sustituido a Helena por Mario: " + nombres);

        // qyeremos eliminar a Justino de la lista
        nombres.remove("Justino");
        System.out.println("Eliminamos a Justino: " + nombres);

        // ordenar un arraylist
        Collections.sort(nombres);
        System.out.println("Arraylist ordenado: " + nombres);

    }
}
