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

        String ruta = "TerceraEvalucacion/src/main/java/teoria/ficheros/";
        //CREAR UN DIRECTORIO
        try {
            File drectorio = new File(ruta + "carpeta");
            boolean creada = drectorio.mkdir();
            if (creada){
                System.out.println("Oki, Carpeta creada");
            }else {
                System.out.println("Ya existe");
            }
        }catch (Exception e){
            System.out.println("Ha ocurrido una excepcion " + e.getMessage());
        }

        //CAMBIAR SU NOMBRE ES CAMBIAR LA RUTA
        try {
            File nuevonombre = new File(ruta + "fichero.md");
            File ficheroActual = new File(ruta + "fichero.txt");
            boolean renombramos = ficheroActual.renameTo(nuevonombre);
            if (renombramos){
                System.out.println("Nombre cambiado");
            }else {
                System.out.println("Sigue con el mismo nombre");
            }
        }catch (Exception e){
            System.out.println("A OCURRIDO UNA EXCEPCIÓN");
        }

        //vamos a meter fichero.txt en carpeta

        try {
            File nuevoSitio = new File(ruta + "carpeta/fichero.md");
            File sitioActual = new File(ruta + "fichero.md");
            boolean movido = sitioActual.renameTo(nuevoSitio);
            if (movido){
                System.out.println("Oki. REubicado");
            }else {
                System.out.println("No movido");
            }
        }catch (Exception e){
            System.out.println("A OCURRIDO UNA EXCEPCIÓN");
        }
    }
}
