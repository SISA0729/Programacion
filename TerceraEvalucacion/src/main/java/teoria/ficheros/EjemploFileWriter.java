package teoria.ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploFileWriter {
    public static void main(String[] args) {
        // Hay cuatro constructores, pero nos fijaremos en los que contienen File
        // FileWriter(File file); -> le pasas un file y te añade texto nuevo a un fichero PERO SI EL FICHERO YA EXISTÍA Y CONTENÍA ALGO, TE LO VA A MACHACAR.

        //FileWriter(File file, boolean append); -> SI PONES FIleWriter(fichero, true) no machacas la información que hubiera, sino que se añade lo nuevo al final

        // Ejemplo:
        // 1) Objeto file
        String ruta = "TerceraEvaluacion\\src\\main\\java\\teoria\\ficheros\\";
        File fichero = new File(ruta + "escribir.txt");

        // 2) Objeto FileWriter pasándole el objeto file (con/sin append, según nos interese)
        FileWriter fw = null;
        try {
            fw = new FileWriter(fichero);
            // 3) Escribir con el método write
            fw.write("Hola");
            fw.write("\ncaracola");
        } catch (IOException e) {
            System.out.println("Se ha producido una excepción de E/S. Posibles razones: \n1) el “archivo” con ese nombre existe, pero es un directorio;\n" +
                    "2) el archivo no existe y no se puede crear; \n" +
                    "3) existe el archivo pero no se puede abrir. \n");
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                System.out.println("NO se puede cerrar el fichero." + e.getMessage());
            }
        }


    }
}
