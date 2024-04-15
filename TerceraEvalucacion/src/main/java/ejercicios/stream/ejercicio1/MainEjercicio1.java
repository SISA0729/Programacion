package ejercicios.stream.ejercicio1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class MainEjercicio1 {
    public static void main(String[] args) {
        List<Integer> numero = new ArrayList<>();
        Random generado = new Random();
        for (int i = 0; i < 20; i++) {
            numero.add(generado.nextInt(1,16));
        }



        System.out.println("Imprime todos los elementos de la lista, sin ordenar.\n");
        numero.forEach(n -> System.out.print(n + " "));

        System.out.println("\n\nImprime todos los elementos de la lista, ordenados.\n");
        numero.stream()
                .sorted()  //viene bien para ordenar números
                .forEach(n -> System.out.print(n + " "));

        System.out.println("\n\nImprime todos los elementos de la lista, sin repetir, ordenados.\n");
        numero.stream()
                .sorted()
                .distinct() //viene bien para que no se repitan los números
                .forEach(n -> System.out.print(n + " "));

        System.out.println("\n\nImprime sólo los mayores o iguales a 5 distintos entre sí.\n");
        numero.stream()
                .distinct()
                .filter(n -> n >= 5)  //para filtrar por parámetros
                .forEach(n -> System.out.print(n + " "));

        System.out.println("\n\nImprime sólo los mayores o iguales a 5 distintos entre sí,  ordenados.\n");
        numero.stream()
                .sorted()
                .distinct()
                .filter(n -> n >= 5)  //para filtrar por parámetros
                .forEach(n -> System.out.print(n + " "));

        System.out.println("\n\nImprime sólo los mayores o iguales a 5 distintos entre sí,  ordenados inversamente.\n");
        numero.stream()
                .filter(n -> n >= 5)
                .sorted((n, o ) -> o.compareTo(n))
                .distinct()
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\notra forma: ");
        numero.stream()
                .filter(n -> n >= 5)
                .distinct()
                .sorted(Comparator.reverseOrder()) //para ordenar inversamente
                .forEach(n -> System.out.print(n + " "));

        System.out.println("\n\nSuma todos los elementos de la lista e imprime el resultado.\n");
        int suma = numero.stream().reduce(0,Integer::sum);
        System.out.println(suma);
        System.out.println("Otra forma: ");
        suma = numero.stream().mapToInt(n -> n).sum();
        System.out.println(suma);

        System.out.println("\n\nSuma todos los elementos mayores o iguales a 5 (también los que se repitan) e imprime el resultado.\n");
        int suna = numero.stream()
                .filter(n -> n >= 5)
                .mapToInt(n -> n).sum();
        System.out.println(suna);

        System.out.println("\n\nCalcula el promedio de todos los elementos de la lista (sin eliminar los repetidos) e imprime el resultado. \n");
        numero.stream()
                .mapToDouble(n -> n).average()
                .stream().forEach(n -> System.out.print(n + " "));
    }

}
