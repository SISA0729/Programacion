package SegundaEvaluacion.poo.herencia.banco;

public class CuentaCorrienteEmpresa extends CuentaCorriente{
    double interesDescuento;
    double maximoDescuento;

    public CuentaCorrienteEmpresa(Persona titular, double saldo, String IBAN) {
        super(titular, saldo, IBAN);
    }
}
