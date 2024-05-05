package teoria.ficheros;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class EjemploFile {
    public static void main(String[] args) {
        // Este método nos dice qué carácter separador hay en las rutas;
        System.out.println(File.separator);

        // Creamos un objeto de tipo file pasándole la ruta en la que está ese fichero
        // Truco para averiguar la ruta relativa: empezamos con la ruta absoluta y vamos quitando cosas hasta que exists() devuelve true
        String ruta = "TerceraEvaluacion\\src\\main\\java\\teoria\\ficheros\\";
        File fichero = new File(ruta + "fichero.txt");
        // Queremos comprobar que ese fichero existe
        System.out.println("El fichero existe: " + fichero.exists());

        // Ahora vamos a probar con el fichero java
        File otroFichero = new File(ruta + "EjemploFile.java");
        System.out.println("El fichero java existe: " + otroFichero.exists());

        System.out.println("\n\nCON LA CLASE FILE PODEMOS ACCEDER A LAS PROPIEDADES DEL FICHERO");
        System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());
        System.out.println("Se puede leer (r): " + fichero.canRead());
        System.out.println("Se puede escribir (w): " + fichero.canWrite());
        System.out.println("Se puede ejecutar (x): " + fichero.canExecute());
        // pendiente de investigar para pasarlo a algo legible
        System.out.println("Fecha última modificación: " + fichero.lastModified());


        System.out.println("\n\nCON LA CLASE FILE TAMBIÉN PODEMOS GESTIONAR FICHEROS");
        File ficheroNuevo = new File(ruta + "ficheroNuevo.txt");
        // para crear el fichero tengo que utilizar el método createNewFile -> devuelve un boolean, que es interesante comprobar
        try {
            // lo meto en el try porque a lo mejor no se crea el fichero y se produce un error
            boolean creado = ficheroNuevo.createNewFile();
            if (creado) {
                System.out.println("El fichero se creó correctamente");
            } else {
                if (ficheroNuevo.exists()) {
                    System.out.println("El fichero ya existe. No se puede crear");
                }
            }
        } catch (IOException excepcionES) {
            System.out.println("No se ha podido crear el fichero" + excepcionES.getMessage());
        }

        System.out.println("\n\nTambién podemos eliminar ficheros.");
        boolean borrado = ficheroNuevo.delete();
        if (borrado) {
            System.out.println("El fichero se ha eliminado correctamente.");
        } else {
            System.out.println("El fichero no se ha podido eliminar");
        }

        // CREAR UN DIRECTORIO
        // 1) Primero, creamos la ruta a partir de la cual queremos crear ese directorio
        // esto ya lo tenemos, en la variable String ruta

        // 2) Creamos el directorio/s, guardando el resultado
        try {
            File directorio = new File(ruta + "carpeta");
            boolean creada = directorio.mkdir();
            if (creada) {
                System.out.println("Oki. Carpeta creada");
            } else {
                System.out.println("Por lo que sea no se ha podido crear (probablemente ya exista)");
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido una excepción. " + e.getMessage());
        }


        // RENOMBRAR: EN LINUX mv sirve tanto para renombrar como para cambiar de sitio (porque cuando haces eso en realidad para el sistema operativo el nombre de cada fichero es su ruta completa).
        // pues aquí lo mismo, pero con el método renameTo
        // ejemplo: vamos a renombrar fichero.txt por fichero.md
        try {
            // 1) Creo un objeto file con el nuevo nombre
            File nuevoNombre = new File(ruta + "fichero.md");
            // 2) Creo un objeto file con el fichero en su sitio actual o con su nombre actual
            File nombreActual = new File(ruta + "fichero.txt");
            // 3) renombramos el fichero
            boolean renombrado = nombreActual.renameTo(nuevoNombre);
            if(renombrado) {
                System.out.println("Nombre cambiado.");
            } else {
                System.out.println("Por lo que sea sigue con el mismo nombre.");
            }

        } catch (Exception e) {
            System.out.println("Ha ocurrido una excepción. " + e.getMessage());
        }

        // ahora metemos el fichero fichero.md en el directorio carpeta
        try {
            // 1) Objeto con la nueva ruta
            File nuevoSitio = new File(ruta + "carpeta\\fichero.md");
            // 2) Objeto con el fichero donde está actualmente
            File sitioActual = new File(ruta + "fichero.md");
            // 3) aplicamos el renameTo al fichero actual
            boolean movido = sitioActual.renameTo(nuevoSitio);
            if(movido) {
                System.out.println("Oki. Reubicado.");
            } else {
                System.out.println("Por lo que sea no ha podido moverse.");
            }

        } catch (Exception e) {
            System.out.println("Ha ocurrido una excepción. " + e.getMessage());
        }

    }
}
