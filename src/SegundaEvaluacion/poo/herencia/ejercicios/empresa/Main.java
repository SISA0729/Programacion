package SegundaEvaluacion.poo.herencia.ejercicios.empresa;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Probamos la clase Persona creando un objeto
        Persona persona = new Persona("Persi", LocalDate.of(2000, 1, 1));
        persona.mostrar();

        // Probamos la clase Empleado creando un objeto
        Empleado empleado = new Empleado("Curro", LocalDate.of(2003, 10, 10), 35000);
        empleado.mostrar();
        // System.out.println(empleado.calcularSalarioNeto());

        // Probamos la clase Cliente: uno con el teléfono bien y otro con el teléfono mal
        Cliente cliente1 = new Cliente("Capri", LocalDate.of(2005, 5, 31), "123456789");
        cliente1.mostrar();
        Cliente cliente2 = new Cliente("Chito", LocalDate.of(2005, 5, 31), "123A567");
        cliente2.mostrar();

        // Probamos la clase Directivo.
        Directivo directivo = new Directivo("Colon", LocalDate.of(2005,04,14),60000,Categoria.CIO);
        System.out.println("Directivo sin plus: ");
        directivo.mostrar();
        System.out.println("Directivo con plus: ");
        //directivo.asignarPlus();
        directivo.mostrar();

        // Probamos la clase Empresa
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(empleado);

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);

        Empresa empresa = new Empresa("Frnandy",empleados,clientes);
        empresa.mostrar();

    }


}
