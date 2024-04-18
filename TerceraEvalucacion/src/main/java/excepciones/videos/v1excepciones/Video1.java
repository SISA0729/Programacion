package excepciones.videos.v1excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Video1 {
    public static void main(String[] args) {

        try {
            FileReader fr = new  FileReader("archivo.txt");
        } catch (FileNotFoundException e) {
            System.out.println("NO se encietra el fichero");
        }
        System.out.println("Y la vida sigue...");

        System.out.println("==================================");
         try {
             int dividendo = 10;
             int divisor = 0;
             int cociente = dividendo / divisor;
         }catch (ArithmeticException exceptionA){
             System.out.println("Ha Petado.");
             System.out.println(exceptionA.getMessage());
         }

        System.out.println("=======Exepcion del array========");
         try {
             int[] array = new int[3];
             int numero = array[3];
         }catch (ArrayIndexOutOfBoundsException exceptionLimiteArray){
             System.out.println("Te has salido");
             System.out.println(exceptionLimiteArray.getStackTrace());
         }

        System.out.println("=============================0===");
         try {
             String caddena = null;
             System.out.println(caddena.toLowerCase());
         }catch (NullPointerException exceptionNUll){
             System.out.println("Tienes que inicializar la cadena con algun valor");
         }

         SUPER CALI FRAGI LISTICO ESPI A LIDOSO;
         CICLO PENTANO PERIDRO FENAN TRENO
    }
}
