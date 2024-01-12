package SegundaEvaluacion.colecciones.Ejemplos;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploIterador {
    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<>();
        alumnos.add("Ivan");
        alumnos.add("Alex");
        alumnos.add("Carls");
        alumnos.add("Javier");
        alumnos.add("George");
        alumnos.add("Sergio");
        alumnos.add("kamilly");
        alumnos.add("sisa");
        alumnos.add("johan");

        for (int i = 0; i < alumnos.size() ; i++) {
            System.out.println(alumnos.get(i) + " ");
        }
        System.out.println();

        for (String elemento: alumnos ) {
            System.out.println(elemento);
        }

        Iterator<String> iterator = alumnos.iterator();
        while (iterator.hasNext()){
            String elemento = iterator.next();
        }

    }
}
