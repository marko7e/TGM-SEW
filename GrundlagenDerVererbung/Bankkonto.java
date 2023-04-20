package GrundlagenDerVererbung;

/**
 * Dieses Interface kann für alle Klassen verwendet werden die Bankkonten implementieren.
 *
 * @author Eva Lehner
 * @version 2023-03-20
 */

public interface Bankkonto {

	/**
	 * Liefert den aktuellen Kontostand als Dezimalzahl (in Euro)
	 * @return Kontostand
	 */
	public double getKontostand();
	
	/**
	 * Verändert den Kontostand um den übergebenen Betrag und gibt den neuen Kontostand zurück
	 * @param betrag der, der vom Konto abgezogen wird oder der auf das Konto überwiesen wird.
	 * @return der Kontostand, nachdem die Überweisung durchgeführt wurde.
	 * @throws NumericRangeExceptionEkmedzic wenn das Konto nicht gedeckt ist i.e. der Betrag den Überziehungsrahmen übersteigt.
	 */
	public double ueberweisung(double betrag) throws NumericRangeExceptionEkmedzic;
}
