package teoria.comparatorlambda.eje;

import java.util.Comparator;

public class CompararID implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Socio socio1 = (Socio) o1 ;
        Socio socio2 = (Socio) o2 ;
        if (socio1.getId() < socio2.getId()){
            return -1;
        } else if (socio1.getId() > socio2.getId()) {
            return 1;
        }else {
            return 0;
        }
    }
}
