package teoria.claseobject.hoteles;

import Biblioteca.Socio;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel("1","PLAYA",75);
        Hotel hotel2 = new Hotel("2","PLAYA",90);
        Hotel hotel3 = new Hotel("3","PLAYA",85);

        System.out.println(hotel1.equals(hotel2));

        Hotel hotel4 = new Hotel("4","MONTAÑA",200);

        ArrayList<Hotel> hotels = new ArrayList<>();
        hotels.add(hotel1);
        hotels.add(hotel2);
        hotels.add(hotel3);
        hotels.add(hotel4);

        System.out.println("Hoteles: ");
        System.out.println();
        imprimir(hotels);
        System.out.println();
        System.out.println("Hoteles ordenador por precio de mayor a menor: ");
        System.out.println("===============================================");
        Collections.sort(hotels);

        imprimir(hotels);
    }

    public static void imprimir(ArrayList<Hotel> hotels){
        for (Hotel hotel: hotels){
            System.out.println(hotel);
        }
    }
}
