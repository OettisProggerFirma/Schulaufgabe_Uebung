import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by doetken on 29.06.2016.
 */
public class ExceptionDemo {

    public static void main(String[] args) {

//      nicht zu behandelnder Programmierfehler:
        System.out.println("Vor Fehler");
        System.out.println("" + 0 / 0);
        System.out.println("Nach Fehler");
        try (BufferedReader bfr = new BufferedReader(new FileReader("src/ExceptionDemo.java"))) {
            String zeile = "";
            while ((zeile = bfr.readLine()) != null) {
                System.out.println(zeile);
            }
//            Datei nicht gefunden
        } catch (FileNotFoundException e) {
            e.printStackTrace();
//            in der Regel während des Lesens
        } catch (IOException e) {
            e.printStackTrace();
        }}
//        Methode verlangt Fehlerbehandlung:

        public void methode ()throws IOException {
        }
    }

