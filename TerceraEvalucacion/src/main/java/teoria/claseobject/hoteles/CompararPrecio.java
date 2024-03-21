package teoria.claseobject.hoteles;

import java.util.Comparator;

public class CompararPrecio implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Hotel h1 = (Hotel) o1;
        Hotel h2 = (Hotel) o2;

        if (h1.getPrecio() > h2.getPrecio()){
            return -1;
        } else if (h1.getPrecio() < h2.getPrecio()) {
            return 1;
        }else {
            return 0;
        }
    }
}
