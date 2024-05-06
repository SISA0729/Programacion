package ejercicios.comparator.personas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Personas persona1 = new Personas("SISA",23,2);
        Personas persona2 = new Personas("ISMAEL",26,3);
        Personas persona3 = new Personas("ASIS",18,1);

        ArrayList<Personas> personas = new ArrayList<>();

        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);

        imprimir(personas);

        System.out.println();
        System.out.println("COMPARAR POR ALTURA: ");
        System.out.println("=====================");
        CompararAltura compararAltura = new CompararAltura();
        personas.sort(compararAltura);
        imprimir(personas);

        System.out.println();
        System.out.println("COMPARAR POR EDAD: ");
        System.out.println("===================");
        CompararEdad compararEdad = new CompararEdad();
        personas.sort(compararEdad);
        imprimir(personas);

        System.out.println();
        System.out.println("Imvertimos la edad: ");
        personas.sort(compararEdad.reversed());
        imprimir(personas);


        // Utilizar un Comparator para ordenar la lista por edad de menor a mayor
        Collections.sort(personas, Comparator.comparingInt(Personas::getEdad));

        // Imprimir la lista ordenada
        System.out.println("Lista de personas ordenada por edad (de menor a mayor):");
        personas.forEach(System.out::println);

    }
    public static void imprimir(ArrayList<Personas> personas){
        for (Personas persona: personas ){
            System.out.println(persona);
        }
    }
}
