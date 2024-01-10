package SegundaEvaluacion.poo.clasesyobjetos.hotel;

import SegundaEvaluacion.poo.clasesyobjetos.avion.Avion;

public class Main {
    public static void main(String[] args) {

        Hotel sisa = new Hotel(1,Zona.playa, 5000);

        System.out.println(sisa);
        sisa.setPrecio(600);
        System.out.println(sisa);

    }
}
