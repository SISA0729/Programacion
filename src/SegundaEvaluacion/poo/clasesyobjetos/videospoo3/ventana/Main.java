package SegundaEvaluacion.poo.clasesyobjetos.videospoo3.ventana;

public class Main {
    public static void main(String[] args) {
        Ventana ventana1 = new Ventana(100,30,Color.AMARILLO);

        System.out.println(ventana1);
        ventana1.aparecer();

        int a = ventana1.getAncho();
        System.out.println(a);

    }
}
