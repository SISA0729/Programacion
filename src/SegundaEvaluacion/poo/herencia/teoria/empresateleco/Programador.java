package SegundaEvaluacion.poo.herencia.teoria.empresateleco;

import java.time.LocalDate;
import java.util.Arrays;

public class Programador extends Empleado{
    protected String[] lenguajes;

    public Programador(String nombre, int añoNacimiento, String dirección, LocalDate fechaInicio, Long salario, String[] lenguajes) {
        super(nombre, añoNacimiento, dirección, fechaInicio, salario);
        this.lenguajes = lenguajes;
    }

    public Programador() {
        super("", 0, "", LocalDate.of(2000, 1,1), 0L);
    }

    public String[] getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String[] lenguajes) {
        this. lenguajes = lenguajes;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "lenguajes=" + Arrays.toString(lenguajes) +
                ", fechaInicio=" + fechaInicio +
                ", salario=" + salario +
                ", nombre='" + nombre + '\'' +
                ", añoNacimiento=" + añoNacimiento +
                ", dirección='" + dirección + '\'' +
                '}';
    }

    // Escribe un método que permita añadir un lenguaje al programador.
    public void añadirLenguaje(String lenguaje) {
        // como este método tiene que ser llamado por un programador ya creado
        // que tendrá un String[] con un cierto tamaño que no se puede ampliar
        String[] lenguajesMasUno = new String[lenguajes.length + 1];
        for (int i = 0; i < lenguajes.length; i++) {
            lenguajesMasUno[i] = lenguajes[i];
        }
        // en la última posición añado el lenguaje nuevo
        lenguajesMasUno[lenguajesMasUno.length - 1] = lenguaje;
        // y lo asignamos al atributo lenguajes
        this.lenguajes = lenguajesMasUno;

    }
    //Sobrecarga el método, de forma que reciba el nuevo lenguaje y los años de experiencia, y solamente añada el lenguaje al array en caso de que la experiencia sea mayor a 2 años.


}
