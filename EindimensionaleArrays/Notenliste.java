package EindimensionaleArrays;

/**
 * Diese Klasse beinhaltet Methoden, um eine Notenliste zu erzeugen und zu testen
 * @author Marko Ekmedzic
 * @version 2022-12-07
 */
public class Notenliste {
    int[] noten;

    /**
     * Konstruktor für die Notenliste
     *
     * @param anzahl die Anzahl der Noten auf der Liste
     */
    public Notenliste(int anzahl) {
        if (anzahl < 3)
            anzahl = 3;
        this.noten = new int[anzahl];
    }

    /**
     * Diese Methode checkt welche Noten für die Liste erlaubt sind
     *
     * @param erlaubteNoten 1 - 5 Schulsystem erlaubte Noten
     * @return ja oder nein je nachdem ob erlaubt oder nicht
     */
    public static boolean checkNote(int erlaubteNoten) {
        if (erlaubteNoten >= 1 && erlaubteNoten <= 5) {
            return true;
        }
        return false;
    }

    /**
     * Diese Methode legt einen Wert für die Note fest und wählt den Index aus auf welchem die Note gesetzt werden soll
     *
     * @param zahl  die Note
     * @param index Stelle der Liste
     * @return ob die Note gesetzt werden kann oder nicht
     */
    public boolean setNote(int zahl, int index) {
        if (!(checkNote(zahl))) {
            return false;
        }
        if (index < 0 || index >= noten.length) {
            return false;
        }
        noten[index] = zahl;
        return true;
    }

    /**
     * Diese Methode fügt eine Note auf die Liste hinzu
     *
     * @param zahl die Note
     * @return ob man die Note auf die Liste hinzufügen kann
     */
    public boolean addNote(int zahl) {
        if (!checkNote(zahl))
            return false;

        for (int i = 0; i < noten.length; i++) {
            if (noten[i] == 0) {
                noten[i] = zahl;
                return true;
            }
        }
        return false;

    }

    /**
     * Diese Methode löscht die Note auf der jeweiligen Stelle der Liste
     *
     * @param index die Stelle auf der Liste
     * @return ob sie gelöscht werden kann, falls überhaupt eine Note auf der Stelle vorhanden ist
     */
    public boolean deleteNote(int index) {
        if (index < 0 || index >= noten.length) {
            return false;
        }
        noten[index] = 0;
        return true;
    }

    /**
     * Diese Methode berechnet den Durchschnitt der Notenliste
     *
     * @return Ergebnis
     */
    public double durchschnitt() {
        int notenSumme = 0;
        int t = 0;
        for (int note : noten) {
            if (checkNote(note)) {
                notenSumme += note;
                t++;
            }
        }
        if (t == 0) {
            t = 1;
        }
        return (double) notenSumme / t;
    }

    /**
     * Diese Methode gibt die Notenliste inklusive des Durchschnittes zurück
     * @return die liste + den Durchschnitt
     */
    public String notenliste() {
        String ausgabe = "";
        for (int i = 0; i < noten.length; i++) {
            if (checkNote(noten[i])) {
                ausgabe += noten[i];
            }
            if (i != noten.length - 1 && noten[i + 1] != 0 && noten[i] != 0) {
                ausgabe += (", ");
            }
        }
        return ausgabe + " - " + durchschnitt();
    }
}
