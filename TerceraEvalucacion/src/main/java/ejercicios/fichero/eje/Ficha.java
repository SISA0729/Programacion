package ejercicios.fichero.eje;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ficha {
    public static void main(String[] args) {
        // Escribir datos en un archivo
        escribirArchivo("datos.txt", "Hola mundo!\nEsto es un ejemplo de archivo en Java.");

        // Leer datos desde el archivo y mostrarlos
        List<String> lineas = leerArchivo("datos.txt");
        System.out.println("Contenido del archivo:");
        for (String linea : lineas) {
            System.out.println(linea);
        }
    }

    // Método para escribir en un archivo
    public static void escribirArchivo(String nombreArchivo, String contenido) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write(contenido);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    // Método para leer desde un archivo
    public static List<String> leerArchivo(String nombreArchivo) {
        List<String> lineas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return lineas;
    }
}
