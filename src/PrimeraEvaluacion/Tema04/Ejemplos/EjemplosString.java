package PrimeraEvaluacion.Tema04.Ejemplos;

public class EjemplosString {
    public static void main(String[] args) {
        String srt = null;
        System.out.println(srt);
        srt= "";
        System.out.println(srt);
        srt = "hola";
        System.out.println(srt);

        String cadena = "Esto es una cadena";
        System.out.println(cadena);
        String otraCdena = "Esta\n es\n una cadena";

        int longitud = cadena.length();
        System.out.println("Longitud: " + longitud);

        System.out.println(cadena.charAt(12));
        System.out.println(cadena.charAt(13));
        System.out.println(cadena.charAt(14));
        System.out.println(cadena.charAt(15));
        System.out.println(cadena.charAt(16));
        System.out.println(cadena.charAt(17));

        //para el ultimo caracter
        System.out.println("Primera cadena: " + cadena.charAt(0));
        System.out.println("Ultima cadena: " + cadena.charAt(longitud - 1));
        char ultimacaracter = cadena.charAt( longitud - 1);

        String cadena1 = "Los ordenadores son buenos siguiendo instrucciones";
        String cadena2 = "";
        boolean b1 = cadena1.isEmpty();
        String mayuscula = cadena1.toUpperCase();
        System.out.println(mayuscula);

        String miniscula = cadena1.toLowerCase();
        System.out.println(miniscula);

        boolean prefijo = cadena1.startsWith("Los ");
        System.out.println(prefijo);

        boolean sufijo = cadena1.endsWith("ones");
        System.out.println(sufijo);

        boolean contiene = cadena1.contains("son");
        System.out.println(contiene);

        int posicionInicial = 4;
        int posicionFinal = 9;
        String sub = cadena1.substring(posicionInicial, posicionFinal);
        System.out.println(sub);

        String conBlancos = "        hola     ";
        System.out.println(conBlancos.length());
        String sinblancos = conBlancos.trim();
        System.out.println(sinblancos);
        System.out.println(sinblancos.length());





    }
}
