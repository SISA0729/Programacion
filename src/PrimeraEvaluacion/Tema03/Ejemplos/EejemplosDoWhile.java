package PrimeraEvaluacion.Tema03.Ejemplos;

import java.util.Scanner;

public class EejemplosDoWhile {
    public static void main(String[] args) {
        // el mismo ejemplo de while pero con do-while
        int i = 0;
        do {
            System.out.println(i); // en este caso siempre imprime 0
            i++;
        } while (i < 11);

        // Otro ejemplo
        // Imprimir todos los múltiplos de 5 hasta un número introducido por teclado
        // Ejercicio 28 pero en vez de for con do while
        // NOTA: un buen entrenamiento puede ser hacer los ejercicios de for con while
        // Ejemplo: n = 54; tiene que imprimir 5, 10, 15... 50

        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        // reutilizo la i que tenía ya declarada para recoger el número por teclado
        // tenemos que inicializar la i
        i = 1;
        do {
            // si i es múltiplo de 5 (al dividirlo por 5, el resto da 0, lo  imprimo
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= n);
    }
}
