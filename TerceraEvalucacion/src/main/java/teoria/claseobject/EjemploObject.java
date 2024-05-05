package teoria.claseobject;

public class EjemploObject {
    // esta clase y todas las demás heredan de Object
    String nombre;
    int id;

    public EjemploObject(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    @Override
    public String toString() {
        return "EjemploObject{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                '}';
    }
}
