package ejercicios.fichero.ejercicio6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
Escribir un programa que lea el contenido del fichero br.txt y muestre la información que almacena, de forma que muestre en lineas diferentes los fragmentos separados por un asterisco.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        String ruta = "TerceraEvaluacion/src/main/java/ejercicios/ficheros/detexto/ejercicio6/br.txt";
        File fichero = new File(ruta);
        // vamos a ver si existe el fichero (por si las moscas...)
        if (fichero.exists()) {
            System.out.println("Comenzando la lectura......\n\n");
            Scanner lector = null;
            try {
                lector = new Scanner(fichero);

                // el fichero tiene todo el texto en la misma linea, por que no hace falta iterar con un while
                String texto = lector.nextLine();
                String[] frases = texto.split("\\*"); // truco: el * necesita un doble carácter de escape

                Arrays.stream(frases).forEach(frase -> System.out.println(frase));



            } catch (FileNotFoundException e) {
                System.out.println("Fichero no encontrado");
            } finally {
                lector.close();
            }

        } else {
            System.out.println("Tengo mal la ruta.");
        }
    }
}
