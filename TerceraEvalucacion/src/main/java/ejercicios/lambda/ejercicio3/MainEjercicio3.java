package ejercicios.lambda.ejercicio3;

import java.util.Calendar;
import java.util.function.Predicate;

public class MainEjercicio3 {
    public static void main(String[] args) {
        System.out.println("1.- Define un predicado para comprobar si un entero es múltiplo de 5.");
        Predicate<Integer> esMultiploDe5 = numero -> numero % 5 == 0;
        // para aplicarlo debemos llamar al método test
        System.out.println("25 es múltiplo de 5: " + esMultiploDe5.test(25));
        System.out.println("41 es múltiplo de 5: " + esMultiploDe5.test(41));

        System.out.println("\n2- Define un predicado para comprobar si un String no termina en “s”.");
        Predicate<String> noTerminaEnS = cadena -> !cadena.endsWith("s");
        System.out.println("Cadena no termina en s: " + noTerminaEnS.test("cadena"));
        System.out.println("Cadenas no termina en s: " + noTerminaEnS.test("cadenas"));


        System.out.println("\n3.- Define un predicado para comprobar si un entero es par y múltiplo de 3.");
        Predicate<Integer> parYmultiploDe3 = numero -> numero % 2 == 0 && numero % 3 == 0;
        System.out.println("6 es par y múltiplo de 3: " + parYmultiploDe3.test(6));
        System.out.println("9 es par y múltiplo de 3: " + parYmultiploDe3.test(9));

        System.out.println("\n4.- Define un predicado para comprobar si un carácter es una letra y está en mayúscula.");
        Predicate<Character> esLetraMayuscula = c -> Character.isLetter(c) && Character.isUpperCase(c);
        System.out.println("5: " + esLetraMayuscula.test('5'));
        System.out.println(" : " + esLetraMayuscula.test(' '));
        System.out.println(" a: " + esLetraMayuscula.test('a'));
        System.out.println(" A: " + esLetraMayuscula.test('A'));

        System.out.println("\n5.- Define un predicado para comprobar si un entero es impar y múltiplo de 7");
        Predicate<Integer> imparMultiploDe7 = numero -> numero % 2 != 0 && numero % 7 == 0;
        System.out.println("21 :" + imparMultiploDe7.test(21));
        System.out.println("14 :" + imparMultiploDe7.test(14));

        System.out.println("6.- Define un predicado para comprobar si un entero es impar o múltiplo de 7.");
        Predicate<Integer> imparOMultiploDe7 = numero -> numero % 2 != 0 || numero % 7 == 0;
        System.out.println("21 :" + imparOMultiploDe7.test(21));
        System.out.println("14 :" + imparOMultiploDe7.test(14));

    }
}
