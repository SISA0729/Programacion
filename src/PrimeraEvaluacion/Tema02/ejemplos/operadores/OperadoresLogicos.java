package PrimeraEvaluacion.Tema02.ejemplos.operadores;

/*
    Clase del dia 2 de octubre 2023
 */

public class OperadoresLogicos {
    public static void main(String[] args) {
        // El orperador not (!) invierte el valor de la variable a la que afecta
        boolean variable = true;
        System.out.println(variable);
        variable = !variable;
        System.out.println(variable);

        // Opeeradores vinarios and, or y not
        System.out.println();
        System.out.println();

        boolean v1 = true;
        boolean v2 = true;
        boolean resultado = v1 && v2;
        boolean resu = v1 || v2;
        System.out.println("And\t" + resultado);
        System.out.println("or\t" + resu);
        v2 = false;
        resultado = v1 && v2;
        resu = v1 || v2;
        System.out.println("And\t" + resultado);
        System.out.println("or\t" + resu);
        v1 = false;
        v2 = true;
        System.out.println("And\t" + resultado);
        System.out.println("or\t" + resu);
        v1 = false;
        v2 = false;
        System.out.println("And\t" + resultado);
        System.out.println("or\t" + resu);
        System.out.println();
        System.out.println();

        System.out.println("true\ttrue"); // \t mere una tabulacion entre comillas


    }
}
