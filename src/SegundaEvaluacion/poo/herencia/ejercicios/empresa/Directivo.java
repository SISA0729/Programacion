package SegundaEvaluacion.poo.herencia.ejercicios.empresa;

import java.time.LocalDate;
import java.util.Scanner;

public class Directivo extends Empleado{
    private Categoria categoria;

    public Directivo(String nombre, LocalDate fechaNacimiento, double sueldoBruto, Categoria categoria) {
        super(nombre, fechaNacimiento, sueldoBruto);
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "categoria=" + categoria +
                ", sueldoBruto=" + sueldoBruto +
                '}';
    }


    @Override
    public void mostrar() {

            System.out.println("\nDATOS DEL DIRECTIVO: ");
            super.mostrar();
            System.out.println(this.toString());

    }
    public void asignarPlus (){
        sueldoBruto = sueldoBruto + pedirPlus();
    }

    private double pedirPlus(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Imtroduce plus:");
        double plus = teclado.nextDouble();
        return plus;
    }

    @Override
    public double calcularSalarioNeto() {
        double salarioNeto = sueldoBruto - sueldoBruto * 5 / 100;
        return salarioNeto;
    }
}
