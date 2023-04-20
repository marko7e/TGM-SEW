package EindimensionaleArrays;
import java.util.*;

/**
 * Dieses Programm fordert den Benutzer auf ein Datum einzugeben und gibt dann den Wochentag des Datums aus.
 * @author Marko Ekmedzic
 * @version 2023-01-11
 */
public class DatumTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geben Sie den Tag ein: ");
        int tag = sc.nextInt();
        System.out.print("Geben Sie den Monat ein: ");
        int monat = sc.nextInt();
        System.out.print("Geben Sie das Jahr ein: ");
        int jahr = sc.nextInt();
        sc.close();
        int[] datum = {tag, monat, jahr};
        String wochentag = Datum.wochentag(datum);
        System.out.println("Sie haben folgendes Datum eingegeben: " + wochentag + ", " + tag + "." + monat + "." + jahr);
    }
}
