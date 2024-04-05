package ejercicios.lambda.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Felipe R", 54,new String[]{"Nauseas", "Mareos"});
        Paciente paciente2 = new Paciente("Irene M", 32,new String[]{"Tos", "Cansancio", "Mareos"});
        Paciente paciente3 = new Paciente("Carmen C", 15,new String[]{"Ansiedad"});
        Paciente paciente4 = new Paciente("Santiago A", 8,new String[]{"Fractura de cadera"});
        Paciente paciente5 = new Paciente("Isabel A", 60,new String[]{"Tos", "Amnesia", "Fiebre", "Dolor"});

        List<Paciente> pacientes = new ArrayList<>();
        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);
        pacientes.add(paciente4);
        pacientes.add(paciente5);

        System.out.println("Segun entran en la lista: ");
        System.out.println(pacientes);
        System.out.println("Ordenados por nombre: ");
        pacientes.sort((p1,p2) -> p1.getNombre().compareTo(p2.getNombre()));
        System.out.println(pacientes);
        System.out.println("Ordenados por nombre (desendente): ");
        pacientes.sort((p1,p2) -> p2.getNombre().compareTo(p1.getNombre()));
        System.out.println(pacientes);
        System.out.println("Ordenados por edad: ");
        pacientes.sort((p1,p2) -> p1.getEdad() - p2.getEdad());
        System.out.println(pacientes);
        System.out.println("Ordenados por edad (desendente): ");
        pacientes.sort((p1,p2) -> p2.getEdad() - paciente1.getEdad());
        System.out.println(pacientes);
        System.out.println("Ordenados por n de sintomas: ");
        pacientes.sort((p1,p2) -> p1.getSintomas().length - p2.getSintomas().length);
        System.out.println(pacientes);
        System.out.println("Ordenados por n de sintomas(desendiente): ");
        pacientes.sort((p1,p2) -> p2.getSintomas().length - p1.getSintomas().length);
        System.out.println(pacientes);



    }
}
