package teoria.claseobject.ejemploequalsyhashcode;

public class Main {
    public static void main(String[] args) {
        // creamos un objeto Usuario
        Usuario usuario1 = new Usuario("pepe", "1234");
        Usuario usuario2 = new Usuario("pepe", "4321");
        // comparamos los dos usuarios
        System.out.println(usuario1.equals(usuario2));

        // ahora vamos a ver qué hace hashCode()
        int hashCode1 = usuario1.hashCode();
        System.out.println("HashCode de usuario1: " + hashCode1);
        int hashCode2 = usuario2.hashCode();
        System.out.println("HashCode de usuario2: " + hashCode2);
        System.out.println("¿Son iguales? (utilizando hashCode()): " + (hashCode1 == hashCode2));

    // como conclusión, para comparar objetos entre sí podemos utilizar uno u otro

    }
}
