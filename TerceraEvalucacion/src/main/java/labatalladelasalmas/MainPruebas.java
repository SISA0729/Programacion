package labatalladelasalmas;

import java.util.Random;

public class MainPruebas {
    public static void main(String[] args) {
        // creamos un ángel de prueba
        Angel angel1 = new Angel(500);
        angel1.mostrar();

        // creamos un demonio de prueba
        Demonio demonio1 = new Demonio(400);
        demonio1.mostrar();

        // creamos un humano
        Humano humano1 = new Humano(50);
        humano1.mostrar();

        Random generador = new Random();
        for (int i = 0; i < 17; i++) {
            int num = generador.nextInt(1, 101);
            System.out.print(num + " ");
            if (i % 2 == 0) {
                humano1.rezar();
            } else {
                humano1.pecar();
            }
        }

        humano1.mostrar();
    }
}
