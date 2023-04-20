package ArraysMitObjekten;

/**
 * Die Klasse beinhaltet Methoden die Rechnung, die Antwort und die Toleranz überprüfen. Die Toleranz darf nie größer als
 * ein Zehntel der Antwort sein.
 * @author Marko Ekmedzic
 * @version 2022-11-12
 */
public class Rechenaufgabe {
    private String rechnung;
    private double antwort;
    private double toleranz;
    private int punkte;
    /**
     * Die Rechnung mit Antwort
     * @param rechnung die Rechnung als String
     * @param antwort die Antwort als Double
     */
    public Rechenaufgabe(String rechnung, double antwort) {

        this(rechnung, antwort, 0);
    }
    /**
     * Die Rechnung mit Antwort und Toleranz
     * @param rechnung die Rechnung als String
     * @param antwort die Antwort als Double
     * @param toleranz die Toleranz der Antwort
     */
    public Rechenaufgabe(String rechnung, double antwort, double toleranz) {
        this.rechnung = rechnung;
        this.antwort = antwort;
        setToleranz(toleranz);
    }

    /**
     * Die Rechnung mit allen Parametern
     * @param rechnung die rechnung
     * @param antwort die antwort
     * @param toleranz die toleranz
     * @param punkte dei punkte
     */
    public Rechenaufgabe(String rechnung, double antwort, double toleranz, int punkte) {
        setRechnung(rechnung);
        setAntwort(antwort);
        setToleranz(toleranz);
        setPunkte(punkte);
    }

    /**
     * Gibt die Antwort zurück
     * @return die Antwort
     */
    public double getAntwort() {
        return antwort;
    }
    /**
     * Setzt die Antwort
     * @param antwort die Antwort als festgelegte Antwort
     */
    public void setAntwort(double antwort) {

        this.antwort = antwort;
    }
    /**
     * Gibt die Rechnung zurück
     * @return die Rechnung als String
     */
    public String getRechnung() {

        return rechnung;
    }
    /**
     * setzt die Rechnung
     * @param rechnung Die festgelegte Rechnung
     */
    public void setRechnung(String rechnung) {

        this.rechnung = rechnung;
    }
    /**
     * gibt die Toleranz zurück
     * @return die Toleranz als Double
     */
    public double getToleranz() {

        return this.toleranz;
    }
    /**
     * setzt die Toleranz auf maximal ein Zehntel der Lösung
     * @param toleranz die Toleranz als String
     */
    public void setToleranz(double toleranz) {
        if(toleranz>this.antwort/10) {
            throw new IllegalArgumentException("Die Toleranz ist zu hoch!\nSie darf maximal ein Zehntel der gespeicherten Antwort sein!");
        }
        this.toleranz = toleranz;
    }

    /**
     * Gibt die Punkte zurück
     * @return doe punkte
     */
    public int getPunkte() {

        return this.punkte;
    }

    /**
     * setzt die Punkte auf einen wert
     * @param punkte die punkte
     */
    public void setPunkte(int punkte) {
        if(punkte <= 0) {
            this.punkte = 1;
        }
        this.punkte = punkte;
    }
    /**
     * Diese Methode checkt, ob die Antwort mit den vorherigen Methoden richtig ist
     * @param antwort Die Antwort als Double
     * @param toleranz Die Toleranz als Toleranz
     * @return ob es gültig ist oder nicht
     */
    public boolean checkAntwort(double antwort, boolean toleranz) {
        if(toleranz) {
            return antwort >= (this.antwort - this.toleranz) && antwort <= (this.antwort + this.toleranz);
        } else {
            return antwort == this.antwort;
        }
    }
    /**
     * Gibt die überprüfte antwort aus
     * @param antwort die Antwort als Double
     * @return die überprüfte Antwort
     */
    public boolean checkAntwort(double antwort) {

        return checkAntwort(antwort, true);
    }
    /**
     * Diese Methode gibt die finale Lösung zurück
     * @return die Lösung
     */
    public String loesung() {

        return this.rechnung + " = " + this.antwort + "(" + this.toleranz + " Toleranz).";
    }

    /**
     * Diese Methode erstellt eine tiefe Kopie
     * @return das geklonte Objekt
     */
    public Rechenaufgabe clone() {

        return new Rechenaufgabe(rechnung, antwort, toleranz, punkte);
    }

    /**
     * Diese Methode vergleicht die Parameter zweier Objekte und wenn diese gleich sind, wird true zurückgegeben
     * @param r1 das neue Objekt
     * @return Ob die Objekte gleich sind oder nicht
     */
    public boolean equals(Rechenaufgabe r1) {
        return r1.getRechnung().equals(this.rechnung) && r1.getAntwort() == this.antwort && r1.getToleranz() ==
                this.toleranz && r1.getPunkte() == this.punkte;
    }
}