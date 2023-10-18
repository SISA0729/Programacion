package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Random;

public class If22 {
    public static void main(String[] args) {
        Random generador = new Random();
        int numero = 0;
        int suma = 0;
        for (int i =0; i < 10; i++){
            numero = generador.nextInt(1, 11);
            suma = suma + numero;
            System.out.println(numero);
        }
        double media = suma / 10.0;

        System.out.printf("Media = %.2f", media);

    }
}
