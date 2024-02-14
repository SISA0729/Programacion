package SegundaEvaluacion.poo.herencia.ejercicios.empresa;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("ismael", LocalDate.of(2000,2,1));
        persona.mostrar();

        Empleado empleado = new Empleado("Sisa",LocalDate.of(2993,10,10),35000);
        empleado.mostrar();

        //System.out.println(empleado.calcularSalarioNeto());

        Cliente cliente = new Cliente("ISMAEL",LocalDate.of(2020,2,2),"123456789");
        cliente.mostrar();
        Cliente cliente2 = new Cliente("ISMAEL",LocalDate.of(2020,2,12),"123A569");
        cliente2.mostrar();

        Directivo directivo = new Directivo("SISA",LocalDate.of(2002,8,19),2122,Categoria.sisa);
        System.out.println("Directivo sin plus");
        directivo.mostrar();
        System.out.println("Directivo con PLus");
        directivo.asignarPlus();
        directivo.mostrar();

        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(empleado);
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);

        Empresa empresa = new Empresa();
        System.out.println(empresa);
        empresa.mostrar();
    }


}
