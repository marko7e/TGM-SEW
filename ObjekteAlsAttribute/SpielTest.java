package ObjekteAlsAttribute;
import java.util.*;
/**
 * Diese Klasse beinhaltet ein kleines Würfelspiel mit den Methoden aus anderen Klassen und testet sie dabei
 * @author Marko Ekmedzic
 * @version 2022-11-23
 */
public class SpielTest {
    public static void main(String[] args) {
        int rundenAnzahl;
        int max;
        Spiel s1 = new Spiel();
        System.out.print("Wie viele Runden sollen gespielt werden");
        rundenAnzahl = checkEingabe();
        while(rundenAnzahl < 1) {
            System.out.println("Bitte geben Sie eine Rundenanzahl ein, die höher als 0 ist!");
            rundenAnzahl = checkEingabe();
        }

        for(int i = 0; i < rundenAnzahl; i++) {
            System.out.println("Runde: " + rundenAnzahl + "\nÜbrige Runden: " + (rundenAnzahl-i));
            System.out.println("Maximalwert für den Würfel eingeben(4, 6, 8, 10, 12, 20, 100): ");
                max = checkEingabe();
            while(!Wuerfel.checkWuerfelMax(max)) {
                System.out.println("Bitte nur die erlaubten Zahlen eingeben!");
                max = checkEingabe();
            }
            s1.setMaxwertw(max);
            System.out.println(s1.runde() + "\n" + s1.zwischenStand());
        }
        System.out.println(s1.gesamtDaten());
    }

    /**
     * Testet eine Eingabe mittels InputMismatchException
     * @return die gegebene Zahl
     */
    private static int checkEingabe() {
        int zahl = -1;
        try {
            zahl = new Scanner(System.in).nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Bitte geben Sie eine Zahl die höher als 0 ist ein!");
        }
        return zahl;
    }
}