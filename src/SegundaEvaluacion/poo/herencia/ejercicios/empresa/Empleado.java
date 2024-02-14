package SegundaEvaluacion.poo.herencia.ejercicios.empresa;

import java.time.LocalDate;

public class Empleado extends Persona{
    protected double sueldoBruto;

    public Empleado(String nombre, LocalDate fechaNacimiento, double sueldoBruto) {
        super(nombre, fechaNacimiento);
        if (sueldoBruto <= 0){
            this.sueldoBruto = 15786;
        }else {
            this.sueldoBruto = sueldoBruto;
        }

    }

    @Override
    public String toString() {
        return "Empleado{" +
                "sueldoBruto=" + sueldoBruto +
                '}';
    }

    @Override
    public void mostrar() {
        System.out.println("\nDATOS EMPLEADO: ");
        System.out.println("Esto de persona: ");
        System.out.println(super.toString());
        System.out.println("Y esto de empleado");
        System.out.println(this.toString());
        System.out.println("Sueldo neto: " + this.calcularSalarioNeto());
    }

    public double calcularSalarioNeto(){
        double salarioNeto = sueldoBruto - sueldoBruto * 15/100;
        return salarioNeto;
    }
}
