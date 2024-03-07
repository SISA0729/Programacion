package SegundaEvaluacion.poo.herencia.ejercicios.empresa;

import java.time.LocalDate;

public class Empleado extends Persona{
    protected double sueldoBruto;

    public Empleado(String nombre, LocalDate fechaNacimiento, double sueldoBruto) {
        super(nombre, fechaNacimiento);
        if (sueldoBruto <= 0) {
            this.sueldoBruto = 15786;
        } else {
            this.sueldoBruto = sueldoBruto;
        }
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "sueldoBruto=" + sueldoBruto +
                '}';
    }

    // sobreescribe el método mostrar para que muestre los valores del atributo propio y de los heredados;

    @Override
    public void mostrar() {
        System.out.println("\n\nDATOS DEL EMPLEADO: ");
        System.out.println("Esto de Persona: ");
        System.out.println(super.toString());
        System.out.println("Y esto del empleado: ");
        System.out.println(this.toString());
        System.out.println("Sueldo neto: " + this.calcularSalarioNeto() + " €");
    }

    // tiene el método calcularSalarioNeto():double, que descuenta un 15% al salario bruto y devuelve el valor resultante.
    public double calcularSalarioNeto() {
        double salarioNeto = sueldoBruto - sueldoBruto * 15 / 100;
        return salarioNeto;
    }
}
