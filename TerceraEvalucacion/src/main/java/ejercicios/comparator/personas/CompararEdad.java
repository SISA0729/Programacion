package ejercicios.comparator.personas;

import java.util.Comparator;

public class CompararEdad implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Personas p1 = (Personas) o1;
        Personas p2 = (Personas) o2;
        if (p1.getEdad() < p2.getEdad()){
            return -1;
        } else if (p1.getEdad() > p2.getEdad()) {
            return 1;
        }else {
            return 0;
        }
    }
}
