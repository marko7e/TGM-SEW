package GrundlagenDerVererbung;

/**
 * Hiermit werden alle Objekte gekennzeichnet, die eine Textuelle ID von mindestens 15
 * Stellen zurückgeben können.
 * @author Lisa Vittori
 * @version 2023-03-20
 */
public interface Identifizierbar {
	/**
	 * Diese Methode gibt eine Identifikationsnummer mit mindestens 15 Stellen zurück
	 * @return eine Identifikationsnummer als Text mit mindestens 15 Zeichen.
	 */
	public String identifier();
}
