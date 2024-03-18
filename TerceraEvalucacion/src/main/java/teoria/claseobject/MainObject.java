package teoria.claseobject;

public class MainObject {
    public static void main(String[] args) {
        EJemploOblejt eo = new EJemploOblejt("ismael",1);
        System.out.println(eo);

        EJemploOblejt ei = new EJemploOblejt("ismael",1);


        String ruta = String.valueOf(eo.getClass());
        System.out.println("Ruta del eo = " + ruta);


    }
}
