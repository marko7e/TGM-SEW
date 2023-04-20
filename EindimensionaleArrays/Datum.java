package EindimensionaleArrays;

/**
 * Diese Methode rechnet den Wochentag eines Datums aus.
 * @author Marko Ekmedzic
 * @version 2023-01-11
 */
public class Datum {
        static String[] wochentage = {"Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"};

    /**
     * gibt den Wochentag zurück
     * @param n zahl des Wochentags
     * @return den Wochentag
     */
    public static String wochentagText(int n) {
            if (n < 0 || n > 6) {
                return "Ungültiger Wochentag";
            }
            return wochentage[n];
        }

    /**
     * rechnet den Wochentag aus
     * @param datum die stelle des datums
     * @return den Wochentag
     */
    public static String wochentag(int[] datum) {
            int tag = datum[0];
            int monat = datum[1];
            int jahr = datum[2];

            if (monat <= 2) {
                monat += 10;
                jahr -= 1;
            } else {
                monat -= 2;
            }

            int a = jahr / 100;
            int b = jahr % 100;
            int c = ((26 * monat - 2) / 10 + tag + b + b / 4 + a / 4 - 2 * a) % 7;

            if (c < 0) {
                c += 7;
            }
            return wochentagText(c);
        }
    }
