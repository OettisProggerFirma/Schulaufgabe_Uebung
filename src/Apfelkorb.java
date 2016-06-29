import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by doetken on 29.06.2016.
 */
public class Apfelkorb {
    public static void main(String[] args) {

        Apfel[] korb = new Apfel[5];
        korb[0] = new Apfel(3, 5, Color.RED);
        korb[1] = new Apfel(4, 8, Color.GREEN);
        korb[2] = new Apfel(2, 5, Color.RED);
        korb[3] = new Apfel(6, 4, Color.YELLOW);
        korb[4] = new Apfel(2, 1, Color.GREEN);

        Arrays.sort(korb,new ApfelKuchenKomparator());
        Arrays.sort(korb, new Comparator<Apfel>() {
            @Override
            public int compare(Apfel o1, Apfel o2) {
                return o2.getFarbe().getGreen()-o1.getFarbe().getGreen();
            }
        });

        for (Apfel apfel : korb) {
            System.out.println(apfel);
        }

    }

}
