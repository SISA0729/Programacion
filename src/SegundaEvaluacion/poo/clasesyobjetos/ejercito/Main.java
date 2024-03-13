package SegundaEvaluacion.poo.clasesyobjetos.ejercito;

public class Main {
    public static void main(String[] args) {
        // Crea los siguientes objetos:
        // 5 de tipo Unidad,
        Unidad unidad1 = new Unidad("Primera");
        Unidad unidad2 = new Unidad("Segunda");
        Unidad unidad3 = new Unidad("Tercera");
        Unidad unidad4 = new Unidad("Cuarta");
        Unidad unidad5 = new Unidad("Quinta");
        // 3 de tipo Caballero,
        Caballero caballero1 = new Caballero("Quijote");
        Caballero caballero2 = new Caballero("Lancelot");
        Caballero caballero3 = new Caballero("William Wallace");
        // 1 General,
        General general = new General("Marshall");
        // 1 Médico.
        Medico medico = new Medico("Severo Ochoa");

        // Muestra cuántos objetos de cada tipo contiene nuestro ejército.
        imprimirEjercito();
    }

    public static void imprimirEjercito() {
        System.out.println("Mi ejército tiene:");
        System.out.println(" * "+ Unidad.unidades + " unidades");
        System.out.println(" * " + Caballero.caballeros + " caballeros");
        System.out.println(" * " + General.generales + " generales");
        System.out.println(" * " + Medico.medicos + " médicos");
    }
}
