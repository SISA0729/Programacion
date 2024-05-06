package ejercicios.lambda.eje;

import ejercicios.lambda.ejercicio1.Ejercicio1;
import ejercicios.lambda.ejercicio1.Personas;
import ejercicios.lambda.ejercicio1.Producto;
import teoria.function.Persona;

import java.util.*;

public class lam {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hola", "Mundo", "desde", "OpenAI", "ChatGPT");
        list.stream().forEach(n -> System.out.println(n + " "));

        long cantidad = list.stream().filter(n -> n.length() > 5).count();
        System.out.println(cantidad);

        System.out.println();
        List<Integer> list1 = new ArrayList<>();
        Random geerador = new Random();
        for (int i = 0; i < 10; i++) {
            list1.add(geerador.nextInt(0,5));
        }
        list1.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();
        list1.stream().mapToInt(Integer::intValue).max().stream().forEach(n -> System.out.println(n + " "));

        System.out.println();
        List<Integer> enteros = Arrays.asList(1,2,3,4);
        int suma = enteros.stream().filter(n -> n % 2 == 0).reduce(0,Integer::sum);
        System.out.println(suma);

        System.out.println();
        System.out.println("Persona:");
        Persona persona1 = new Persona("Ismael",39);
        Persona persona2 = new Persona("Ismael",19);
        Persona persona3 = new Persona("Ismael",9);
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);

        personas.stream().min((n1,n2) -> n1.getEdad() - n2.getEdad())
                .stream().distinct().forEach(n -> System.out.println(n + " "));

        System.out.println();
        personas.stream().sorted((n1,n2) -> n1.getEdad() - n2.getEdad())
                .forEach(n ->System.out.println(n + " "));

        System.out.println();
        personas.stream().filter(n -> n.getEdad() > 30).forEach(n ->System.out.println(n + " "));

        System.out.println();
        Producto producto1 = new Producto("Sisa",3.0);
        Producto producto2 = new Producto("Sisa",40.44);
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);

        double total = productos.stream().mapToDouble(Producto::getPrecio).sum();
        System.out.println(total);

        System.out.println();
        productos.stream().sorted((n1,n2) -> Double.compare(n2.getPrecio(), n1.getPrecio()))
                .forEach(n -> System.out.print(n + " "));

        System.out.println();
        productos.stream().filter(n -> n.getPrecio() < 10).forEach(n -> System.out.print(n + " "));



        ArrayList<String> list2 = new ArrayList<>();
        list2.add("\nasdad");
        list2.add("asdadasd");
        list2.add("asdadas");


    }}
