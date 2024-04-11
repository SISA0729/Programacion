package ejercicios.lambda.ejercicio1;

import java.util.ArrayList;
import java.util.Comparator;
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
        System.out.println("Recién creada la lista: ");
        System.out.println(personas);

        //1) Ordena por edades de menor a mayor+
        //personas.sort((p1,p2) -> p1.getEdad() - p2.getEdad());
        //System.out.println("\nOrdenados por edad (de menor a mayor)");
        //System.out.println(personas);

        //2) COgemos el que haya quedado primero
        System.out.println("Personas más joven" + personas.get(0));

        // si nos pidieran sin volver a ordnar el ultimo elemento de la lista
        //System.out.println(personas.get(personas.size() - 1));

        //07....... personas que tienen una edad mayor a 30
        personas.stream().filter(personas1 -> personas1.getEdad() > 20).forEach(System.out::println);


        //08- Crrea una lista.....
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Pan",0.99));
        productos.add(new Producto("Leche",1.1));
        productos.add(new Producto("Jamón",1));
        productos.add(new Producto("Estropajo",2.15));
        productos.add(new Producto("Dona",1.5));
        productos.add(new Producto("Doritos",1.25));
        productos.add(new Producto("CocaCola",1.25));
        productos.add(new Producto("Aceite",10.5));

        Ejercicio8 ejercicio8 =  lista8 -> {
            double suma = 0;
            for (Producto item : lista8){
                suma = suma + item.getPrecio();
            }
            return suma;
        };

        System.out.println("\nEjercicio 8");
        System.out.println("============");
        double resulado = ejercicio8.calcularTotal(productos);
        System.out.printf("%.2f",resulado);

        resulado = productos.stream().
                mapToDouble(sisa -> sisa.getPrecio()).sum();

        //09- Crea una lista de objetos de tipo Producto y
        // utiliza una exprecion lamda para ordenar la lista
        // por precio

        Comparator comparator = (o1, o2) -> {
            Producto p1 = (Producto) o1;
            Producto p2 = (Producto) o2;
            if (p1.getPrecio() > p2.getPrecio()){
                return -1;
            } else if (p1.getPrecio() < p2.getPrecio() ) {
                return 1;
            }else {
                return 0;
            }
        };
        productos.sort(comparator);
        System.out.println(productos);

        //10 Crea una lista de objeto de TIPO pRODUCTO Y utiliza
        //una expresion lambda para filtrar los productos que
        //tienen los precios menor a 10.
        productos.stream().filter(producto -> producto.getPrecio() > 10 ).forEach(System.out::println);

    };
}



