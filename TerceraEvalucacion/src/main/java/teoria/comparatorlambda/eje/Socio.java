package teoria.comparatorlambda.eje;

import java.time.LocalDate;
import java.util.Comparator;

/**
 * Creamos una clase Socio (de biblioteca, por ejemplo), con los siguientes atributos:
 * número identificativo del socio,
 * nombre y
 * fecha de nacimiento,
 * Un constructor parametrizado. También queremos un método toString() algo personalizado
 * (esto ya sabemos hacerlo, no lo ponemos aquí).
 * Vamos a suponer que queremos ordenar a los socios por por fechas de nacimiento.
 * Entonces, implementamos la interfaz Comparable, que nos obliga a sobreescribir e
 * implementar el método compareTo(Object o):
 */
public class Socio implements Comparable {
    private int id;
    private String nombre;
    private LocalDate fechaNaci;

    public Socio(int id, String nombre, LocalDate fechaNaci) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNaci = fechaNaci;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNaci() {
        return fechaNaci;
    }

    public void setFechaNaci(LocalDate fechaNaci) {
        this.fechaNaci = fechaNaci;
    }

    @Override
    public String toString() {
        return id + " | " + nombre + " | " + fechaNaci;
    }

    @Override
    public int compareTo(Object o) {
        Socio s = (Socio) o;
        if (this.fechaNaci.isBefore(s.fechaNaci)){
            return 1;
        } else if (this.fechaNaci.isAfter(s.fechaNaci)) {
            return -1;
        }else {
            return 0;
        }
    }
}
