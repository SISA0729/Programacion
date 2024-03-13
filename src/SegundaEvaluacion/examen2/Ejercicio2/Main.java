package SegundaEvaluacion.examen2.Ejercicio2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // creamos un empleado
        Empleado empleado1 = new Empleado(LocalDate.of(2000, 3, 8));
        // le asignamos un nombre
        empleado1.setNombreCompleto("Mar Muro Tapia");

        // creamos otro empleado
        Empleado empleado2 = new Empleado(LocalDate.of(1999, 10, 15));
        // le asignamos un nombre
        empleado2.setNombreCompleto("Nicolás Colás Colás");
        // cambiamos su fecha de contrato
        empleado2.setFechaContrato(15, 3, 2020);
        // aumentamos su sueldo un 5,5%
        empleado2.aumentarSueldo(5.5);


        // creamos un tercer empleado
        Empleado empleado3 = new Empleado(LocalDate.of(1978, 5, 5));
        empleado3.setNombreCompleto("Jon Juárez Jiménez");

        // hacemos que empleado 2 supervise a empleado1 y empleado3
        empleado1.asignarSupervisor(empleado2);
        empleado1.mostrarDatosEmpleado();
        System.out.println("\n");
        empleado3.asignarSupervisor(empleado2);
        empleado3.mostrarDatosEmpleado();
        System.out.println("\n");
        empleado2.asignarSupervisado(empleado1);
        empleado2.asignarSupervisado(empleado3);
        empleado2.mostrarDatosEmpleado();

        // mostramos el número de empleados creados:
        System.out.println("\nNº de empleados: " + Empleado.contador);
    }
}
