package SegundaEvaluacion.colecciones.Ejemplos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EjemplosHashMap {
    public static void main(String[] args) {
        HashMap<String,String> mapa= new HashMap<>();

        mapa.put("11111111A","A. ARRIBA");
        mapa.put("22222222B","B. Blazquez");
        mapa.put("33333333C","C. Clazquez");
        mapa.put("44444444D","D. Dlazquez");

        System.out.println(mapa);

        Scanner teclado = new Scanner(System.in);
        System.out.println("DNI: ");
        String dni = teclado.nextLine();
        System.out.println(mapa.get(dni));

        HashMap<Integer,String> mapa1 = new HashMap<>();
        mapa1.put(1,"one");
        mapa1.put(2,"two");
        mapa1.put(3,"three");
        mapa1.put(4,"four");
        mapa1.put(5,"five");
        mapa1.put(6,"six");
        mapa1.put(7,"seven");


        int numero = 0;
        do {
            System.out.println("¿Como se dice en ingles del uno al 10?");
            numero = teclado.nextInt(); teclado.nextLine();
            if (mapa1.containsKey(numero)){
                System.out.println(mapa1.get(numero));

            }else {
                System.out.println("Esa no la se");
                String traduccion = teclado.nextLine();
                mapa1.put(numero, traduccion);
            }
        }while (numero != 0);

        for (Map.Entry<Integer, String> entrada: mapa1.entrySet()) {
            int clave = entrada.getKey();
            String valor = entrada.getValue();
            System.out.println(clave + " en ingles es " + valor);
        }
    }
}
