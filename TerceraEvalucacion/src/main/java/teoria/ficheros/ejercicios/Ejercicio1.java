package teoria.ficheros.ejercicios;

import java.io.File;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String ruta = "TerceraEvalucacion/src/main/java/";
        File fichero = new File(ruta + teclado.nextLine());
        if (fichero.exists()){
            System.out.println("EL FICHERO EXISTE");
            if (fichero.isDirectory()){
                System.out.println("ES UN DIRECTORIO");
            }else {
                System.out.println("ES UN FICHERO");
                System.out.println(fichero.getName());
                System.out.println(fichero.length());
                if (fichero.canRead()){
                    System.out.println("PERMISOS DE LEECTURA");
                }
            }
        }else {
            System.out.println("NO EXISTE");
        }
    }
}
