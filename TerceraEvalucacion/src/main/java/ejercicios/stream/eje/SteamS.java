package ejercicios.stream.eje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class SteamS {
    public static void main(String[] args) {
        String[] cadena = {"mora", "naranja", "níspero", "pera", "plátano", "pomelo", "sandía", "melón", "uva", "piña", "melocotón"};
        Stream<String> s = Stream.of(cadena);
        s.filter(n -> n .startsWith("p")).forEach(n -> System.out.print(n + " "));
        System.out.println();
        List<Integer> list = new ArrayList<>();
        Random gemerador = new Random();
        for (int i = 0; i <20 ; i++) {
            list.add(gemerador.nextInt(-10,10));
        }
        list.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();
        list.stream().filter(n -> n >= 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
        list.stream().sorted().forEach(n -> System.out.print(n + " "));
        System.out.println();
        list.stream().distinct().sorted().forEach(n -> System.out.print(n + " "));
        System.out.println();
        list.stream().map(n -> n * n).forEach(n -> System.out.print(n + " "));
        System.out.println();
        Stream.of(cadena).map(n -> n.toUpperCase()).forEach(n -> System.out.print(n + " "));

        String[] codigo = {"001", "002", "003", "004"};
        Stream<String> stream = Stream.of(codigo);
        Stream.of(codigo).mapToInt(Integer::parseInt).forEach(n -> System.out.println(n + " "));

        System.out.println();
        System.out.println(list.stream().max((n1,n2)->n1-n2).get());
        System.out.println(list.stream().min((n1,n2)->n1-n2).get());

        System.out.println();
        System.out.println("Cuantos hay");
        System.out.println(Stream.of(cadena).count());


        System.out.println();
        List<Double> list1 = Arrays.asList(3.75,6.0);
        double total = list1.stream().reduce(0.0,(n1,n2) -> n1 + n2);
        double promedio = total / list1.stream().count();
        System.out.printf("Promedio = %.2f", promedio);

    }
}
