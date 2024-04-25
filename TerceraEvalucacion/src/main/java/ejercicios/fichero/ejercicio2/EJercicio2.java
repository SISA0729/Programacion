package ejercicios.fichero.ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EJercicio2 {
    public static void main(String[] args) {
        String ruta = "TerceraEvalucacion/src/main/java/ejercicios/fichero/ejercicio2/Restaurantes.csv";
        File fichero = new File(ruta);
        if (fichero.exists()){
            System.out.println("SUUU");
        }else {
            System.out.println("nuu");
        }

        //CREAMOS UN LECTOR CON SCANNER
        Scanner lector = null;
        try {
            lector = new Scanner(fichero);

            while (lector.hasNext()){
                String linea = lector.nextLine();
                String[] campos = linea.split(",");
                String cp = campos[4];
                if (cp.startsWith("6")){
                    System.out.println(campos[0] + "                " + campos[1]);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se puede crear el objeto lector");
        }finally {
            lector.close();
            System.out.println("FIN");
        }
    }
}
