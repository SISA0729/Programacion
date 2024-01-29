package SegundaEvaluacion.poo.clasesyobjetos.teoria.hospital;

public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();
        System.out.println(paciente1);

        paciente1.setNombre("Jota");
        paciente1.setEdad(25);
        paciente1.setSintomas(new String[]{"los", "cansancios", "fiebre"});
        System.out.println(paciente1);
    }
}
