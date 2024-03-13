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
        System.out.println("\n\nDATOS DEL DIRECTIVO: ");
        super.mostrar();
        System.out.println(this.toString());
    }

    // LOS DIRECTIVOS COBRAN UN PLUS POR EL HECHO DE SERLO. ADEMÁS, SE ASIGNA, A DEDO, ES DECIR, SE PIDE POR TECLADO: AÑADIR MÉTODOS: ASIGNAR PLUS, QUE INCREMENTA EL SALARIO BRUTO EN EL PLUS QUE PIDAMOS POR TECLADO (PEDIRLO EN OTRO MÉTODO: PEDIRPLUS(): DOUBLE). SOBREESCRIBIR EL MÉTODO CALCULAR SALARIO NETO PORQUE POR INGENIERÍA FINANCIERA SÓLO SE DESCUENTAN UN 5% DEL SALARIO BRUTO.
    public void asignarPlus() {
        double plus = pedirPlus();
        sueldoBruto = sueldoBruto + plus;
    }

    // PIDAMOS POR TECLADO (PEDIRLO EN OTRO MÉTODO: PEDIRPLUS(): DOUBLE)
    // private porque solamente quiero que sea llamado dentro de esta clase, desdel el método asignarPlus()
    private double pedirPlus() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce plus: ");
        return teclado.nextDouble();
    }

    // CALCULAR SALARIO NETO PORQUE POR INGENIERÍA FINANCIERA SÓLO SE DESCUENTAN UN 5% DEL SALARIO BRUTO.


    @Override
    public double calcularSalarioNeto() {
        double salarioNeto = sueldoBruto - sueldoBruto * 5 / 100;
        return salarioNeto;
    }
}
