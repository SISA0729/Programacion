package ejercicios.lambda.ejercicio4;

import java.util.function.Function;

public class MainEjercicio4 {
    public static void main(String[] args) {
        // Define una función para devolver la longitud de un String.
        Function<String,Integer> funcion1 = s -> s.length();
        int longitud = funcion1.apply("Que duros los viernes");
        System.out.println(longitud);

        //Define una función que devuelva el cuadrado de un entero.
        Function<Integer,Integer> funcion2 = integer -> (int) Math.pow(integer, 2);
        int cuadrado = funcion2.apply(25);
        System.out.println(cuadrado);
        //Define una función que devuelva el 10% de una cantidad.
        Function<Double,Double> funcion3 = aDouble -> aDouble * 0.10;
        double diezporcien = funcion3.apply(1200.0);
        System.out.println(diezporcien);
    }
}
