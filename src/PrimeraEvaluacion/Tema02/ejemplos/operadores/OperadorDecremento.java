package PrimeraEvaluacion.Tema02.ejemplos.operadores;

public class OperadorDecremento {
    public static void main(String[] args) {
        // Operador de incremento sirve para una unidad a una variable de tipo emtero
        int variable = 10;
        System.out.println(variable + " antes de decremento");
        variable--; // incremnto la variable en una unidad
        System.out.println(variable + " despues de decremento");
        variable--; // incremnto la variable en una unidad
        System.out.println(variable + " despues de decremento");

        // es lo mismo que hacer variable = variable + 1

        variable = variable - 1;
        System.out.println(variable + " despuesde restarle 1");

        // tambien se puede poner asi; variable += 1
        variable -= 1;
        System.out.println(variable + " despuesde poner -= 1");

    }
}
