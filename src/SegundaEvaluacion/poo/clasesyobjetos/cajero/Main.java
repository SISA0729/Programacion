package SegundaEvaluacion.poo.clasesyobjetos.cajero;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n************ CUENTA CORRIENTE ************************");
        // creamos una cuenta
        System.out.println("\n1) Primer constructor (dos parámetros: dni y nombre");
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente("11111111A", "Perico Palotes");
        System.out.println(cuentaCorriente1);
        System.out.println("2) Realizamos operaciones y actualizamos la libreta");
        //cuentaCorriente1.sacarDinero();
        //cuentaCorriente1.ingresarDinero();
        //cuentaCorriente1.sacarDinero();
        //cuentaCorriente1.actualizarLibreta();

        // probamos el constructor: //Con el DNI del titular de la cuenta y un saldo inicial.
        System.out.println("\n2) Segundo constructor (dos parámetros: dni y saldo");
        CuentaCorriente cuentaCorriente2 = new CuentaCorriente("22222222B", 50000);
        System.out.println(cuentaCorriente2);
        System.out.println("\n3) Tercer constructor (tres parámetros)");
        // probamos el constructor:  //Con el DNI, nombre y el saldo inicial.
        CuentaCorriente cuentaCorriente3 = new CuentaCorriente("33333333C", "Petete", 10000);
        System.out.println(cuentaCorriente3);

        // probamos que podemos crear un gestor con el constructor con dos parámetros
        System.out.println("\n\n************ GESTOR ************************");
        Gestor gestor1 = new Gestor("Curro", "123456789");
        System.out.println(gestor1);

        // añadimos este gestor a la cuenta corriente1
        System.out.println("\n\nAñadimos este gestor a la primera cuenta corriente y mostramos los datos también de la segunda cuenta");

        cuentaCorriente1.setGestor(gestor1);
        System.out.println(cuentaCorriente1);
        System.out.println(cuentaCorriente2);

        System.out.println("\n\nAprovechamos y añadimos un banco");
        cuentaCorriente1.setBanco("Santander");
        System.out.println(cuentaCorriente1);

        // comprobamos modificadores de acceso de los atributos de CuentaCorriente
        System.out.println(cuentaCorriente1.dni); // porque estoy en el mismo paquete
        //System.out.println(cuentaCorriente1.saldo); -> no, es private
        System.out.println(cuentaCorriente1.nombre); // es public

    }
}
