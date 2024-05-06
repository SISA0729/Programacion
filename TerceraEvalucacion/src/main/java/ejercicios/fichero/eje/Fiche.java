package ejercicios.fichero.eje;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Fiche {
    public static void main(String[] args) {
        File fichero = new File("TerceraEvalucacion\\src\\main\\java\\ejercicios\\fichero\\eje\\java.doc");
        String ruta ="TerceraEvalucacion\\src\\main\\java\\ejercicios\\fichero\\eje\\java.doc";
        File fichero2 = new File("TerceraEvalucacion\\src\\main\\java\\ejercicios\\fichero\\eje\\javwwa.doc");
        File directory = new File("TerceraEvalucacion\\src\\main\\java\\ejercicios\\fichero\\eje\\sisa\\vaasq\\sss");
        File f = new File(ruta);
        try (Scanner lector = new Scanner(f)) {
            while (lector.hasNext()) {
                System.out.print(lector.nextLine() + " ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra ningún archivo en: " + ruta);
        }

        try {
            boolean creado = fichero.createNewFile();
            boolean mkdir = directory.mkdirs();
            boolean renombre = fichero.renameTo(fichero2);
            if (renombre){
                System.out.println("Creado correctamente");
            }else {
                System.out.println("Ya existe");
            }

        } catch (IOException e) {
            System.out.println("ERROR" + e.getMessage());
        }

    }
}
