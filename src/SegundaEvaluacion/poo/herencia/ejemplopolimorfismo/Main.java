package SegundaEvaluacion.poo.herencia.ejemplopolimorfismo;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AnimalMitologico animalMitologico = new AnimalMitologico();
        // superclase = new subclase
        AnimalMitologico quimera = new Quimera();

        AnimalMitologico dragon = new Dragon();

        animalMitologico.saludar();
        quimera.saludar();
        dragon.saludar();

        ArrayList<AnimalMitologico> animalMitologicos = new ArrayList<>();
        animalMitologicos.add(animalMitologico);
        animalMitologicos.add(quimera);
        animalMitologicos.add(dragon);

        System.out.println();
        for (AnimalMitologico elemento : animalMitologicos){
            elemento.saludar();
        }

        Dragon fuji = new Dragon();
        animalMitologicos.add(fuji);

    }
}
