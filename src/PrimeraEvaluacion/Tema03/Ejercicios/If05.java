package PrimeraEvaluacion.Tema03.Ejercicios;

import java.util.Scanner;
public class If05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Usuario: ");
        String usuario = teclado.nextLine();
        System.out.print("Contraseña: ");
        String contraseña = teclado.nextLine();

        String usuarioGuardado = "sisa";
        String contraGuardado = "sisa123";

        if (usuario.equals(usuarioGuardado) && contraseña.equals(contraGuardado)){
            System.out.println("Has entrado al sistema!!");
        }
        else if (!contraseña.equals(contraGuardado) && !usuario.equals(usuarioGuardado)){
            System.out.println("El usuario esta mal y la contraseña esta mal");
        }
        else if (!usuario.equals(usuarioGuardado)){
            System.out.println("El usuario es incorrecto");
        } else if (!contraseña.equals(contraGuardado)) {
            System.out.println("La contraseña es incorrecta");
        }
    }
}
