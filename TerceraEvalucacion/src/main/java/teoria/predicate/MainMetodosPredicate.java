package teoria.predicate;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainMetodosPredicate {
    public static void main(String[] args) {
        Socio socio1 = new Socio("Caleb", "Calvo", LocalDate.of(2000, 12, 1));
        Socio socio2 = new Socio("Blas", "Blez", LocalDate.of(2010, 12, 1));
        Socio socio3 = new Socio("Fermín", "Fez", LocalDate.of(1999, 1, 1));
        Socio socio4 = new Socio("Alba", "Álvarez", LocalDate.of(2005, 10, 10));

        // los añadimos a un arraylist
        ArrayList<Socio> socios = new ArrayList<>();
        socios.add(socio1);
        socios.add(socio2);
        socios.add(socio3);
        socios.add(socio4);

        System.out.println(socios);

        // vamos a ordenarlos por nombre
        socios.sort((s1, s2) -> s1.getNombre().compareTo(s2.getNombre()));

        // ¿cómo puedo utilizar los predicados en una lista?

        // tenemos el método removeIF -> elimina los objetos de una lista que cumplan la condición del predicado
        // por ejemplo, queremos eliminar los socios cuyo nombre comience por B
        socios.removeIf(socio -> socio.getNombre().startsWith("B"));
        // comprobamos
        System.out.println(socios);

        // lo metemos otra vez
        socios.add(socio2);

        // eliminamos los socios que hayan nacido antes del siglo XXI
        socios.removeIf(socio -> socio.getFechaNac().isBefore(LocalDate.of(2000,1,1)));
        System.out.println(socios);


    }
}
