package SegundaEvaluacion.poo.clasesyobjetos.banco;

public class Main {
    public static void main(String[] args) {
        Usuario propietario = new Usuario("demo","Ale","Chim Pom");
        System.out.println(propietario);
        Cuenta cuenta = new Cuenta("123456",1000,propietario);
        System.out.println(cuenta);
    }

}
