package SegundaEvaluacion.poo.clasesyobjetos.banco;

public class Main {
    public static void main(String[] args) {
        // Una instancia de la clase Usuario llamada propietario ((login: “demo”, nombre: “Ale”, apellidos “Chim Pom”)
        Usuario propietario = new Usuario("demo", "Ale", "Chim Pom");
        //System.out.println(propietario);

        // Una instancia de la clase Cuenta (“123456”, 1000, propietario).
        Cuenta cuenta = new Cuenta("123456", 1000, propietario);
        //System.out.println(cuenta);

        // Un método estático mostrarCuenta, que recibe una cuenta y muestra toda la información de la cuenta.
        mostrarCuenta(cuenta);
    }

    public static void mostrarCuenta(Cuenta cuenta){

        System.out.println(cuenta);
    }
}


