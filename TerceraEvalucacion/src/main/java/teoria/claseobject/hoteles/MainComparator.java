package teoria.claseobject.hoteles;

import java.util.ArrayList;

public class MainComparator {
    public static void main(String[] args) {
        Hotel hotel5 = new Hotel("1","PLAYA",75);
        Hotel hotel6 = new Hotel("2","PLAYA",90);
        Hotel hotel7 = new Hotel("3","PLAYA",85);

        ArrayList<Hotel> hoteles = new ArrayList<>();

        hoteles.add(hotel5);
        hoteles.add(hotel6);
        hoteles.add(hotel7);

        CompararPrecio compararPrecio = new CompararPrecio();
        hoteles.sort(compararPrecio);
        imprimir(hoteles);

        System.out.println();
        System.out.println("Ordenar precio ");
        hoteles.sort(compararPrecio.reversed());
        imprimir(hoteles);

        System.out.println();
        System.out.println("Ordenar por id ");
        CompararHotel compararHotel = new CompararHotel();
        hoteles.sort(compararHotel);
        imprimir(hoteles);

        System.out.println();
        hoteles.sort(compararHotel.reversed());
        imprimir(hoteles);
    }

    public static void imprimir(ArrayList<Hotel> hoteles){
        for (Hotel hotel: hoteles){
            System.out.println(hotel);
        }
    }

}
