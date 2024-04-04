package ejercicios.lambda.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("uno");
        list.add("dos");
        list.add("tres");
        list.add("cuatro");
        list.add("cinco");
        list.add("veintiseis");

        System.out.println("Ejercicio 1: ");
        Ejercicio1 ejercicio1 = lista -> {
            for (String elemento: lista){
            System.out.println(elemento);
            }

        };
        ejercicio1.imprimeLista(list);

        System.out.println();
        System.out.println("Ejercicio 2: ");
        Ejercicio2 ejercicio2 = contar -> {
            int comtador = 0;
            for (String palabra : contar) {
                if (palabra.length() > 5) {
                    comtador++;
                }
            }
            return comtador;
        };
        System.out.println(ejercicio2.contar(list));

        System.out.println();
        System.out.println("Ejercicio 3: ");
        ArrayList<Integer> numeros = new ArrayList<>();
        Random generador = new Random();
        for (int i = 0; i < 20; i++) {
            numeros.add(generador.nextInt(0,10));
        }

        Ejercicio3 ejercicio3 = new Ejercicio3() {
            @Override
            public int numeroEntero(ArrayList<Integer> listaEntero) {
                int mayor = listaEntero.get(0);
                for (int i = 1; i < listaEntero.size(); i++) {
                    if (listaEntero.get(i) > mayor){
                        mayor = listaEntero.get(i);
                    }
                }
                return mayor;
            }
        };
        System.out.println(ejercicio3.numeroEntero(numeros));

        ArrayList<Personas> personas = new ArrayList<>();
        personas.add(new Personas("Sisa",21));
        personas.add(new Personas("ismael",20));
        personas.add(new Personas("vasquez",12));



    }


}
