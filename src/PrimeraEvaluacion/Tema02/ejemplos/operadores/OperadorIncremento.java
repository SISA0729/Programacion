package PrimeraEvaluacion.Tema02.ejemplos.operadores;

public class OperadorIncremento {
    public static void main(String[] args) {
        // Operador de incremento sirve para una unidad a una variable de tipo emtero
        int variable = 0;
        System.out.println(variable + " antes de incrementarla");
        variable++; // incremnto la variable en una unidad
        System.out.println(variable + " despues de incrementarla");variable++; // incremnto la variable en una unidad
        System.out.println(variable + " despues de incrementarla");

        // es lo mismo que hacer variable = variable + 1

        variable = variable + 1;
        System.out.println(variable + " despuesde sumarle 1");

        // tambien se puede poner asi; variable += 1
        variable += 1;
        System.out.println(variable + " despuesde poner += 1");

    }
}
