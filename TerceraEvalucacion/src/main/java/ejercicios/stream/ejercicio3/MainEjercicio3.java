package ejercicios.stream.ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainEjercicio3 {
    public static void main(String[] args) {
    String animales = "Abadejo, Abejaruco, Abeja, Abejorro, Águila, Alacrán, Antílope, Babuino, Bacalao, Ballena, Barracuda, Bisonte, Búho, Caballo, Cebra, Chimpancé, Ciervo, Conejo, Cotorra, Coyote, Delfín, Dromedario, Elefante, Erizo, Foca, Gacela, Golondrina, Guepardo, Halcón, Hiena, Hormiga, Hurón, Iguana, Jabalí, Jirafa, Kiwi, Koala, Lagarto, Lince, Lobo, Mapache, Medusa, Mosca, Murciélago, Nutria, Ñu, Oso, Oveja, Paloma, Pantera, Perezoso, Reno, Ruiseñor, Salamandra, Sapo, Serpiente, Tiburón, Tigre, Tortuga, Urraca, Vaca, Yak, Zorro.";
        ArrayList<String> list = new ArrayList<>();

        //for (String elemento: animales.split(", ")) {
        //    list.add(elemento);
        //}
        //System.out.println(list);
        list.stream().forEach(n -> System.out.println(n + " "));

        System.out.println("==============================================");
        String[] arrayanimales = animales.split(", ");
        list.addAll(Arrays.asList(arrayanimales));


        Scanner teclado = new Scanner(System.in);

        System.out.print("Letra: ");
        String letra = teclado.nextLine().substring(0,1).toLowerCase();
        list.stream().filter(animal -> animal.toLowerCase().startsWith(letra)).forEach(n -> System.out.println(n + " "));

        System.out.println();
        System.out.println("Quien tiene el nombre mas largo ");
        list.stream().sorted((p1,p2) -> p2.length() - p1.length()).max((a1, a2) -> a1.length() - a2.length()).stream().forEach(n -> System.out.println(n + " "));

        System.out.println();
        System.out.println("IMPRIME CUATRO ");


    }
}
