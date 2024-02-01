package SegundaEvaluacion.poo.clasesyobjetos.teoria.ejemplosEstaticos;

public class Clase {
    private String nombre;

    int otraVariable;
    static int contarObjetos;

    public Clase(String nombre) {
        this.nombre = nombre;
        contarObjetos++;
        otraVariable++;
    }

    @Override
    public String toString() {
        return "Clase " +
                "nombre = " + nombre + " " +
                " otraVariable = " + "(" + otraVariable + ")";
    }

    public void imprimirCosas(){
        System.out.println(toString());
    }
    public static void imprimirOtrasCosas(){
        System.out.println(contarObjetos);
    }
}
