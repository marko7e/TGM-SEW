package GrundlagenDerVererbung;

import java.util.Objects;

/**
 * Diese Klasse beinhaltet Parameter und Methoden die Daten für ein Bankkonto speichert
 * @author Marko Ekmedzic
 * @version 2023-02-28
 */
public class Konto implements Bankkonto, Identifizierbar {
    private long kontoNR;
    private String vorname, nachname;
    private double kontostand;

    /**
     * Konstruktor für die Klasse Konto welche die Werte der Parameter beinhaltet
     * @param kontoNR die Kontonummer des Kontoinhabers
     * @param vorname der Vorname des Kontoinhabers
     * @param nachname der Nachname des Kontoinhabers
     * @param kontostand der Kontostand des Kontoinhabers
     */
    public Konto(long kontoNR, String vorname, String nachname, double kontostand) throws NumericRangeExceptionEkmedzic {
        setKontoNR(kontoNR);
        setKontostand(kontostand);
        setNachname(nachname);
        setVorname(vorname);
    }

    /**
     * gibt den aktuellen Kontostand zurück
     * @return den aktuellen Kontostand
     */
    public double getKontostand() {
        return kontostand;
    }

    /**
     * gibt die Kontonummer zurück
     * @return die Kontonummer
     */
    public long getKontoNR() {
        return kontoNR;
    }

    /**
     * gibt den Nachnamen des Kontoinhabers zurück
     * @return der Nachname des Kontoinhabers
     */
    public String getNachname() {
        return nachname;
    }

    /**
     * gibt den Vornamen des Kontoinhabers zurück
     * @return den Vornamen des Kontoinhabers
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * setzt eine Kontonummer für den Kontoinhaber
     * @param kontoNR die Kontonummer des Kontoinhabers
     */
    public void setKontoNR(long kontoNR) throws NumericRangeExceptionEkmedzic{
        int kontonrlength = Long.toString(kontoNR).replace("^0+", "").length();
        if(kontonrlength > 15 || kontonrlength < 7)
            throw new NumericRangeExceptionEkmedzic("Die Kontonummer muss zwischen 7 & 15 Stellen haben!");
        this.kontoNR = kontoNR;
    }

    /**
     * setzt den aktuellen Kontostand und überprüft, dass er nicht kleiner als 0 ist
     * @param kontostand der Kontostand des Kontoinhabers
     */
    public void setKontostand(double kontostand) throws NumericRangeExceptionEkmedzic{
        if(kontostand < 0) {
            throw new NumericRangeExceptionEkmedzic("Das Konto darf nicht negativ sein!");
        }
        this.kontostand = kontostand;
    }

    /**
     * setzt den Nachnamen des Kontoinhabers
     * @param nachname der Nachname des Kontoinhabers
     */
    public void setNachname(String nachname) throws NumericRangeExceptionEkmedzic, IllegalArgumentException {
        Objects.requireNonNull(nachname, "Der Vorname darf nicht null sein!");
        if(nachname.isEmpty()) {
            throw new IllegalArgumentException("Ungültiger Nachname!");
        }
        if(nachname.length() < 3) {
            throw new NumericRangeExceptionEkmedzic("Der Nachname muss mindestens 3 stellen haben!");
        }
        this.nachname = nachname;
    }

    /**
     * setzt den Vornamen des Kontoinhabers
     * @param vorname der Vorname des Kontoinhabers
     */
    public void setVorname(String vorname) {
        Objects.requireNonNull(vorname, "Nachname darf nicht null sein!");
        if(vorname.isEmpty()) {
            throw new IllegalArgumentException("Ungültiger Vorname!");
        }
        this.vorname = vorname;
    }

    /**
     * Diese Methode überweist Geld auf das Konto und überprüft, ob die Überweisung gültig ist
     * @param betrag der überwiesene Betrag
     * @return den aktualisierten Kontostand
     */
public double ueberweisung(double betrag) throws NumericRangeExceptionEkmedzic{
        if(this.kontostand + betrag < 0) {
            throw new NumericRangeExceptionEkmedzic("Der Kontostand darf nicht negativ sein!");
        }
        return this.kontostand += betrag;
    }

    /**
     * Diese Methoden gibt alle Daten des Kontos zurück
     * @return die Kontonummer, den Vornamen, den Nachnamen und den aktuellen Kontostand des Kontoinhabers
     */
    @Override
    public String toString() {
        return this.kontoNR + " - " + this.vorname + " " + this.nachname + " - " + this.kontostand + " €";
    }

    /**
     * vergleicht zwei Objekte mit ihren Attributen
     * @param obj neues Objekt
     * @return true oder false
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (this.getClass() != obj.getClass())
            return false;
        Konto other = (Konto) obj;
        return Objects.equals(kontoNR, other.kontoNR) &&
                Objects.equals(vorname, other.vorname) &&
                Objects.equals(nachname, other.nachname) &&
                Double.doubleToLongBits(kontostand) == Double.doubleToLongBits(other.kontostand);
    }

    /**
     * erzeugt einen Hashcode
     * @return den Hashcode als int
     */
    @Override
    public int hashCode() {
        return (int) (11 * 2 * kontostand + kontoNR + vorname.hashCode() + nachname.hashCode());
    }

    /**
     * Diese Zeile im Java-Code formatiert eine Ganzzahl (Integer) in eine Zeichenkette (String)
     * mit einer festen Länge von 15 Zeichen. Der Wert, der formatiert werden soll, ist die
     * Variable "kontoNR". Diese Variable sollte eine Ganzzahl sein, die eine Kontonummer repräsentiert.
     * Die Methode, die zur Formatierung der Kontonummer verwendet wird, heißt "String.format()".
     * Diese Methode nimmt eine Formatzeichenfolge als Argument und gibt einen formatierten String zurück.
     * In diesem Fall besteht die Formatzeichenfolge aus "%015d". Das Format "%d" bedeutet, dass eine
     * Ganzzahl formatiert werden soll. Die "0" vor dem "15" gibt an, dass die formatierte Zahl mit
     * führenden Nullen aufgefüllt werden soll, um eine Gesamtlänge von 15 Zeichen zu erreichen.
     * Zusammengefasst bedeutet die Zeile also, dass die Variable "kontoNR" zu einer Zeichenkette
     * konvertiert wird, die 15 Zeichen lang ist und mit führenden Nullen aufgefüllt ist, um eine Kontonummer darzustellen.
     * @return die Kontonummer mit so vielen 0 davor bis die Länge 15 erreicht ist
     */
    @Override
    public String identifier() {
        return String.format("%015d", kontoNR);
    }
}