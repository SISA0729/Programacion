package PrimeraEvaluacion.Tema02.ejemplos.variables;

import java.util.Random;

public class EjemplosRambom {
    public static void main(String[] args) {
        Random generador = new Random();
        int numeroaleatorio = generador.nextInt(10);
        // vamos a generar y mostrar 100 numeros aleatorios con un for
        for (int i =0; i < 100; i++){
            System.out.print(numeroaleatorio + " ");
            numeroaleatorio = generador.nextInt(0, 11);
            // en general, si quieres generar nuemeros ente min y max
            // haces generador.nestInt(min, max + 1)

        }
         //queremos generar 50 numeros
        for (int i = 0; i < 50;i++ ){
            System.out.print(generador.nextInt(-10,11) + " ");
        }


    }
}
