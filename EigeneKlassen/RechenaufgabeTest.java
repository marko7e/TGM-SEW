package EigeneKlassen;
/**
 * Diese KLasse testet die Methoden aus Rechenaufgabe. Getestet werden NF, GF, FF
 * @author Marko Ekmedzic
 * @version 2022-11-12
 *
 */
public class RechenaufgabeTest {

    public static void main(String[] args) {
        Rechenaufgabe r1 = new Rechenaufgabe("2 + 2", 4, (double)4/10);
        System.out.println(r1.loesung());
        System.out.println("NORMALFALL 0.2:");
        System.out.println("--------------------------");

        r1.setToleranz(0.2);
        System.out.println(r1.getToleranz());
        System.out.println("4 " + r1.checkAntwort(4));
        System.out.println("4.1 " + r1.checkAntwort(4.1));
        System.out.println("4.2 " + r1.checkAntwort(4.2));
        System.out.println("3.9 " + r1.checkAntwort(3.9));
        System.out.println("3.8 " + r1.checkAntwort(3.8));

        System.out.println("--------------------------");
        System.out.println("GRENZFALL 0.4:");
        System.out.println("--------------------------");

        r1.setToleranz(0.4);
        System.out.println(r1.getToleranz());
        System.out.println("4.4 " + r1.checkAntwort(4.4));
        System.out.println("3.6 " + r1.checkAntwort(3.6));

        System.out.println("--------------------------");
        System.out.println("FEHLERFALL alles größer als 0.4:");
        System.out.println("--------------------------");

        System.out.println("4.5 " + r1.checkAntwort(4.5));
        System.out.println("6 "  + r1.checkAntwort(6));
        r1.setToleranz(4);
        System.out.println(r1.getToleranz());

        System.out.println("--------------------------");
    }
}