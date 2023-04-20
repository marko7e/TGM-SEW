/**
 * Die Klasse beinhaltet Methoden die die Rechnung, die Antwort und die Toleranz überprüfen. Die Toleranz darf nie größer als
 * ein Zehntel der Antwort sein.
 * @author Marko Ekmedzic
 * @version 2022-11-12
 */
public class Rechenaufgabe {
    private String rechnung;
    private double antwort;
    private double toleranz;
    /**
     * Die Rechnung mit Antwort
     * @param rechnung die Rechnung als String
     * @param antwort die Antwort als Double
     */
    public Rechenaufgabe(String rechnung, double antwort) {
        this(rechnung, antwort, 0);
    }
    /**
     * Die Rechnung mit ANtwort und Toleranz
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
     * @return die Rechnugn als String
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
     * Diese Methode checkt, ob die Antwort mit den vorherigen Methoden richtig ist
     * @param antwort Die Antwort als Double
     * @param toleranz Die Toleranz als Toleranz
     * @return ob es gültig ist oder nicht
     */
    public boolean checkAntwort(double antwort, boolean toleranz) {
        if(toleranz) {
            if(antwort >= (this.antwort - this.toleranz) && antwort <= (this.antwort + this.toleranz)) {
                return true;
            }
        } else {
            if(antwort == this.antwort) {
                return true;
            }
        }
        return false;
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
} 
