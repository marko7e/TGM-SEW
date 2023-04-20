package ArraysVergroeßernUndVerkleinern;
/**
 * Die Klasse Wertung zeigt eine Wertung mit Name und Punktestand
 * @author Marko Ekmedzic
 * @version 2023-02-28
 */
public class Wertung {
    private final String name;
    private final double punkte;

    /**
     * Konstruktor für eine Wertung mit Namen und Punkte
     * @param name der Name der Wertung
     * @param punkte der Punktwert der Wertung
     */
    public Wertung(String name, double punkte) {
        this.name = name;
        this.punkte = punkte;
    }

    /**
     * Gibt den Namen der Wertung zurück.
     * @return der Name der Wertung
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gibt den Punktwert der Wertung zurück.
     * @return der Punktwert der Wertung
     */
    public double getPunkte() {
        return this.punkte;
    }

    /**
     * Gibt die Punkte und Namen als Text aus
     * @return der Text der Wertung
     */
    public String wertungstext() {
        return this.name + ": " + this.punkte;
    }
}