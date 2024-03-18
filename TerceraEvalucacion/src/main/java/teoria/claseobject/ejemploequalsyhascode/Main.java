package teoria.claseobject.ejemploequalsyhascode;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("sisa","1234");
        Usuario usuario2 = new Usuario("sisa","4321");

        System.out.println(usuario1.equals(usuario2));

        int HasCode1 = usuario1.hashCode();
        int HasCode2 = usuario2.hashCode();
        System.out.println("HasCode usuario1 = " + HasCode1);
        System.out.println("HasCode usuario2 = " + HasCode2);
        System.out.println(HasCode1 == HasCode2);
    }
}
