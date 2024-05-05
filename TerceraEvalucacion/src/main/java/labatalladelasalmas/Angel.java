package labatalladelasalmas;

// Clase Ángel:
// aunque sus atributos (visibles desde cualquier clase del paquete) -> no ponemos nada delante
//son bondad y maldad, en realidad su maldad siempre es 0, por lo que su
//método mostrar() sólo muestra la bondad que tiene.

public class Angel extends Incorporeo{
    // atributos (visibles desde cualquier clase del paquete) -> no ponemos nada delante
    int bondad;
    int maldad;


    public Angel(int bondad) {
        this.bondad = bondad;
        this.maldad = 0;
    }

    @Override
    public String toString() {
        return "Angel{" +
                "bondad=" + bondad +
                '}';
    }

    @Override
    public void mostrar() {
        System.out.println(this.toString());
    }
}
