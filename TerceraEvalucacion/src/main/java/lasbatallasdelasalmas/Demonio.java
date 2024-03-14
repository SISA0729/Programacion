package lasbatallasdelasalmas;

public class Demonio extends Incorporeo{
    private int bondad;
    private int maldad;

    public Demonio(int maldad) {
        this.bondad = 0;
        this.maldad = maldad;
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
