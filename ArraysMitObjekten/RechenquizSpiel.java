package ArraysMitObjekten;
import java.util.*;
/**
 * Dieses Programm beinhaltet ein Quiz das den Benutzer nach Rechnungen fragt
 * @author Marko Ekmedzic
 * @verison 2023-02-22
 */
public class RechenquizSpiel {
    public static void main(String[] args) {
        Rechenquiz q1 = new Rechenquiz(5);
        q1.neueRechnung("1+1", 2, 0, 1);
        q1.neueRechnung("5*5", 25, 0, 1);
        q1.neueRechnung("6-3", 3, 0, 1);
        q1.neueRechnung("18:9", 2, 0, 1);
        q1.neueRechnung("20*3", 60, 0, 1);

        int runden;
        System.out.println("Wie viele Runden sollen gespielt werden?\nBitte geben Sie eine Zahl ein die größer gleich 5 ist!");
        do {
            runden = eingabeKontrolle();
            if (runden < 5) {
                System.out.println("Bitte geben sie eine Zahl die größer gleich 5 ist!");
                continue;
            }
            break;
        } while (true);

        int eingabe;
        for (int i = 0; i < runden; i++) {
            int zufall = (int) (Math.random() * q1.rechenaufgaben.length);
            do {
                System.out.println((i + 1) + ". Rechnung: " + q1.rechenaufgaben[zufall].getRechnung());
                try {
                    eingabe = new Scanner(System.in).nextInt();
                } catch (InputMismatchException ime) {
                    continue;
                }
                if (q1.checkErgebnis(q1.rechenaufgaben[zufall].getRechnung(), eingabe)) {
                    System.out.println("Richtig!");
                } else {
                    System.out.println("Falsch!");
                }
                break;
            } while (true);
        }
        System.out.println(q1.punktestand());
    }

    /**
     * Kontrolliert die Eingabe des Benutzers
     * @return die Kontrolle
     */
    private static int eingabeKontrolle() {
        try {
            return new Scanner(System.in).nextInt();
        } catch (InputMismatchException ime) {
            System.out.print("Eingabe ungültig!");
            return eingabeKontrolle();
        }
    }
}
