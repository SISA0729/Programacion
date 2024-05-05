package teoria.comparatorlambda;

import biblioteca.CompararFechasNacimiento;
import biblioteca.Socio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        biblioteca.Socio socio1 = new biblioteca.Socio("Caleb", "Calvo", LocalDate.of(2000, 12, 1));
        biblioteca.Socio socio2 = new biblioteca.Socio("Blas", "Blez", LocalDate.of(2010, 12, 1));
        biblioteca.Socio socio3 = new biblioteca.Socio("Fermín", "Fez", LocalDate.of(1999, 1, 1));
        biblioteca.Socio socio4 = new biblioteca.Socio("Alba", "Álvarez", LocalDate.of(2005, 10, 10));

        // los añadimos a un arraylist
        ArrayList<biblioteca.Socio> socios = new ArrayList<>();
        socios.add(socio1);
        socios.add(socio2);
        socios.add(socio3);
        socios.add(socio4);
        imprimirSocios(socios);

        socios.sort(((o1, o2) -> {
            Socio s1 = (Socio) o1;
            Socio s2 = (Socio) o2;

            if (s1.getFechaNac().isBefore(s2.getFechaNac())) {
                return -1;
            } else if (s1.getFechaNac().isAfter(s2.getFechaNac())) {
                return 1;
            } else {
                return 0;
            }
        }));

        System.out.println("Ordenados por fecha de nacimiento");
        imprimirSocios(socios);

    }

    public static void imprimirSocios(ArrayList<biblioteca.Socio> socios) {
        for (Socio socio: socios) {
            System.out.println(socio);
        }
    }
}
