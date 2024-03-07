package SegundaEvaluacion.colecciones.Ejemplos;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploIterador {
    public static void main(String[] args) {
        // un iterador lo tienen todas las colecciones (arraylist, hashset...)
        // sirve para recorrerlas elemento a elemento, lo mismo que hacíamos con un for o un foreach pero como tienen unas características especiales, a veces son la mejor opción para recorrer una colección
        ArrayList<String> alumnos = new ArrayList<>();
        alumnos.add("Iván");
        alumnos.add("Alejandro");
        alumnos.add("Carlos André");
        alumnos.add("Carlos");
        alumnos.add("Javier");
        alumnos.add("Ainara");
        alumnos.add("George");
        alumnos.add("Sergio");
        alumnos.add("Kamilly");
        alumnos.add("Sisa");
        alumnos.add("Johane");

        // quiero recorrer el arraylist, tengo 3 formas:
        System.out.println("Con for normal: ");
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.print(alumnos.get(i) + " ");
        }
        System.out.println("\n\nCon foreach: "); // la limitación que tiene es que no puedes seleccionar elementos por índice
        for (String elemento: alumnos) {
            System.out.print(elemento + " ");
        }
        // tercera forma: utilizando un iterador (es un objeto que se crea así:)
        System.out.println("\n\nCon iterador: ");
        Iterator<String> iterator = alumnos.iterator();
        // lo normal es poner a continuación un while, así:
        while (iterator.hasNext()) { // = mientras haya un elemento siguiente
            String elemento = iterator.next(); // guardo el siguiente elemento de la colección
            System.out.print(elemento + " ");
        }
    }
}
