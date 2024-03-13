package SegundaEvaluacion.poo.clasesyobjetos.teoria.hospital;

public class Main {
    public static void main(String[] args) {
        // probamos el primer constructor: sin parámetros
        Paciente paciente1 = new Paciente();
        // como no le hemos puesto constructor a la clase, utiliza el constructor por defecto, es decir, el constructor "invisible" que crea Java si tú no le pones ninguno
        System.out.println(paciente1);
        // si quiero añadir datos, lo tengo que hacer a través de métodos
        paciente1.setNombre("Jota");
        paciente1.setEdad(25);
        paciente1.setSintomas(new String[]{"Tos", "Cansancio", "Fiebre"}); // observa que creamos el array "sobre la marcha" así, sin necesidad de metero en una variable previamente
        System.out.println(paciente1);


        // probamos el segundo constructor: inicializamos el objeto con valores para los tres parámetros
        Paciente paciente2 = new Paciente("Efe", 58, new String[]{"Dolor de cabeza", "Ansiedad"});
        System.out.println(paciente2);

        // ingresa un paciente inconsciente que se ha caído en la calle. Sólo sabemos su edad
        Paciente paciente3 = new Paciente("Lucas");
        System.out.println(paciente3);


    }
}
