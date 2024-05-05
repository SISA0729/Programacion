package teoria.comparatorlambda;

import Biblioteca.CompararFechaNaci;
import Biblioteca.Socio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Biblioteca.Socio socio1 = new Biblioteca.Socio("Caleb", "Calvo", LocalDate.of(2000, 12, 1));
        Biblioteca.Socio socio2 = new Biblioteca.Socio("Blas", "Blez", LocalDate.of(2010, 12, 1));
        Biblioteca.Socio socio3 = new Biblioteca.Socio("Fermín", "Fez", LocalDate.of(1999, 1, 1));
        Biblioteca.Socio socio4 = new Biblioteca.Socio("Alba", "Álvarez", LocalDate.of(2005, 10, 10));

        // los añadimos a un arraylist
        ArrayList<Biblioteca.Socio> socios = new ArrayList<>();
        socios.add(socio1);
        socios.add(socio2);
        socios.add(socio3);
        socios.add(socio4);
        imprimirSocios(socios);

        socios.sort(((o1, o2) -> {
            Socio s1 = (Socio) o1;
            Socio s2 = (Socio) o2;

            if (s1.getFechaNacimiento().isBefore(s2.getFechaNacimiento())) {
                return -1;
            } else if (s1.getFechaNacimiento().isAfter(s2.getFechaNacimiento())) {
                return 1;
            } else {
                return 0;
            }
        }));

        System.out.println("Ordenados por fecha de nacimiento");
        imprimirSocios(socios);

    }

    public static void imprimirSocios(ArrayList<Biblioteca.Socio> socios) {
        for (Socio socio: socios) {
            System.out.println(socio);
        }
    }
}
