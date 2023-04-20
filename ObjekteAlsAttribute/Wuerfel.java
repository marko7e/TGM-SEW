package ObjekteAlsAttribute;
/**
 * Diese Klasse beinhaltet Methoden zum Würfeln um daraus ein Spiel zu erstellen
 * @author Marko Ekmedzic
 * @version 2022-11-23
 */
public class Wuerfel {
    private int wuerfelwert;
    private int maxwert;

    /**
     * leitet auf den nächsten Konstruktor weiter
     */
    public Wuerfel () {
        this(6);
    }

    /**
     * gibt den Würfelwert an
     * @param maxwert der maximale Wert des Würfels
     */
    public Wuerfel(int maxwert) {
        this.wuerfelwert = (int) Math.random() * maxwert + 1;
    }

    /**
     * Der maximale Wert wird festgelegt
     * @param maxwert der maximale Wert des Würfels
     */
    public void setMaxwert(int maxwert) {
        this.maxwert = maxwert;
    }

    /**
     * Der maximale Wert wird zurückgegeben
     * @return den maximalen Wert
     */
    public int getMaxwert() {
        return this.maxwert;
    }

    /**
     * Der Wert des Würfels wird zurückgegeben
     * @return den Wert des Würfels
     */
    public int getWuerfelwert() {
        return this.wuerfelwert;
    }

    /**
     * Daten des Würfels werden zurückgegeben
     * @return die Daten des Würfels
     */
    public String textDaten() {
        return "W" + this.maxwert + ": " + this.wuerfelwert;
    }

    /**
     * Würfelt einen Wert
     * @return den gewürfelten Wert
     */
    public int wuerfeln() {
            this.wuerfelwert = (int) (Math.random() * this.maxwert) + 1;
            return this.wuerfelwert;
        }

    /**
     * Überprüft ob der erlaubte Maximalwert benutzt wurde oder nicht
     * @param wert der zu überprüfende Wert
     * @return ob er benutzt wurde oder nicht
     */
    public static boolean checkWuerfelMax(int wert) {
        if(wert == 4 || wert == 6 || wert == 8 || wert == 10 || wert == 12 || wert == 20 || wert == 100) {
            return true;
        }
        return false;
    }

    /**
     * Ob der Wert gültig ist
     * @param w1 ein Würfel der den Wert besitzt
     * @return gültig oder nicht
     */
    public boolean equals (Wuerfel w1) {
        if(w1 != null && this.wuerfelwert == w1.wuerfelwert && this.maxwert == w1.maxwert) {
            return true;
        }
        return false;
    }

    /**
     * Die Differenz des Würfelswertes
     * @param w1 ein Würfel der den Wert besitzt
     * @return die Differenz als absoluten Wert (nie negativ)
     */
    public int differenz (Wuerfel w1) {
        if(w1 != null) {
            int ergebnis = w1.wuerfelwert - this.wuerfelwert;
            return Math.abs(ergebnis);
        }
        return -1;
    }
}