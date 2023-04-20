/**
package GrundlagenDerVererbung;

import java.util.Objects;

public class BuchungAlt {

    /**
     * Dieses Programm schaut, ob eine Buchung eine Ein- oder Auszahlung ist und legt es dann als Text fest
     * @author Marko Ekmedzic
     * @verison 2023-02-28
     *
    public record Buchung(String buchungstext, double betrag) {
        /**
         * Ein Konstruktor der die Werte für ein Objekt beinhaltet
         *
         * @param betrag positiv oder negativ
         *
        public Buchung(double betrag) {
            this("", betrag);
            if (betrag <= 0) {
                this.buchungstext = "Auszahlung";
            }
            checkNotNull(this.buchungstext);
        }

        /**
         * Konstruktor für die Klasse Buchung
         * @param betrag der überwiesene betrag
         * @param buchungstext Ein- oder Auszahlung
         *
        public Buchung(double betrag, String buchungstext) {
            this(buchungstext, betrag);
            checkNotNull(this.buchungstext);
        }

        /**
         * überprüft einen null Wert
         * @param check der zu überprüfende Wert
         *
        private void checkNotNull(String check) {
            if (check == null) {
                throw new IllegalArgumentException("Buchungstext darf nicht null sein.");
            }
        }

        /**
         * setzt den Wert für den Betrag
         * @param betrag positiver oder negativer Wert
         *
        public void setBetrag(double betrag) {
            this.betrag = betrag;
        }

        /**
         * gibt den Betrag der Buchung zurück
         * @return den Betrag
         *
        public double getBetrag() {
            return betrag;
        }

        /**
         * gibt den Buchungstext "Einzahlung" oder "Auszahlung" zurück
         * @return den Buchungstext
         *
        public String getBuchungstext() {
            return buchungstext;
        }

        /**
         * gibt eine kurze Information über die Daten der Buchung zurück
         * @return den Buchungstext und den Betrag
         *
        @Override
        public String toString() {
            return buchungstext + ": " + betrag + " €";
        }

        /**
         * vergleich ein neues Objekt mit einem Objekt der Klasse Buchung auf Attribute
         * @param obj neues Objekt
         * @return ob die Objekte gleich sind oder nicht
         *
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            Buchung other = (Buchung) obj;
            return Double.compare(other.betrag, betrag) == 0 &&
                    Objects.equals(buchungstext, other.buchungstext);
        }


        /**
         * erzeugt einen Hashcode für ein Objekt
         * @return den Hashcode als geparste Zahl
         *
        @Override
        public int hashCode() {
            return  11 * 2 * (int) getBetrag() + buchungstext.hashCode();
        }
    }

}
*/