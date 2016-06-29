import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by doetken on 29.06.2016.
 */
public class NichtCollectionsWeilDasGibtsSchon {
    public static void main(String[] args) {
        List<String> freunde =new ArrayList<>();
        freunde.add("Erwin");
        freunde.add("Herbert");
        freunde.add("Kalle");
        freunde.add("Erwin");


            System.out.println("Liste: " + freunde);

        Set<String> einzigartig=new HashSet<>();
        einzigartig.addAll(freunde);
        System.out.println("Set: " + einzigartig);

        Map<String,String> telefonbuch = new HashMap<>();
        telefonbuch.put("Erwin","0171");
        telefonbuch.put("Kalle","0174");
        telefonbuch.put("Herbert","0171");
        telefonbuch.put("Horst","0172");

        for (String s : telefonbuch.keySet()) {
            System.out.println("Schlüssel: "+s+", Wert:"+telefonbuch.get(s));
        }
        for (Map.Entry<String, String> stringStringEntry : telefonbuch.entrySet()) {
            System.out.println(stringStringEntry);
        }

    }
}
