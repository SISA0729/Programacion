package SegundaEvaluacion.poo.clasesyobjetos.cajero;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente cuentaCorriente2 = new CuentaCorriente("11111A", 123213);
        System.out.println(cuentaCorriente2);

        CuentaCorriente cuentaCorriente3 = new CuentaCorriente("111111A","isamel",54004);

        System.out.println(cuentaCorriente3);
        System.out.println("*********************** GESTOR ***********************");
        Gestor gestor1 = new Gestor("ismaael","9929");

        System.out.println(gestor1);
        System.out.println(cuentaCorriente2);



    }
}
