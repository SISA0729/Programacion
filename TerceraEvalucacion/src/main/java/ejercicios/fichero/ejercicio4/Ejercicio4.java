package ejercicios.fichero.ejercicio4;

import java.io.*;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String doc = teclado.nextLine();
        String ruta = "TerceraEvalucacion/src/main/java/ejercicios/fichero/ejercicio4/" + doc;
        File fichero = new File(ruta);
        try {
            if (fichero.createNewFile()){
                System.out.println("CREADO");
            }else {
                System.out.println("No se ha podido");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
