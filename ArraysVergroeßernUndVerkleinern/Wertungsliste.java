package ArraysVergroeßernUndVerkleinern;
/**
 * Die Klasse Wertungsliste speichert eine Liste von Wertungen.
 * @author Marko Ekmedzic
 * @version 2023-02-28
 */
public class Wertungsliste {
    private Wertung[] wListe;

    /**
     * Konstruktor für eine Wertungsliste mit gegebener maximaler Anzahl von Wertungen.
     * @param maxAnzahl die maximale Anzahl von Wertungen, die die Liste speichern kann
     */
    public Wertungsliste(int maxAnzahl) {
        if(maxAnzahl < 0)
            throw new IllegalArgumentException("Anzahl darf nicht negativ sein!");
        wListe = new Wertung[maxAnzahl];
    }

    /**
     * Fügt eine gegebene Wertung zur Liste hinzu, falls noch Platz ist.
     * @param w die hinzuzufügende Wertung
     * @return true, wenn die Wertung erfolgreich hinzugefügt wurde, false sonst
     */
    public boolean addWertung(Wertung w) {
        for (int i = 0; i < wListe.length; i++) {
            if (wListe[i] == null) {
                wListe[i] = w;
                return true;
            }
        }
        return false;
    }

    /**
     * Fügt eine Wertung mit gegebenem Namen und Punktwert zur Liste hinzu, falls noch Platz ist.
     * @param name der Name der Wertung
     * @param punkte der Punktwert der Wertung
     * @return true, wenn die Wertung erfolgreich hinzugefügt wurde, false sonst
     */
    public boolean addWertung(String name, double punkte) {

        return addWertung(new Wertung(name, punkte));
    }

    /**
     * Löscht alle Wertungen aus der Liste, deren Punktwert kleiner als der gegebene Schwellenwert ist.
     * @param punkte der Schwellenwert für den Punktwert
     */
    public void loescheUnter(double punkte) {
        for (int i = 0; i < wListe.length; i++) {
            if (wListe[i] != null && wListe[i].getPunkte() < punkte) {
                wListe[i] = null;
            }
        }
    }

    /**
     * Gibt alle Wertung-Objekte in der Wertungsliste als String zurück.
     * @return die Wertungsliste als String
     */
    public String listentext() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wListe.length; i++) {
            if (wListe[i] != null) {
                sb.append(wListe[i].wertungstext());
                if (i < wListe.length - 1) {
                    sb.append("; ");
                }
            }
        }
        return sb.toString();
    }
    /**
     * Vergrößert das Attribut wListe um die gegebene Anzahl an Plätzen.
     * @param anzahl die Anzahl an Plätzen, um die die Wertungsliste vergrößert werden soll
     */
    public void vergroessern(int anzahl) {
        if(anzahl < 0)
            throw new IllegalArgumentException("Die Anzahl der Vergrößerung muss positiv sein!");

        Wertung[] neuesArray = new Wertung[wListe.length + anzahl];
        System.arraycopy(wListe, 0, neuesArray, 0, wListe.length);
        wListe = neuesArray;
    }
}