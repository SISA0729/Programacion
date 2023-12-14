package SegundaEvaluacion.colecciones.Ejemplos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EjemplosArrayList {
    public static void main(String[] args) {
        //son como los arrays pero pueden cambiar el tamaño
        // una diferencia import no pueden guradar tipos primitivos
        // int, bolean doble
        // en su lugar hay que utilizar lo que se llaman clases envoltorios (wrapper)
        // en vez de char usamos character
        ArrayList<Integer> enteros = new ArrayList<>();
        System.out.println(enteros.size());
        enteros.add(53);
        System.out.println(enteros.size());
        for (int i = 30; i <= 40; i++) {
            enteros.add(i);
        }
        System.out.println(enteros.size());
        for (int i = 0; i < enteros.size() ; i++) {
            System.out.print(enteros.get(i) + " ");
        }

        // ahora cogemos los ejemplos de los apuntes
        System.out.println("\n\n ----------------------------------------");
        ArrayList<String> nombre = new ArrayList<>();
        nombre.add("JUSTINO");
        nombre.add("HELENA");
        System.out.println(nombre);
        nombre.add(1,"JOSHUE");
        nombre.add(0,"LAURA");
        System.out.println(nombre);
        nombre.set(3,"MARIO");
        System.out.println(nombre);

        //ELIMINAR A JUSTINO DE LA LISTA

        nombre.remove("JUSTINO");
        System.out.println(nombre);

        //ORDENADOS ALFABETICAMENTE
        Collections.sort(nombre);
        System.out.println(nombre);

    }
}
