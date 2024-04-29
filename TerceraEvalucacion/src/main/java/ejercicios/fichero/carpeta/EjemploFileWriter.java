package ejercicios.fichero.carpeta;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploFileWriter {
    public static void main(String[] args) {
        //Te añade texto nuevo a un fichero, pero si el fichero ya existe y contiene algo, te lo va a machacar.

        String ruta = "TerceraEvalucacion/src/main/java/ejecicios/fichero/";
        File fichero = new File(ruta + "escribir.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(fichero);
            fw.write("HolaMundo");
            fw.write("\ncaracola");
        } catch (IOException e) {
            System.out.println("Se ha producido un error");
        }
    }
}
