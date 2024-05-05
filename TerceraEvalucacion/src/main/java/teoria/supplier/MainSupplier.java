package teoria.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class MainSupplier {
    public static void main(String[] args) {
        // vamos a utilizar un supplier que genere un número aleatorio
        Random generador = new Random();
        Supplier<Integer> numeroRandom = () -> generador.nextInt(1,1001);
        int numero = numeroRandom.get();
        System.out.println(numero);
    }
}
