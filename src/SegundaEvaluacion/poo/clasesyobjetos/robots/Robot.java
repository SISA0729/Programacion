package SegundaEvaluacion.poo.clasesyobjetos.robots;

public class Robot {
    //  Crea una clase Robot con dos atributos de tipo String: nombre y modelo, y un atributo int duración.
    private String nombre;
    private String modelo;
    private int duracion;

    // Añade tres constructores:
    //Un constructor sin parámetros que cree objetos de nombre “Anónimo” y modelo “Desconocido” (no modifica el valor por defecto de duración).

    public Robot() {
        this.nombre = "Anónimo";
        this.modelo = "Desconocido";
    }

    //Un constructor con (tres) parámetros que, recibe valores e inicializa cada uno de los tres atributos de los objetos que se crean.

    public Robot(String nombre, String modelo, int duracion) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.duracion = duracion;
    }

    //Un constructor con (dos) parámetros que recibe por parámetro nombre y modelo al crearse un objeto. En el cuerpo del constructor invocamos al constructor de tres parámetros, con el nombre y modelo recibidos y una duración de 20 años. -> esto se hace con la palabra this()


    public Robot(String nombre, String modelo) {
        // En el cuerpo del constructor invocamos al constructor de tres parámetros, con el nombre y modelo recibidos y una duración de 20 años.
        this(nombre, modelo, 20);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}
