package teoria.ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjemploScanner {
    public static void main(String[] args) {
        String ruta = "TerceraEvalucacion/src/main/java/teoria/ficheros/";
        File fichero = new File( ruta + "ficheros1.txt");
        Scanner lector = null;
        try {
            lector = new Scanner(fichero);
            while (lector.hasNext()){
                String linea = lector.nextLine();
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            lector.close();
            System.out.println("Fin");
        }

    }
}
