package SegundaEvaluacion.poo.clasesyobjetos.teoria.ejemplosEstaticos;

public class Main {
    public static void main(String[] args) {
        Clase objeto1 = new Clase("Primera");
        System.out.println(objeto1 + " " + Clase.contarObjetos);

        Clase objeto2 = new Clase("Segunda");
        System.out.println(objeto2 + " " + Clase.contarObjetos);

        Clase objeto3 = new Clase("Tercera");

        System.out.println(objeto3 + " " + Clase.contarObjetos);

        //ahora llamamo a los metodos

        objeto1.imprimirCosas();
        Clase.imprimirOtrasCosas();
    }
}
