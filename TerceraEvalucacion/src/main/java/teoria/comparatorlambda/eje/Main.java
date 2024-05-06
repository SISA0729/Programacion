package teoria.comparatorlambda.eje;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Socio socio1 = new Socio(2,"ismael", LocalDate.of(2022,3,2));
        Socio socio3 = new Socio(3,"ismael", LocalDate.of(2023,3,2));
        Socio socio4 = new Socio(4,"ismael", LocalDate.of(2021,3,2));
        Socio socio2 = new Socio(1,"sisa", LocalDate.of(2024,4,1));

        ArrayList<Socio> socios = new ArrayList<>();
        socios.add(socio1);
        socios.add(socio2);
        socios.add(socio3);
        socios.add(socio4);

        CompararID compararID = new CompararID();
        socios.sort(compararID);
        imprimir(socios);

        System.out.println(socio1.getNombre().equals(socio3.getNombre()));
    }
    public static void imprimir(ArrayList<Socio> socios){
        for (Socio socio: socios) {
            System.out.println(socio);
        }
    }
}
