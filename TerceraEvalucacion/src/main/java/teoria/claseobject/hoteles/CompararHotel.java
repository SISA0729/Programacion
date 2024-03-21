package teoria.claseobject.hoteles;

import java.util.Comparator;

public class CompararHotel implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Hotel h1 = (Hotel) o1;
        Hotel h2 = (Hotel) o2;

        if (Integer.parseInt(h1.getIdHotel()) > Integer.parseInt(h2.getIdHotel())){
            return -1;
        } else if (Integer.parseInt(h1.getIdHotel()) < Integer.parseInt(h2.getIdHotel())) {
            return 1;
        }else {
            return 0;
        }
    }
}
