package ejercicios.fichero.ejercicio7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Escribir un programa que lea texto por teclado y lo escriba en un fichero llamado datos.txt.
 * El proceso consiste en leer una línea de texto por teclado y escribirla en el fichero.
 * Este proceso se repite hasta que se introduce por teclado la cadena FIN (da igual que sea en mayúsculas o minúsculas). La cadena FIN que indica el final de lectura no se debe escribir en el fichero.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        // primero preparamos todo para poder escribir en el fichero
        String ruta = "TerceraEvaluacion/src/main/java/ejercicios/ficheros/detexto/ejercicio7/datos.txt";
        File fichero = new File(ruta);

        // ahora ponemos lo que vamos a necesitar dentro del try...catch.. finally

        // para escribir en el fichero: un FileWriter
        FileWriter fw = null;

        // para leer por teclado: Scanner
        Scanner teclado = null;


        try {

            // ahora instanciamos el FileWriter y el Scanner
            fw = new FileWriter(fichero, true);
            teclado = new Scanner(System.in);

            // y ahora empieza el ejercicio en sí
            // El proceso consiste en leer una línea de texto por teclado y escribirla en el fichero.
            String linea = teclado.nextLine();

            while (!linea.equalsIgnoreCase("fin")) {
                fw.write(linea + "\n");
                // antes de salir del while pido otra línea
                linea = teclado.nextLine();
            }



        } catch (IOException e) {
            System.out.println("Excepción de entrada / salida. " + e.getMessage());

        } finally {
            // aquí cerramos FileWriter y Scanner
            try {
                fw.close();
                teclado.close();
            } catch (IOException e) {
                System.out.println("No se ha podido cerrar el fw");
            }


        }


    }
}
