package teoria.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class EjemplosFunction {
    public static void main(String[] args) {
        //Function para calcular el cuadrado de un numero
        Function<Double,Double> numero = x -> Math.pow(x,2);
        double resultado = numero.apply(1.25);
        System.out.println(resultado);

        Map<String, Integer> mapaEdades = new HashMap<>();
        mapaEdades.put("Carlos",29);
        mapaEdades.put("Oscar",15);
        mapaEdades.put("Sisa",18);
        mapaEdades.put("Johan",13);
        mapaEdades.put("Ana",8);

        Function<Integer,Integer> aumentarEdad = edad -> edad + 1;
        mapaEdades.replaceAll((nombre, edad ) -> aumentarEdad.apply(edad));

        mapaEdades.forEach((nombre, edad) -> System.out.println(nombre + " " + edad));


    }
}
