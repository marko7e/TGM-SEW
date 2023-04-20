package ArraysVergroeßernUndVerkleinern;
/**
 * Diese Klasse testet Methoden
 * @author Marko Ekmedzic
 * @version 2023-02-28
 */
public class Listentest {
    public static void main(String[] args) {
        Wertungsliste wertungsliste = new Wertungsliste(3);

        Wertung wertung1 = new Wertung("Michi", 2.5);
        boolean erfolgreich1 = wertungsliste.addWertung(wertung1);
        Wertung wertung2 = new Wertung("Marko", 3.7);
        boolean erfolgreich2 = wertungsliste.addWertung(wertung2);
        Wertung wertung3 = new Wertung("Mo", 1.8);
        boolean erfolgreich3 = wertungsliste.addWertung(wertung3);

        if(erfolgreich1 && erfolgreich2 && erfolgreich3){
            System.out.println("Alle Wertungen wurden erfolgreich hinzugefügt.");
        } else {
            System.out.println("Es gab einen Fehler beim Hinzufügen von Wertungen.");
        }

        System.out.println("Wertungen nach dem Hinzufügen: " + wertungsliste.listentext());

        boolean erfolgreich4 = wertungsliste.addWertung("Toma", 3.1);
        if(erfolgreich4){
            System.out.println("Die Wertung wurde erfolgreich hinzugefügt.");
        } else {
            System.out.println("Es gab einen Fehler beim Hinzufügen der Wertung.");
        }

        System.out.println("Wertungen nach dem fehlgeschlagenen Hinzufügen: " + wertungsliste.listentext());

        wertungsliste.vergroessern(3);

        boolean erfolgreich5 = wertungsliste.addWertung("Toma", 3.1);
        if(erfolgreich5){
            System.out.println("Die Wertung wurde erfolgreich hinzugefügt.");
        } else {
            System.out.println("Es gab einen Fehler beim Hinzufügen der Wertung.");
        }

        System.out.println("Wertungen nach dem erneuten Hinzufügen: " + wertungsliste.listentext());

        wertungsliste.loescheUnter(3.0);
        System.out.println("Wertungen nach dem Löschen: " + wertungsliste.listentext());
    }
}
