package teoria.ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjemplosScannerNextInt {
    public static void main(String[] args) {
        String ruta = "TerceraEvalucacion/src/main/java/teoria/ficheros/";
        File fichero = new File( ruta + "ficheros1.txt");
        Scanner lector = null;
        try {
            int suma = 0;
            lector = new Scanner(fichero);
            while (lector.hasNext()){
                int numero = lector.nextInt();
                suma = suma + numero;
                System.out.println("SUMA: " + suma);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            lector.close();
            System.out.println("Fin");
        }

    }
}
