package lasbatallasdelasalmas;

public class Angel extends Incorporeo{
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
        System.out.println(toString());
    }
}
