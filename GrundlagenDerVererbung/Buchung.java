package GrundlagenDerVererbung;

import java.util.Objects;

/**
 * Dieses Programm schaut, ob eine Buchung eine Ein- oder Auszahlung ist und legt es dann als Text fest
 * @author Marko Ekmedzic
 * @verison 2023-02-28
 */
public record Buchung(String buchungstext, double betrag) {

    /**
     * Ein Konstruktor der die Werte für ein Objekt beinhaltet
     *
     * @param betrag positiv oder negativ
     */
    public Buchung(double betrag) {
        this("", betrag);
    }

    /**
     * Konstruktor für die Klasse Buchung
     * @param betrag der überwiesene betrag
     * @param buchungstext Ein- oder Auszahlung
     */
    public Buchung(double betrag, String buchungstext) {
        this(buchungstext, betrag);
        checkNotNull(this.buchungstext);
    }

    private void checkNotNull(String value) {
        if (value == null) {
            throw new IllegalArgumentException("Buchungstext darf nicht null sein.");
        }
    }

    public double getBetrag() {
        return this.betrag;
    }

    /**
     * gibt eine kurze Information über die Daten der Buchung zurück
     * @return den Buchungstext und den Betrag
     */
    @Override
    public String toString() {
        String s;
        if(betrag > 0) {
            s = "[Einzahlung: Betrag = " + betragInteger() + "€ ,  Buchungstext = " + buchungstext() + "]";
        } else {
            s = "[Auszahlung: Betrag = " + betragInteger() + "€ ,  Buchungstext = " + buchungstext() + "]";
        }
        return s;
    }


    /**
     * gibt den Betrag der Buchung als int-Wert zurück (gerundet)
     * @return den Betrag als int
     */
    public int betragInteger() {
        return (int) Math.abs(Math.round(betrag));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Buchung buchung = (Buchung) o;
        return Double.compare(buchung.betrag, betrag) == 0 && Objects.equals(buchungstext, buchung.buchungstext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buchungstext, betrag);
    }
}
