package SegundaEvaluacion.poo.herencia.banco;

public abstract class CuentaBancaria {
    Persona titular;
    double saldo;
    String IBAN;

    boolean remunerado;

    public CuentaBancaria(Persona titular, double saldo, String IBAN, boolean remunerado) {
        this.titular = titular;
        this.saldo = saldo;
        this.IBAN = IBAN;
        this.remunerado = remunerado;
    }



}
