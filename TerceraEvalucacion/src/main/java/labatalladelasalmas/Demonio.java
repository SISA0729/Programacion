package labatalladelasalmas;
// Clase Demonio: aunque sus atributos (visibles sólo desde la misma clase) son
//bondad y maldad, en realidad su bondad siempre es 0, por lo que su método

//mostrar() sólo muestra la maldad que tiene. También tiene métodos para ver y
//cambiar sus atributos.
public class Demonio extends Incorporeo{
    // atributos (visibles sólo desde la misma clase) -> private (encapsulados)
    private int bondad;
    private int maldad;

    public Demonio(int maldad) {
        this.maldad = maldad;
        this.bondad = 0; // redundante
    }

    public int getBondad() {
        return bondad;
    }

    public void setBondad(int bondad) {
        this.bondad = bondad;
    }

    public int getMaldad() {
        return maldad;
    }

    public void setMaldad(int maldad) {
        this.maldad = maldad;
    }

    @Override
    public String toString() {
        return "Demonio{" +
                "maldad=" + maldad +
                '}';
    }

    @Override
    public void mostrar() {
        System.out.println(this.toString());
    }
}
