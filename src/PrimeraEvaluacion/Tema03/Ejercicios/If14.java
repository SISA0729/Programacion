package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Random;

public class If14 {
    public static void main(String[] args) {
        String[] palabras = {"manzana", "pera", "banana", "naranja", "fresa"};

        String palabraGenerada = generarPalabraAleatoria(palabras);
        System.out.println("Palabra generada: " + palabraGenerada);
    }

    public static String generarPalabraAleatoria(String[] palabras) {
        Random rand = new Random();
        int indice = rand.nextInt(palabras.length);
        return palabras[indice];
    }
}
