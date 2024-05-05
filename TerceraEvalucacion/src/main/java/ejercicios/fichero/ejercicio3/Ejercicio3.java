package ejercicios.fichero.ejercicio3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
Partiendo del fichero nombres.csv, crea un programa que permita al usuario añadir nombres nuevos a ese fichero.
@author Ana
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        // 1) Ruta al fichero
        String ruta = "TerceraEvaluacion/src/main/java/ejercicios/ficheros/detexto/ejercicio3/nombres.csv";
        // 2) Objeto File
        File fichero = new File(ruta);
        if (fichero.exists()) {
            // aquí ya metemos lo que tengamos que hacer
            // que es escribir a continuación de un fichero -> tengo que poner append a true al crear el FileWriter
            FileWriter fw = null;
            try {
                fw = new FileWriter(fichero, true);
                String linea = pedirDatos();
                fw.write("\n" + linea);


            } catch (IOException e) {
                System.out.println("Excepcion de entrada / salida. " + e.getMessage());
            } finally {
                try {
                    fw.close();
                } catch (IOException e) {
                    System.out.println("El fichero no ha podido cerrarse.");
                }
            }


        } else {
            System.out.println("El fichero no existe.");
        }
    }

    /**
     * Método que pide nombre y apellidos
     * @return la línea a añadir al fichero
     */
    private static String pedirDatos() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Primer apellido: ");
        String apellido1 = teclado.nextLine();
        System.out.println("Segundo apellido");
        String apellido2 = teclado.nextLine();

        return nombre + "|" + apellido1 + "|" + apellido2;
    }
}
