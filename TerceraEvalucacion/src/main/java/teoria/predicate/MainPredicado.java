package teoria.predicate;

import java.util.function.Predicate;

public class MainPredicado {
    public static void main(String[] args) {
        // utilizamos predicados cuando pasamos un valor por parámetro y queremos que devuelva un boolean (true/false)
        // Ejemplo: es millenial si ha nacido entre 1981 y 1996 ambos inclusive
       // boolean predicado1 = esMillenial(1990);
        // ahora con la sintaxis de Predicate
        Predicate<Integer> predicado1 = año -> (año >= 1981 && año <= 1996);
       System.out.println( predicado1.test(1950));

    }

    public static boolean esMillenial(int año) {
       return (año >= 1981 && año <= 1996);
    }

}
