package ejercicios.fichero.ejercicio3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * <h2>Ejercicio 3 de ficheros</h2>
 * Partiendo del fichero nombres.csv, crear un programa
 * que permita al usuario añadir nombres nuevos
 * a ese fichero.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        String ruta = "TerceraEvalucacion/src/main/java/ejercicios/fichero/ejercicio3/nombres.csv";
        File fichero = new File(ruta);
        if (fichero.exists()){
            System.out.println("Si existe");
            FileWriter fw = null;
            try {
                fw = new FileWriter(fichero,true);
                String linea = pedirDatos();
                fw.write("\n"+linea);
            } catch (IOException e) {
                System.out.println("Excepción de entrada");
            }finally {
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }else {
            System.out.println("No existe");
        }
    }

    /**
     * Método que pide nombre y apellidos
     * @return la linea a añadir al fichero
     */
    private static String pedirDatos(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nombre: ");
        String n = teclado.nextLine().toLowerCase();
        System.out.print("Apellido: ");
        String a = teclado.nextLine().toLowerCase();
        return n + "|" + a;
    }
}
