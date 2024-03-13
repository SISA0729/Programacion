package SegundaEvaluacion.poo.clasesyobjetos.teoria.ejemplosEstaticos;

public class Main {
    public static void main(String[] args) {
        Clase objeto1 = new Clase("Primer objeto");
        System.out.println(objeto1 + "contarObjetos = " + Clase.contarObjetos);
        Clase objeto2 = new Clase("Segundo objeto");
        System.out.println(objeto2 + "contarObjetos = " + Clase.contarObjetos);
        Clase objeto3 = new Clase("Tercer objeto");
        System.out.println(objeto3 + "contarObjetos = " + Clase.contarObjetos);

        // ahora llamamos a los métodos
        objeto1.imprimirCosas();
        Clase.imprimirOtrasCosas();
    }
}
