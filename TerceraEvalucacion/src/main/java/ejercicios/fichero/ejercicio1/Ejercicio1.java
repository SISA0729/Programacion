package ejercicios.fichero.ejercicio1;

import java.io.File;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // empezamos con la ruta
        String ruta = "TerceraEvaluacion\\src\\main\\java\\";
        System.out.println("Introduce una ruta dentro de la carpeta java: ");
        File fichero = new File(ruta + teclado.nextLine());
        if (fichero.exists()) {
            System.out.println("El fichero existe.");
            // sólo si existe pregunto si es un directorio o un fichero
            if (fichero.isDirectory()) {
                System.out.println("Se trata de un directorio.");
            } else {
                System.out.println("Se trata de un fichero.");
                // en caso de ser un fichero
                System.out.println("Nombre: " + fichero.getName());
                System.out.println("Tamaño: " + fichero.length() + " bytes");
                // si tiene permiso de lectura : r; de escritura: w, de ejecución: x; ausencia de permiso, -
                String permisos = "";
                // lectura
                if (fichero.canRead()) {
                    permisos = permisos + "r";
                } else {
                    permisos = permisos + "-";
                }

                // escritura
                if (fichero.canWrite()) {
                    permisos = permisos + "w";
                } else {
                    permisos = permisos + "-";
                }

                // ejecución
                if (fichero.canExecute()) {
                    permisos = permisos + "x";
                } else {
                    permisos = permisos + "-";
                }
                System.out.println("Permisos: " + permisos);
            }
        } else {
            System.out.println("El fichero no existe.");
        }
    }
}
