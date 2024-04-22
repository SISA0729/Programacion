package teoria.ficheros;

import javax.imageio.IIOException;
import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Ejemplofile {
    public static void main(String[] args) {

        File fichero = new File("TerceraEvalucacion/src/main/java/teoria/ficheros/fichero.txt");

        System.out.println(fichero.exists());
        System.out.println(fichero.getAbsolutePath());
        System.out.println(fichero.canRead());

        File ficheroNuevo = new File("TerceraEvalucacion/src/main/java/teoria/ficheros/ficheronuevo.txt");

        Boolean file = ficheroNuevo.delete();

    }
}
