package AlgoCrazzy;

import java.awt.*;
import java.util.*;
import java.util.stream.IntStream;

public class Aleatorio {
    private static Random generador = new Random();
    public static void main(String[] args) {
        IntStream.rangeClosed(1,10).map(n -> generador.nextInt(1,10)).forEach(n -> System.out.print(n + " "));

        System.out.println("============================================================");


        System.out.println();
        // Crear una lista de strings
        ArrayList<String> listaStrings = new ArrayList<>();
        listaStrings.add("Hola");
        listaStrings.add("Mundo");
        listaStrings.add("Java");
        listaStrings.add("Lambda");

        // Contar los caracteres de cada elemento en la lista utilizando expresiones lambda
        System.out.println("Cantidad de caracteres en cada elemento:");
        listaStrings.forEach(s -> System.out.println(s + ": " + s.length()));

        System.out.println("============================================================");

        System.out.println();
        // Crear un HashMap para almacenar el nombre y la edad de varias personas
        Map<String, Integer> personas = new HashMap<>();
        personas.put("Juan", 30);
        personas.put("María", 25);
        personas.put("Pedro", 40);

        // Mostrar el nombre y la edad de cada persona en el HashMap
        System.out.println("Nombre y edad de cada persona:");
        for (Map.Entry<String, Integer> entry : personas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " años");
        }

        // Añadir la edad de una persona específica
        String nombre = "Juan";
        int nuevaEdad = 31; // Nueva edad de Juan
        personas.put(nombre, nuevaEdad);

        // Mostrar el nombre y la nueva edad de Juan
        System.out.println("\nNueva edad de " + nombre + ": " + personas.get(nombre) + " años");

        for (Map.Entry<String,Integer> enty: personas.entrySet()) {
            System.out.println(enty);
        }


    }
}
