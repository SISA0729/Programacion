package SegundaEvaluacion.colecciones.Ejercicios.ejercicio04;

import java.util.*;

public class Diccionario {
    private HashMap<String, String> diccionario;

    public Diccionario() {
        this.diccionario = new HashMap<>();
    }


    public void nuevoPar(String español, String ingles){
        diccionario.put(español,ingles);
    }
    public String traduce (String español){
        return diccionario.get(español);
    }
    public String palabraAleatoria(){
        int tamaño = diccionario.size();
        Random generador = new Random();
        int indice = generador.nextInt(0,tamaño);
        String español = (String) diccionario.keySet().toArray()[indice];
        System.out.println(español);
        return español;
    }

    public String primeraLetraTraduccion(String español){
        return diccionario.get(español).substring(0,1);
    }

    @Override
    public String toString() {
        return "Diccionario{" +
                "diccionario=" + diccionario +
                '}';
    }
    public String muestra(){
        Scanner telcado = new Scanner(System.in);
        String palabra = palabraAleatoria();
        String letra = diccionario.remove(palabra);
        System.out.println(letra.charAt(0));
        System.out.print("Indique la respuesta: ");
        if (telcado.nextLine() == palabra){
            System.out.println("!CORRECTO!");
        }else {
            System.out.println("!Noo! La respuesta correcta es " + palabra);
        }
        return telcado.nextLine();
    }

}

