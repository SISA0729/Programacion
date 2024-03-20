package Biblioteca;

import java.util.Comparator;

public class CompararFechaNaci implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Socio socio1 = (Socio) o1;
        Socio socio2 = (Socio) o2;

        if (socio1.getFechaNacimiento().isBefore(socio2.getFechaNacimiento())){
            return -1;
        } else if (socio1.getFechaNacimiento().isAfter(socio2.getFechaNacimiento())) {
            return 1;
        }else {
            return 0;
        }
    }
}
