package SegundaEvaluacion.poo.clasesyobjetos.cajero;

import java.util.Scanner;

public class CuentaCorriente {
    // ATRIBUTOS
    // que almacena los datos: DNI, nombre del titular y saldo.
    String dni;
    public String nombre;
    private double saldo;
    // Modificar la clase CuentaCorriente para que pueda disponer de un objeto Gestor. Escribir los métodos necesarios para consultar qué gestor tiene una cuenta corriente y también para poder cambiarlo..
    private Gestor gestor;

    // Todas las cuentas corrientes con las que se va a trabajar pertenecen al mismo banco. Añadir un atributo que almacena el nombre del banco (que es único) en la clase CuentaCorriente. Diseñar un método que permita recuperar y modificar el nombre del banco.
    private String banco;

    // CONSTRUCTOR
    //Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial será 0.

    public CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        // El saldo inicial será 0.
        this.saldo = 0;
    }

    // Sobrecarga los constructores para poder crear objetos:
    //Con el DNI del titular de la cuenta y un saldo inicial.
    public CuentaCorriente(String dni, double saldo) {
        this.dni = dni;
        this.saldo = saldo;
    }

    //Con el DNI, nombre y el saldo inicial.

    public CuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    // getters y setters -> no me dicen nada, los pondré sólo si los necesito
    // me piden un get y un set para banco

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    // toString() -> no me lo piden, pero nunca viene mal


    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", saldo=" + saldo +
                ", gestor=" + gestor +
                ", banco='" + banco + '\'' +
                '}';
    }

    // MÉTODOS DE USUARIO
    //Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación, si existe saldo suficiente.
    public void sacarDinero() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Cantidad a retirar:");
        int retirada = teclado.nextInt(); teclado.nextLine();
        // tenemos que ver si la cuenta tiene saldo suficiente
        if (saldo >= retirada) {
            saldo = saldo - retirada;
            System.out.println("Nuevo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    //Ingresar dinero: se incrementa el saldo.
    public void ingresarDinero() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Cantidad a ingresar:");
        int ingreso = teclado.nextInt(); teclado.nextLine();
        if (ingreso > 5) {
            saldo = saldo + ingreso;
            System.out.println("Nuevo saldo: " + saldo);
        } else {
            System.out.println("No puede ser.");
        }
    }
    //Mostrar información: muestra la información disponible de la cuenta corriente.
    public void actualizarLibreta() {
        System.out.println("Titular: " + nombre);
        System.out.println("Saldo: " + saldo);
        System.out.println("**** Libreta actualizada ****");
    }
}
