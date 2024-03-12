package SegundaEvaluacion.examen2.Ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
public class Empleado extends Persona{
    private double sueldoBruto;
    private LocalDate fechaContrato;
    public static int contador;
    Empleado supervisor;
    ArrayList<Empleado> supervisados;
    public Empleado(LocalDate fechaNacimiento) {
        super(fechaNacimiento);
        contador++;
        this.sueldoBruto = 15876;
        this.fechaContrato = LocalDate.now();
        this.supervisados = new ArrayList<>();
    }

    @Override
    public String getNombreCompleto() {
        return this.apellido1 + " " + this.apellido2 + ", " + this.nombre;
    }

    @Override
    public void setNombreCompleto(String nombreCompleto) {
        String[] palabras = nombreCompleto.split(" ");
        this.nombre = palabras[0];
        this.apellido1 = palabras[1];
        this.apellido2 = palabras[2];
    }

    public void aumentarSueldo(double porcentaje) {
        this.sueldoBruto = sueldoBruto + sueldoBruto * porcentaje / 100.0;
    }

    public void asignarSupervisor(Empleado empleado) {
        this.supervisor = empleado;
    }


    public void asignarSupervisado(Empleado empleado) {
        supervisados.add(empleado);
    }

    public void quitarSupervisado(Empleado empleado) {
        supervisados.remove(empleado);
    }

    public void setFechaContrato(int dd, int mm, int aaaa) {
        this.fechaContrato = LocalDate.of(aaaa, mm, dd);
    }

    public void mostrarDatosEmpleado() {
        System.out.println();
        System.out.println(apellido1 + " " + apellido2 + ", " + nombre);
        System.out.println("Fecha de nacimiento: " + this.fechaNacimiento);
        System.out.println("Fecha de contrato: " + this.fechaContrato);
        System.out.printf("Salario: %.2f €",  sueldoBruto);
        System.out.print("\nSupervisado por: ");
        if (supervisor == null) {
            System.out.printf(" nadie");
        } else {
            System.out.printf(supervisor.getNombreCompleto());
        }
        if (supervisados.size() > 0) {
            System.out.println("\nSupervisa a: ");
            for (int i = 0; i < supervisados.size(); i++) {
                System.out.println("* " + supervisados.get(i).getNombreCompleto());
            }
        }
    }
}
