package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Scanner;

public class If04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String usuarioGuardado = "sisa";
        String contraseñaGuardada = "sisa123";

        System.out.print("Usuario: ");
        String usuario = teclado.nextLine();


        System.out.print("Contraseña: ");
        String contraseña = teclado.nextLine();

        if (usuario.equals(usuarioGuardado) && contraseña.equals(contraseñaGuardada)) {
            System.out.println("Has entrado al sistema");
        } else {
            System.out.println("ERROR");
        }
    }
}
