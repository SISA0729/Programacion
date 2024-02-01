package SegundaEvaluacion.poo.clasesyobjetos.ejercito;

public class Main {
    public static void main(String[] args) {
        Unidad unidad1 = new Unidad("Primera");
        Unidad unidad2 = new Unidad("Segunda");
        Unidad unidad3 = new Unidad("Tercera");
        Unidad unidad4 = new Unidad("Cuarta");
        Unidad unidad5 = new Unidad("Quinta");
        Caballero caballero1 = new Caballero("Cid");
        Caballero caballero2 = new Caballero("Quijote");
        Caballero caballero3 = new Caballero("Lancelot");
        General general1 = new General("SISA");
        Medico medico1 = new Medico("johan");


        imprimirEjercicto();

    }
    public static void imprimirEjercicto(){
        System.out.println("MI ejercicto tiene: ");
        System.out.println("Unidades: " + Unidad.unidades);
        System.out.println("Caballeros: " + Caballero.caballeros);

    }
}
