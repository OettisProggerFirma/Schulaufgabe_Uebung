import java.util.Comparator;

/**
 * Created by doetken on 29.06.2016.
 */
public class ApfelKuchenKomparator implements Comparator<Apfel>{

    @Override
    public int compare(Apfel o1, Apfel o2) {
        return o2.getGroesse()-o1.getGroesse();
    }
}
