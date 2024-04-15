package ejercicios.stream.ejercicio2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainEjercicio2 {
    public static void main(String[] args) {
        List<Personaje> personajes = new ArrayList<>();
        personajes.add(new Personaje("Gandalf",Integer.max(0,10),"Bastion",false));
        personajes.add(new Personaje("Aragorn",88,"Espada",true));
        personajes.add(new Personaje("Gimli",140,"Hacha",false));
        personajes.add(new Personaje("Legolas",2931,"Arco",false));
        personajes.add(new Personaje("Boromir",41,"Espada",true));
        personajes.add(new Personaje("Frodo",51,"Anillo",false));
        personajes.add(new Personaje("Sam",33,"Espada",false));

        System.out.println("Filtrar los personajes que sean jóvenes (menos de 90 años) y lleven espada.\n");
        personajes.stream().filter(personaje -> personaje.getEdad() < 90 && personaje.getArma() == "Espada").forEach(n -> System.out.println(n + " "));

        System.out.println("\nFiltrar los personajes que no usan espada. \n");
        personajes.stream().filter(personaje -> personaje.getArma() != "Espada").forEach(n -> System.out.println(n + " "));
        System.out.println("\nMuestra los personajes ordenados por orden alfabético.\n");
        personajes.stream().sorted((p1,p2) -> p1.getNombre().compareTo(p2.getNombre())).forEach(n -> System.out.println(n + " "));

        System.out.println("\nMuestra los personajes humanos.\n");
        personajes.stream().filter(personaje -> personaje.isHumano()).forEach(n -> System.out.println(n + " "));

        System.out.println("\nMuestra el personaje más viejo.\n");
        personajes.stream().sorted((p1,p2) -> p2.getEdad() - p1.getEdad()).limit(1).forEach(n -> System.out.println(n + " "));
    }
}
