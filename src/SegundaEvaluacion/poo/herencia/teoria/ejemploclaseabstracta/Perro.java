package SegundaEvaluacion.poo.herencia.teoria.ejemploclaseabstracta;

public class Perro extends Mascota{
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void dice() {
        System.out.println("KLK MANITO");
    }
}
