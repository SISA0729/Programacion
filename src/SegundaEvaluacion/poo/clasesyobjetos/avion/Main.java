package SegundaEvaluacion.poo.clasesyobjetos.avion;

public class Main {
    public static void main(String[] args) {
        Avion primero = new Avion("Airbus A320", 26, 100, 6.7);

        System.out.println(primero.getNombre());
        System.out.println(primero.getAforo());
        System.out.println(primero.getVelocidad());
        System.out.println(primero.getCordenadas());
    }
}

