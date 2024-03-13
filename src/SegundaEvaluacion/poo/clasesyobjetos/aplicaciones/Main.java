package SegundaEvaluacion.poo.clasesyobjetos.aplicaciones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crea un usuario utilizando el método anterior, e imprime sus datos.
        // para crear un usuario, entonces utilizamos el método crearUsuario
        Usuario usuario = crearUsuario();
        System.out.println(usuario);

        //Para probar este método mensajeEstado, ve al main y llama al método con el usuario creado.
        usuario.mensajeEstado();
        //A continuación, cambia el estado del usuario a ACTIVO, y vuelve a llamar al método mensajeEstado.
        usuario.setEstado(Estado.ACTIVO);
        usuario.mensajeEstado();

    }
    // Añade un método crearUsuario(): Usuario, que pide los datos para crear un usuario.
    public static Usuario crearUsuario() {
        Scanner teclado = new Scanner(System.in);
        return new Usuario(teclado.nextLine(), teclado.nextLine(), teclado.nextLine());
    }

}
