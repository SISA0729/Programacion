package SegundaEvaluacion.poo.herencia.banco;

public class CuentaCorrientePersonal extends CuentaCorriente{
    double comisionMantenimiento;

    public CuentaCorrientePersonal(Persona titular, double saldo, String IBAN) {
        super(titular, saldo, IBAN);
    }
}
