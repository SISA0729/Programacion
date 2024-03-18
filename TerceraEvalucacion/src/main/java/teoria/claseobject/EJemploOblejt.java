package teoria.claseobject;

public class EJemploOblejt {
    String nombre;
    int id;

    public EJemploOblejt(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }



    @Override
    public String toString() {
        return "nombre "+ nombre + "\nid " + id;
    }
}
