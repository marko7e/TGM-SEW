package Rest;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * hfkjsbfdsifsdufjfk
 * @author Marko Ekmedzic
 * @version 2022-11-24
 */
public class Schwimmbeckensteuerung {
    /**
     * vhcxjfsfiksdfdsf
     * @param args fhdksfhdsikf
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double eingabe = 500;
        Schwimmbecken sb1 = new Schwimmbecken(255, 325, -200);
        System.out.println("Länge = " + sb1.getLaenge() + "cm");
        System.out.println("Breite = " + sb1.getBreite() + "cm");
        System.out.println("Höhe = " + sb1.getHoehe() + "cm");
        System.out.println("Volumen = " + sb1.volumen() + " Liter");
        System.out.println(sb1.einfuellen(1000.5));
        System.out.println("Wassermenge = " + sb1.getWasserMenge());
        System.out.println("Geben Sie eine Wassermenge zum Einfüllen ein: ");
        try {
            eingabe = sc.nextDouble();
        } catch (InputMismatchException ime) {
            System.err.println("Eingabe ungültig! " + ime);
        }
        System.out.println("Einfüllen Erfolgreich? " + sb1.einfuellen(eingabe));
        System.out.println("Wassermenge = " + sb1.getWasserMenge() + " Liter");
        System.out.println(sb1.auslassen(999.9));
        System.out.println("Wassermenge = " + sb1.getWasserMenge() + " Liter");
        System.out.println("Auslassen Erfolgreich? " + sb1.auslassen(8000));
        System.out.println(sb1.status());
        System.out.println(sb1.leeren());
        System.out.println(sb1.status());
    }
}