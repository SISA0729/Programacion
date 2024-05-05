package teoria.ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploScannerNextInt {
    public static void main(String[] args) {
        // LECTURA DE FICHEROS CON Scanner
        // 1) Objeto file
        String ruta = "TerceraEvaluacion\\src\\main\\java\\teoria\\ficheros\\";
        File fichero = new File(ruta + "fichero1.txt");
        // 2) Creamos un Scanner y le pasamos el fichero
        Scanner lector = null; // lo declaramos antes del try para poder cerrarla en finally
        try {

            lector = new Scanner(fichero); // aquí pilla el fichero para leerlo

            int suma = 0; // inicializo suma antes del while para poder mostrarla después del mismo
            // leemos el fichero con un bucle while
            while (lector.hasNext()) {
                // como el fichero está lleno de números, queremos sumarlos todos -> en vez de nextLine utilizamos nextInt
                // leo el siguiente número
                int numero = lector.nextInt();
                // lo sumo
                suma = suma + numero;
            }
            System.out.println("Todos los números del fichero suman: " + suma);

        } catch (FileNotFoundException e) {
            System.out.println("NO encuentra el fichero." + e.getMessage());
        } catch (InputMismatchException e2) {
            System.out.println("El fichero contiene algo que no es un int");
        } catch (Exception e) {
            System.out.println("Excepción no prevista." + e.getMessage());
            e.printStackTrace();
        } finally {
            // el código de finally se ejecuta SIEMPRE, tanto si ha saltado una excepción (y por tanto se ha metido en un catch) como si no
            // aquí nos interesa cerrar todos los objetos que hayamos abierto en try
            lector.close();
            System.out.println("Fin");
        }

    }
}
