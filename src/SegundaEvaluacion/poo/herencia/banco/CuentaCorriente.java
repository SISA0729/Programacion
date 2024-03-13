package SegundaEvaluacion.poo.herencia.banco;

import java.util.ArrayList;

public class CuentaCorriente extends CuentaBancaria{
    ArrayList<String> entidadesAutorizadas;

    public CuentaCorriente(Persona titular, double saldo, String IBAN) {
        super(titular, saldo, IBAN, true);
    }
}
