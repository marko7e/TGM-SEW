/**
 * Dieses Programm checkt ob ein Zeichen ein Buchstabe bzw. eine Zahl ist
 * @author Marko Ekmedzic
 * @version 2022-09-07
 */
public class PasswortCheck	 {
	/**
	 * Checkt ob ein Zeichen ein Buchstabe bzw Zahl ist
	 * @param c das Zeichen zum überprüfen
	 * @return ob es übereinstimmt oder nicht
	 */
	public static boolean istZeichenGueltig(char c) {
		boolean checker = Character.isLetterOrDigit(c);
		return checker;
	}
	/**
	 * Diese Methode überlädt die obere Methode und checkt ob das Zeichen zugelassen ist oder nicht
	 * @param c das Zeichen zum überprüfen
	 * @param b gibt an ob es erlaubt ist oder nicht
	 * @return erlaubt oder nicht
	 */
	public static boolean istZeichenGueltig(char c, boolean b) {
		if(b == false) {
			if(Character.isLetterOrDigit(c)) {
				return true;
			}
			return false;
		} else if(Character.isLetterOrDigit(c) || c == '!' || c== '@' || c== '$' || c=='%' || c=='/' || c=='=' || c=='?' || c=='+' || c=='~' || c=='#' || c=='_' || c=='.' || c==';' || c=='{' || c=='}' || c=='|') {
			return true;
		}
		return false;
	}
	/**
	 * Checkt ob das Passwort im ganzem gültig ist
	 * @param passwort das Passwort zum überprüfen
	 * @return ob es übereinstimmt oder nicht
	 */
	public static boolean istPasswortGueltig(String passwort, boolean b) {
		boolean checker = true;
		for(int i = 0; i < passwort.length();i++) {
			if(istZeichenGueltig(passwort.charAt(i), b) == false) {
			checker = false;
			}
		}
		return checker;
	}
}
