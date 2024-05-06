package teoria.comparatorlambda.eje.Hote;

import teoria.comparatorlambda.eje.CompararID;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Hotel> hotels = new ArrayList<>();
    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        int opcion;
        do {
            System.out.println("\nMenu:");
            System.out.println("1-Mayor a menor");
            System.out.println("2-menor a mayor");
            System.out.println("3-ordenar id");
            System.out.println("4-ordenar id inverso");
            System.out.println("5-añadir Hotel");
            System.out.println("6-eliminar hotel");
            System.out.println("7-salir");
            System.out.println();
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    uno();
                    break;
                case 2:
                    dos();
                    break;
                case 3:
                    tres();
                    break;
                case 4:
                    cuatro();
                    break;
                case 5:
                    cinco();
                    break;
                case 6:
                    seis();
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        }while (opcion != 7);
    }
    public static void imprimir(ArrayList<Hotel> hotels){
        for (Hotel hotel: hotels){
            System.out.println(hotel);
        }
    }
    public static void uno(){
        Collections.sort(hotels);
        imprimir(hotels);
    }
    public static void dos(){
        Collections.sort(hotels, Comparator.comparingDouble(Hotel::getPrecio));
        imprimir(hotels);
    }
    public static void tres(){
        //ordenado de mayor a menor
        hotels.sort((h1, h2) -> Integer.compare(h2.getId(), h1.getId() ));
        imprimir(hotels);
    }
    public static void cuatro(){
        hotels.sort(Comparator.comparingInt(Hotel::getId));
        imprimir(hotels);
    }
    public static void cinco(){
        System.out.println("ID");
        int id = teclado.nextInt();teclado.nextLine();
        System.out.println("ZONA");
        String zona = teclado.nextLine();
        System.out.println("PRECIO");
        double precio = teclado.nextDouble();
        Hotel hotel = new Hotel(id,zona,precio);
        hotels.add(hotel);
        System.out.println("Hotel Agregado");
    }
    public static void seis(){
        if (hotels.isEmpty()){
            System.out.println("No hay hoteles");
            return;
        }
        System.out.println("Lista de hoteles");
        imprimir(hotels);

        int id = teclado.nextInt();
        if (id >= 0 && id < hotels.size()){
            hotels.remove(id);
            System.out.println("Hotel eliminado");
        }else {
            System.out.println("fuerade rango");
        }
    }



}
