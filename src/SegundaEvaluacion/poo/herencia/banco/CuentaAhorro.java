package SegundaEvaluacion.poo.herencia.banco;

public class CuentaAhorro extends CuentaBancaria{
    double tia;

    public CuentaAhorro(Persona titular, double saldo, String IBAN) {
        super(titular, saldo, IBAN, true);
    }
}
