package GrundlagenDerVererbung;
import java.util.Arrays;
/**
 * Dieses Programm beinhaltet Methoden für ein erweitertes Konto welches verschiedene Daten wie z.B. den Durchschnitt
 * der Buchungen ausgibt.
 * @author Marko Ekmedzic
 * @version 2023-02-28
 */
public class ErweitertesKonto extends Konto {
    private double gebuehr;
    private Buchung[] buchungen;

    /**
     * Konstruktor für die Klasse Konto welche die Werte der Parameter beinhaltet
     * @param kontoNR    die Kontonummer des Kontoinhabers
     * @param vorname    der Vorname des Kontoinhabers
     * @param nachname   der Nachname des Kontoinhabers
     * @param kontostand der Kontostand des Kontoinhabers
     */
    public ErweitertesKonto(long kontoNR, String vorname, String nachname, double kontostand, double gebuehr) throws NumericRangeExceptionEkmedzic {
        super(kontoNR, vorname, nachname, kontostand);
        setGebuehr(gebuehr);
        buchungen = new Buchung[0];
    }

    /**
     * gibt die Überweisung mit einer zusätzlich gefügten Gebühr aus
     *
     * @param betrag der überwiesene Betrag
     * @return die Summe aus Betrag und Gebühr
     */
    @Override
    public double ueberweisung(double betrag) throws NumericRangeExceptionEkmedzic {

        return ueberweisung(betrag, "");
    }

    /**
     * gibt die Überweisung mit einer zusätzlich gefügten Gebühr aus und noch ein Text
     *
     * @param betrag       der überwiesene Betrag
     * @param buchungstext Ein- oder Auszahlung
     * @return die Summe aus Betrag und Gebühr plus den Buchungstext
     */
    public double ueberweisung(double betrag, String buchungstext) throws NumericRangeExceptionEkmedzic {
        double kontoNachUeberweisung;
        if (betrag > 0) {
            kontoNachUeberweisung = super.ueberweisung(betrag - gebuehr);
            Buchung b = new Buchung(betrag - gebuehr, buchungstext);
            neueBuchung(b);
        } else {
            kontoNachUeberweisung = super.ueberweisung(betrag + gebuehr);
            Buchung b = new Buchung(betrag + gebuehr, buchungstext);
            neueBuchung(b);
        }
        return kontoNachUeberweisung;
    }

    /**
     * schaut, ob eine neue Buchung erfolgreich war und speichert eine weitere Buchung in einem Objekt
     */
    public void neueBuchung(Buchung buchung) {
        if (buchung == null) {
            return;
        }
        boolean erfolgreich = false;
        for (int i = 0; i < buchungen.length && !erfolgreich; i++) {
            if (buchungen[i] == null) {
                buchungen[i] = buchung;
                erfolgreich = true;
            }
        }
        if (!erfolgreich) {
            Buchung[] kbuchung = new Buchung[buchungen.length + 1];
            System.arraycopy(buchungen, 0, kbuchung, 0, buchungen.length);
            kbuchung[kbuchung.length - 1] = buchung;
            buchungen = kbuchung;
        }
    }

    /**
     * rechnet den Durchschnitt aller Buchungen aus und gibt es dann aus
     *
     * @return die Summe des Durchschnitts
     */
    public double durchschnittsbuchung() {
        double summe = 0;
        int divisor = 0;
        for (Buchung buchung : buchungen) {
            if (buchung != null) {
                summe += Math.abs(buchung.getBetrag());
                divisor++;
            }
        }
        if (divisor == 0) {
            divisor = 1;
        }
        return summe / divisor;
    }

    /**
     * Gibt alle Kontodaten aus
     *
     * @return alle Kontodaten
     */
    @Override
    public String toString() {
        StringBuilder ausgabe = new StringBuilder(super.toString() + "(" + gebuehr + " € Bearbeitungsgebühr) – durchschnittliche Buchung: " + durchschnittsbuchung() + " € (");

        for (Buchung buchung : buchungen) {
            if (buchung != null) {
                ausgabe.append(buchung);
                ausgabe.append("; ");
            }
        }
        return ausgabe.substring(0, ausgabe.length()-2) + ")";
    }

    /**
     * beinhaltet die Buchungen
     * @return die Buchungen
     */
    public Buchung[] getBuchungen() {
        return buchungen;
    }

    /**
     * vergleicht zwei Objekte mit ihren Attributen
     * @param o neues Objekt
     * @return true oder false, ob die Objekte gleich sind
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ErweitertesKonto ekvergleich = (ErweitertesKonto) o;

        for (int i = 0; i < buchungen.length; i++) {
            if(!ekvergleich.getBuchungen()[i].equals(buchungen[i]) && ekvergleich.buchungen.length != buchungen.length)
                return false;
        }
        return getKontoNR() == ekvergleich.getKontoNR() && getKontostand() == ekvergleich.getKontostand() && getVorname().equals(ekvergleich.getVorname()) && getNachname().equals(ekvergleich.getNachname());
    }

    /**
     * erzeugt einen Hashcode
     * @return den Hashcode als int
     */
    public int hashcode() {
        return (int) (11 * 2 * getKontoNR() + getVorname().hashCode() + getNachname().hashCode() + getKontostand() + Arrays.hashCode(buchungen) + toString().hashCode());
    }

    public void setGebuehr(double gebuehr) throws NumericRangeExceptionEkmedzic {
        if(gebuehr < 0.1 || gebuehr > 0.5) {
            throw new NumericRangeExceptionEkmedzic("Die Gebuehr muss zwischen 0.1 und 0.5 liegen!");
        }
        this.gebuehr = gebuehr;
    }

    public double getGebuehr() {
        return this.gebuehr;
    }
}
