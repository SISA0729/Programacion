package teoria.claseobject;

public class MainObject {
    public static void main(String[] args) {
        EjemploObject eo = new EjemploObject("Objeto", 1);

        // por tener implementado el método toString basta meter al objeto en un sout
        System.out.println(eo);

        // puedo saber la ruta de la clase a la que pertenece este objeto
        // con el método getClass()
        String rutaClase = String.valueOf(eo.getClass());
        System.out.println("Esta clase está en: " + rutaClase);


    }

}
