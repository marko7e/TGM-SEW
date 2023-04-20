package GrundlagenDerVererbung;
/**
 * Dieses Programm beinhaltet eine Testklasse die alle Methoden der Klasse Konto ausführlich
 * testet und anzeigt, wo Fehler aufgetaucht sind und was funktioniert hat
 * @author Marko Ekmedzic
 * @verison 2023-02-28
 */
public class KontoTest {
    public static void main(String[] args) throws NumericRangeExceptionEkmedzic {
        //Test aus Elearning Angabe, Konto.java testen
        Konto k1 = new Konto(27423987L, "Maria", "Mayer", 1000.00);
        System.out.println("Konto: " + k1);
        System.out.println("Kontostand nach Überweisung von 50€: " + k1.ueberweisung(50));
        System.out.println("Kontostand nach Auszahlung von 50€: " + k1.ueberweisung(-50));
        System.out.println("Konto: " + k1);

        Konto k2 = new Konto(27423987L, "Maria", "Mayer", 1000.00);
        System.out.println("Vergleich: " + k1.equals(k2));
        System.out.println("Hashcodes: k1 " + k1.hashCode() + " | k2 " + k2.hashCode());

        //ErweitertesKonto.java Testen
        ErweitertesKonto k3 = new ErweitertesKonto(48234638L, "Marko", "Ekmedzic", 0.00, 0.3);

        System.out.println("Überweisen von 45€, erwarteter Kontostand 44,5 aufgrund der 50 Cent Gebühr: " + k3.ueberweisung(45, "Gutschein"));
        System.out.println("Überweisen von 55€, erwarteter Kontostand 99 aufgrund der 50 Cent Gebühr: " + k3.ueberweisung(55, "Taschengeld"));
        System.out.println("Auszahlen von 70€, erwarteter Kontostand 29,5 aufgrund der 50 Cent Gebühr: " + k3.ueberweisung(-70, "Paysafecard"));
        System.out.println("Auszahlen von 5€, erwarteter Kontostand 25 aufgrund der 50 Cent Gebühr: " + k3.ueberweisung(-5, "Döner"));

        System.out.println(k3);
        System.out.println(k3.hashcode());

        ErweitertesKonto k4 = new ErweitertesKonto(3197524823L,"Marcel", "Eris", 5000.00, 0.4);
        System.out.println(k4.hashCode());
        Buchung b1 = new Buchung(-1000, "VGA");
        k4.neueBuchung(b1);
        System.out.println(k4);
        Buchung b2 = new Buchung(-500, "Lambo");
        k4.neueBuchung(b2);
        System.out.println(k4);

        Konto konto = new Konto(8574369L, "Mohamed", "El-shal", 100);
        System.out.println(konto.getKontostand());
        System.out.println("Die Kontonummer besteht aus 12 stellen, erwarteter Print: \"000483647812339\" Ausgabe: " + konto.identifier());
        System.out.println(konto.ueberweisung(200));

        ErweitertesKonto ekonto1 = new ErweitertesKonto(4835413471L, "Elias", " Nerlich", 500, 0.3);
        Buchung b3 = new Buchung(-50, "Urus");
        Buchung b4 = new Buchung(-100, "Computer");
        Buchung b5 = new Buchung(-100, "Spiel");
        Buchung b6 = new Buchung(50.37, "Essen");
        ekonto1.neueBuchung(b3);
        ekonto1.neueBuchung(b4);
        ekonto1.neueBuchung(b5);
        ekonto1.neueBuchung(b6);
        System.out.println(ekonto1);


    }
}
