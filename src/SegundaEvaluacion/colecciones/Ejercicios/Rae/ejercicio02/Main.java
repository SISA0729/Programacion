package SegundaEvaluacion.colecciones.Ejercicios.Rae.ejercicio02;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Academico n1 = new Academico("SISA1",2016);
        Academico n2 = new Academico("SISA2",2023);
        Academico n3 = new Academico("SISA3",2026);
        Academico n4 = new Academico("SISA4",2025);
        Academico n5 = new Academico("SISA5",2010);

        HashMap<Character,Academico> mapa= new HashMap<>();

        mapa.put('T',n1);
        mapa.put('t',n2);
        mapa.put('A',n3);
        mapa.put('E',n4);
        mapa.put('i',n4);

        //System.out.println(mapa);
        //imprimirAcademia(mapa);
        //imprimiracademico(n1);
        nuevoAcademico(mapa, n1, 'T');


        // vamos a hhacer un metodo que imprima los academicos con formato
    }
    public static void imprimiracademico(Academico a){
        System.out.println("Letra\tAño\tNombre");
        System.out.println(a.getAño()+"\t"+ a.getNombre());
    }
    public static void imprimirAcademia(HashMap<Character,Academico> mapa){
        System.out.println("Letra\t\tAño\t\tNombre");
        System.out.println("----------------------");
        for (Map.Entry<Character,Academico> entrada: mapa.entrySet()) {
            System.out.println( entrada.getKey() + "\t\t" + entrada.getValue().getAño() + "\t\t" +entrada.getValue().getNombre());

        }
    }

    public static boolean nuevoAcademico(Map<Character,Academico> academia, Academico nuevo, Character letra){
        if (Character.isLetter(letra)){
            academia.put(letra, nuevo);
            return false;
        }else {
            return false;
        }
    }

    public static Academico crearAcademico(String nombre,int año){
        Academico academico = new Academico(nombre, año);
        return academico;
    }
}
