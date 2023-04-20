package GrundlagenDerVererbung;

public class ExceptionTest extends NumericRangeExceptionEkmedzic {
    public static void main(String[] args) throws NumericRangeExceptionEkmedzic {

        //NumericRangeExceptionEkmedzic
        try {
            ErweitertesKonto ek1 = new ErweitertesKonto(6421764L, "Marko", "Ekmedzic", 50, 0.01);
        } catch (NumericRangeExceptionEkmedzic nre) {
            System.out.println("\nNumericRangeException ausgelöst durch .setGebuehr(double Gebuehr)");
            System.out.println(nre.getMessage());
        }
        try {
            Konto k1 = new Konto(7432L, "Toma", "Ristic", 1000);
        } catch (NumericRangeExceptionEkmedzic nree) {
            System.out.println("\nNumericRangeException ausgelöst durch kontoNR");
            System.out.println(nree.getMessage());
        }

        try {
            Konto k2 = new Konto(79516433L, "Simon", "Käse", -1000);
        } catch (NumericRangeExceptionEkmedzic nree) {
            System.out.println("\nNumericRangeException ausgelöst durch Kontostand");
            System.out.println(nree.getMessage());
        }

        //IllegalArgumentException
        try {
            Konto k3 = new Konto(93741743L, "", "Sarana", 1000);
        } catch (IllegalArgumentException iae) {
            System.out.println("\nIllegalArgumentException ausgelöst durch leerer Vorname");
            System.out.println(iae.getMessage());
        }

        try {
            Konto k4 = new Konto(443956134L, "Bernhard", "A", 1000);
        } catch (NumericRangeExceptionEkmedzic nree) {
            System.out.println("\nIllegalArgumentException ausgelöst durch ungültiger Nachname \"A\"");
            System.out.println(nree.getMessage());
        }
    }
}
