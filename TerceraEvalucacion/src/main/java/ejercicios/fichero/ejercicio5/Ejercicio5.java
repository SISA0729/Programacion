package ejercicios.fichero.ejercicio5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Escribe un programa en Java que encuentre el número más grande en el fichero dataset_91007.txt
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        // lo primero es abrir el fichero y comprobar que somos capaces de leer los números
        String ruta = "TerceraEvaluacion/src/main/java/ejercicios/ficheros/detexto/ejercicio5/dataset_91007.txt";
        File fichero = new File(ruta);
        if (fichero.exists()) {
            // si el fichero existe, lo abrimos y leemos número a número
            Scanner lector = null;

            try {

                lector = new Scanner(fichero);

                // ahora lo vamos recorriendo con un while, pero ANTES
                // CREAMOS UNA VARIABLE AUXILIAR PARA LLEVAR EL MÁXIMO TEMPORAL Y LA INICIALIZAMOS CON EL PRIMER NÚMERO DEL FICHERO
                int maximoTemporal = lector.nextInt();

                while (lector.hasNext()) {
                    // leemos el siguiente número del fichero y lo
                    int numero = lector.nextInt(); // guardamos el siguiente número en una variable

                    // si el número que acabamos de leer es mayor que el guardado temporalmente, lo reemplazamos
                    if (numero > maximoTemporal) {
                        maximoTemporal = numero;
                    }
                }

                // cuando terminemos de leer el archivo tendremos ya el número mayor
                System.out.println(maximoTemporal);


            } catch (FileNotFoundException e) {
                System.out.println("Excepción de entrada / salida " + e.getMessage());
            } finally {
                lector.close();
            }


        } else {
            System.out.println("El fichero no existe o la ruta es incorrecta");
        }
    }
}
