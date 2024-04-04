package Biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Socio socio1 = new Socio("Caleb","Calvo", LocalDate.of(2000,12,1));
        Socio socio2 = new Socio("Blas","Blez", LocalDate.of(2010,12,1));
        Socio socio3 = new Socio("Fermín","Fez", LocalDate.of(1999,1,1));
        Socio socio4 = new Socio("Alba","Alvarez", LocalDate.of(2005,10,10));

        ArrayList<Socio> socios = new ArrayList<>();

        socios.add(socio1);
        socios.add(socio2);
        socios.add(socio3);
        socios.add(socio4);

        //Collections.sort(socios);
        System.out.println("ORDEN NORMAL: ");
        System.out.println("==============================");
        imprimir(socios);

        System.out.println();
        System.out.println("ORDNEAR POR FECHA NACIMIENTO: ");
        System.out.println("==============================");
        CompararFechaNaci naci = new CompararFechaNaci();
        socios.sort(naci);
        imprimir(socios);

        System.out.println();
        System.out.println("ORDENAR EN ORDEN INVERSE: ");
        System.out.println("==============================");
        socios.sort(naci.reversed());
        imprimir(socios);

        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Socio s1 = (Socio) o1;
                Socio s2 = (Socio) o2;

                if (s1.getFechaNacimiento().isBefore(s2.getFechaNacimiento())){
                    return -1;
                } else if (s1.getFechaNacimiento().isAfter(s2.getFechaNacimiento())){
                    return 1;
                }else {
                    return 0;
                }
            }
        };

    }

    public static void imprimir(ArrayList<Socio> socios){
        for (Socio socio : socios){
            System.out.println(socio);
        }
    }


}
