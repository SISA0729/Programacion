package SegundaEvaluacion.poo.clasesyobjetos.edificio;

public class Main {
    public static void main(String[] args) {
        // objeto creamos lso objetos de tipo edificio
        Edificio micasa = new Edificio(4,50,1966);
        Edificio tucasa = new Edificio(6,100,2015);

        // MOstrar los atributos
        System.out.println("MI casa tiene " + micasa.getPlantas() + " platas " + micasa.getMetros2() + " metros cuadrados y fue contruida en " + micasa.getAño());
        System.out.println("TU casa tiene " + tucasa.getPlantas() + " platas " + tucasa.getMetros2() + " metros cuadrados y fue contruida en " + tucasa.getAño());
    }
}
