package teoria.function;

import ejercicios.lambda.ejercicio1.Persona;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class EjemplosFunction {
    public static void main(String[] args) {
        // Por ejemplo: utilizamos Function para calcular el cuadrado de un número:
        // la función recibe un Double, calcula su cuadrado y lo devuelve (otro Double)
        Function<Double, Double> cuadrado = x -> Math.pow(x,2);
        Double resultado = cuadrado.apply(1.25);
        System.out.println(resultado);

        // vamos a poner un ejemplo de replaceAll con una lista de personas
        List<ejercicios.lambda.ejercicio1.Persona> personas = new ArrayList<>();
        personas.add(new ejercicios.lambda.ejercicio1.Persona("Carlos", 29));
        personas.add(new ejercicios.lambda.ejercicio1.Persona("Óscar", 15));
        personas.add(new ejercicios.lambda.ejercicio1.Persona("Kamilly", 18));
        personas.add(new ejercicios.lambda.ejercicio1.Persona("Sergio",  13));
        personas.add(new ejercicios.lambda.ejercicio1.Persona("Ana",  8));
        personas.add(new Persona("Alejandro",  55));
        System.out.println("Recién creada la lista: ");
        System.out.println(personas);

        Map<String, Integer> mapaEdades = new HashMap<>();
        mapaEdades.put("Carlos", 29);
        mapaEdades.put("Óscar", 15);
        mapaEdades.put("Kamilly", 18);
        mapaEdades.put("Sergio",  13);
        mapaEdades.put("Ana",  8);
        Function<Integer, Integer> aumentarEdad = edad -> edad + 1;
        mapaEdades.replaceAll((nombre, edad) -> aumentarEdad.apply(edad));
        mapaEdades.forEach((nombre, edad) -> System.out.println(nombre + " " + edad));




    }
}
