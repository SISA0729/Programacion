package SegundaEvaluacion.poo.herencia.teoria.empresateleco;

import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        // Vamos a crear un objeto de tipo Programador y a rellenar los atributos heredados utilizando los setters heredados. Para leer los valores de los atributos podemos utilizar getters heredados también.
        Programador programador = new Programador( );

        System.out.println(programador);

        // setters heredados de Persona
        programador.setAñoNacimiento(2000);
        programador.setNombre("Pikachu");
        programador.setDirección("Calle Pez, 5");

        // setters heredados de Empleado
        programador.setFechaInicio(LocalDate.of(2023,9,7));
        programador.setSalario(50000L);
        System.out.println(programador);

        // setter de la propia clase Programador
        programador.setLenguajes(new String[]{"Java", "SQL", "HTML"});
        System.out.println(programador);
        // probamos el método añadirLenguaje de Programador (ver apuntes pag. 8)
        programador.añadirLenguaje("Ruby");
        System.out.println(programador);


    }
}
