package teoria.consumer;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;

import static java.lang.System.*;

public class MainConsumer {
    public static void main(String[] args) {
        Consumer<String> consumer1 = nombre -> System.out.println("Hola " + nombre);
        consumer1.accept("Iván");

            // creamos un arraylist y lo rellenamos con 25 números aleatorios entre 1 y 1000
        ArrayList<Integer> numeros = new ArrayList<>();
        Random generador = new Random();
        for (int i = 0; i < 25; i++) {
            numeros.add(generador.nextInt(1,1001));
        }
        // queremos imprimirlos
        out.println("Sin ordenar: ");
        numeros.forEach(integer -> out.print(integer + " "));

        // pero queremos imprimirlos ordenados de menor a mayor
        out.println("\nOrdenados de menor a mayor");

        numeros.sort((n1, n2) -> n1 - n2);
        numeros.forEach(integer -> out.print(integer + " "));

        // quiero imprimir solamente los pares ordenados de mayor a menor
        out.println("\nNumeros pares de mayor a menor");
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .sorted((n1, n2) -> n2 - n1)
                .forEach(numero -> out.print(numero + " "));

    }
}
