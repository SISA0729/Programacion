package SegundaEvaluacion.examen2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
public class Ejercicio1 {
    public static void main(String[] args) {

        HashMap<Integer, Character> mapaDaH = DECaHEX();
        HashMap<Character, Integer> mapaHaD = HEXaDEC();

        System.out.println("1.- Mostramos los mapas: ");
        System.out.println(mapaDaH);
        System.out.println(mapaHaD);

        int[] numeros = generarNumeros();
        System.out.println("2.- Mostramos los números: generados aleatoriamente" +Arrays.toString(numeros));

        String colorHex = colorHexadecimal(mapaDaH, numeros);
        System.out.println("3.- Mostramos el color hexadecimal: " + colorHex);


        String colorRgb = hexadecimalaRGB(mapaHaD, colorHex);
        System.out.println("4.- Mostramos el color rgb: " + colorRgb);

    }

    public static HashMap<Character, Integer> HEXaDEC() {
        HashMap<Character, Integer> mapa = new HashMap<>();
        mapa.put('0',0);
        mapa.put('1',1);
        mapa.put('2',2);
        mapa.put('3',3);
        mapa.put('4',4);
        mapa.put('5',5);
        mapa.put('6',6);
        mapa.put('7',7);
        mapa.put('8',8);
        mapa.put('9',9);
        mapa.put('A',10);
        mapa.put('B', 11);
        mapa.put('C', 12);
        mapa.put('D', 13);
        mapa.put('E', 14);
        mapa.put('F',15);

        return mapa;
    }

    public static HashMap<Integer, Character> DECaHEX() {
        HashMap<Integer, Character> mapa = new HashMap<>();
        mapa.put(0,'0');
        mapa.put(1,'1');
        mapa.put(2,'2');
        mapa.put(3,'3');
        mapa.put(4,'4');
        mapa.put(5,'5');
        mapa.put(6,'6');
        mapa.put(7,'7');
        mapa.put(8,'8');
        mapa.put(9,'9');
        mapa.put(10,'A');
        mapa.put(11, 'B');
        mapa.put(12, 'C');
        mapa.put(13, 'D');
        mapa.put(14, 'E');
        mapa.put(15,'F');

        return mapa;
    }

    public static int[] generarNumeros() {
        Random generador = new Random();
        int[] numeros = new int[6];
        for (int i = 0; i < 5; i++) {
            numeros[i] = generador.nextInt(0, 16);
        }
        return numeros;
    }

    public static String colorHexadecimal(HashMap<Integer, Character> mapa, int[] numeros) {
        String colorHex = "#";
        for (int i = 0; i < numeros.length; i++) {
            colorHex = colorHex + mapa.get(numeros[i]);
        }
        return colorHex;
    }

    public static String hexadecimalaRGB(HashMap<Character, Integer> mapa , String colorHEX) {
        int rojo = mapa.get(colorHEX.charAt(1)) * 16 + mapa.get(colorHEX.charAt(2)) ;
        int verde = mapa.get(colorHEX.charAt(3)) * 16 + mapa.get(colorHEX.charAt(4)) ;
        int azul = mapa.get(colorHEX.charAt(5)) * 16 + mapa.get(colorHEX.charAt(6)) ;
        return "rgb(" + rojo + ", " + verde + ", " + azul + ")";
    }
}
