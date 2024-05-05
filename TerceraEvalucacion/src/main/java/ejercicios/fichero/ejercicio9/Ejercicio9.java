package ejercicios.fichero.ejercicio9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Escribir un programa que busque una palabra o un fragmento en un fichero de texto. --> leer
 * El programa pedirá que se introduzca una palabra o un texto por teclado y realizará su búsqueda por el archivo.
 * Se mostrará por pantalla el número de línea y el contenido de la línea del fichero que contiene la cadena buscada.
 * Si la cadena buscada aparece en varias líneas se mostrarán todas ellas.
 * Si el fichero no contiene el texto buscado se mostrará un mensaje indicándolo.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        // preparamos todo para la lectura. Elegimos este mismo fichero (Ejercicio9.java)
        String ruta = "TerceraEvaluacion/src/main/java/ejercicios/ficheros/detexto/ejercicio9/Ejercicio9.java";
        File fichero = new File(ruta);

        // necesitamos un Scanner para leer por teclado y otro para leer el fichero
        Scanner teclado = null;
        Scanner lector = null;

        // también necesitamos un contador para las líneas (con cada iteración se incrementa en 1)
        int numLinea = 0;

        // también necesito un boolean para identificar si el texto está o no en el fichero
        boolean encontrado = false;

        // ahora instancio los Scanner
        try {
            lector = new Scanner(fichero);
            teclado = new Scanner(System.in);

            // pedimos lo que queremos buscar
            System.out.println("Texto a buscar: ");
            String texto = teclado.nextLine();

            // ahora empezamos a buscar
            while (lector.hasNextLine()) {
                numLinea++;
                String linea = lector.nextLine();
                // veo si la linea contiene el texto
                if (linea.contains(texto)) {
                    System.out.println(numLinea + " " + linea);
                    // si entra aquí, es que hemos encontrado al menos una vez el texto en la línea
                    encontrado = true;
                }
            }

            // si no aparece, habrá recorrido todo el fichero sin meterse en el if, y por tanto encontrado seguirá a false
            if (!encontrado) {
                System.out.println("El texto indicado no aparece en el fichero.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el fichero" + e.getMessage());
        } finally {
            lector.close();
            teclado.close();
        }
    }
}
