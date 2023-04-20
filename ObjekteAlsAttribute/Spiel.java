package ObjekteAlsAttribute;
/**
 * Diese Klasse beinhaltet Methoden um ein Würfelspiel zu erstellen
 * @author Marko Ekmedzic
 * @author 2022-11-23
 */
public class Spiel {
    Wuerfel w1 = new Wuerfel();
    Wuerfel w2 = new Wuerfel();
    int summe1;
    int summe2;
    int maxwert;

    /**
     * Setzt die Punkte der Würfel auf 0
     * @param nullPunkt
     */
    public Spiel(int nullPunkt) {
        this.summe1 = nullPunkt;
        this.summe2 = nullPunkt;
    }

    /**
     * Setzt den Integer der die Punkte bestimmt auf 0
     */
    public Spiel () {

        this(0);
    }

    /**
     * Legt einen Wert für den Maximalwert des Würfels fest
     * @param maxwert der maximale Wert des Würfels
     */
    public void setMaxwertw(int maxwert) {
        this.w1.setMaxwert(maxwert);
        this.w2.setMaxwert(maxwert);
        this.maxwert = maxwert;
    }

    /**
     * Gibt den Maximalwert zurück
     * @return den Maximalwert
     */
    public int getMaxwertw() {

        return this.w1.getMaxwert();
    }

    /**
     * Verändert den Punktestand je nach Ergebnis für beide Spieler
     * @return das Ergebnis der Spieler
     */
    public String runde() {
        String ergebnis = "";
        this.w1.wuerfeln();
        this.w2.wuerfeln();

        ergebnis += "Spieler 1 - " + this.w1.textDaten() + ", " + this.w2.textDaten() + " -> ";

        if (this.w1.equals(this.w2)) {
            this.summe1 -= 2;
            ergebnis += "Pasch -2; ";
        } else {
            this.summe1 += this.w1.differenz(this.w2);
            ergebnis += "+" + this.w1.differenz(this.w2) + "; ";
        }

        this.w1.wuerfeln();
        this.w2.wuerfeln();
        ergebnis += "Spieler 2 - " + this.w1.textDaten() + ", " + this.w2.textDaten() + " -> ";

        if (this.w1.equals(this.w2)) {
            this.summe2 -= 2;
            ergebnis += "Pasch -2";
        } else {
            this.summe2 += this.w1.differenz(this.w2);
            ergebnis += "+" + this.w1.differenz(this.w2);
        }
        return ergebnis;
    }

    /**
     * Der Zwischenstand der Punkte beider Spieler
     * @return den Zwischenstand
     */
    public String zwischenStand() {

        return "Spieler 1: " +  this.summe1 + "\nSpieler 2: " + this.summe2;
    }

    /**
     * Wer gewonnen hat
     * @return Spieler der gewinnt
     */
    public String gewonnen() {
        if(summe1 < summe2) {
            return "Gewonnen: Spieler 1";
        } else if (summe2 < summe1) {
            return "Gewonnen: Spieler 2";
        }
        return "Unentschieden";
    }

    /**
     * Gibt alle Daten der Spieler zurück
     * @return Alle Daten
     */
    public String gesamtDaten() {
        return "Würfel: " + this.w1.getMaxwert() + "-seitig, Punkte - Spieler 1: " + this.summe1 + "; Spieler 2: " + this.summe2 + ", " + gewonnen();
    }
}