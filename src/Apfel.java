import java.awt.*;
/**
 * Created by doetken on 29.06.2016.
 */
public class Apfel implements Comparable<Apfel>{

    private final int groesse;
    private final int gewicht;
    private final Color farbe;

    public Apfel(int groesse, int gewicht, Color farbe) {
        this.groesse = groesse;
        this.gewicht = gewicht;
        this.farbe = farbe;
    }

    public int getGroesse() {
        return groesse;
    }

    public int getGewicht() {
        return gewicht;
    }

    public Color getFarbe() {
        return farbe;
    }

    @Override
    public String toString() {

        return "Apfel{"+"Größe: "+getGroesse()+", Gewicht: "+getGewicht()+", Farbe: "+getFarbe();
    }

        public int compareTo (Apfel o) {
return this.getGroesse()-o.getGroesse();
    }
}
