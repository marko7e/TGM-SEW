/**
 * Verschlüsselung und Entschlüsselung von Passwort
 * @author Marko Ekmedzic
 * @version 2022-09-20
 */
public class Verschluesselung {
	/**
	 * Verschlüsselt den Text des Benutzer mit der Caeser Schreibweise
	 * @param ents abc
	 * @return abc
	 */
	public static String verschluesseln(String ents) {
		String vers = "";
		
		char pos;
		
		for(int i = 0; i < ents.length(); i++) {
			
			pos = ents.charAt(i);
			
			int entsInt = (int) pos + 3;
			
			pos = (char) entsInt;
			
			vers  += pos;
			
		}
		
		vers = vers.toUpperCase();
		
		return vers;
	}
	
	/**
	 * Verschlüsselt die Eingabe des Benutzers mit dem eingegebenen Abstand
	 * @param ents abc
	 * @param abs abc
	 * @return abc
	 */
	public static String verschluesseln(String ents, int abs) {
		
		String vers = "";
		
		char pos;
		
		for(int i = 0; i < ents.length(); i++) {
			
			pos = ents.charAt(i);
			
			int entsInt = (int) pos + abs;
			
			pos = (char) entsInt;
			
			vers  += pos;
			
		}
		
		return vers;
		
	}
	/**
	 * Verschlüsselung mithilfe eines Buchstabens.
	 * @param ents abc
	 * @param verg abc
	 * @return abc
	 */
	
	public static String verschluesseln(String ents, char verg) {
		String vers = "";
		char pos;
		int Auni = (int) 'A';
		int vergUni = (int) verg;
	
		int unterschied = vergUni - Auni;
		
		for(int i = 0; i < ents.length(); i++) {
			
			pos = ents.charAt(i);
			
			int entsInt = (int) pos + unterschied;
			
			pos = (char) entsInt;
			
			vers  += pos;
			
		}
		
		
		return vers.toUpperCase();
		
	}
	
	/**
	 * Entschlüsselung mit der Caeser Schreibweise
	 * @param vers abc
	 * @return abc
	 */
	public static String entschluesseln(String vers) {
		
		String ents = "";
		
		char pos;
		
		for(int i = 0; i < vers.length(); i++) {
			
			pos = vers.charAt(i);
			
			int entsInt = (int) pos - 3;
			
			pos = (char) entsInt;
			
			ents  += pos;
			
		}
		
		return ents.toLowerCase();
		
	}
	
	/**
	 * Entschlüsselt von dem Abstand 
	 * @param ents abc
	 * @param abs abc
	 * @return abc
	 */
	public static String entschluesseln(String ents, int abs) {
		
		String vers = "";
		
		char pos;
		
		for(int i = 0; i < ents.length(); i++) {
			
			pos = ents.charAt(i);
			
			int entsInt = (int) pos - abs;
			
			pos = (char) entsInt;
			
			vers  += pos;
			
		}
		
		return vers.toLowerCase();
		
	}
	/**
	 * Entschlüsselt zweiten Parameter
	 * @param ents abc
	 * @param verg abc
	 * @return abc
	 */
	public static String entschluesseln(String ents, char verg) {
		String vers = "";
		char pos;
		
		int Auni = (int) 'A';
		int vergUni = (int) verg;
	
		int unterschied = vergUni - Auni;
		
		for(int i = 0; i < ents.length(); i++) {
			
			pos = ents.charAt(i);
			
			int entsInt = (int) pos - unterschied;
			
			pos = (char) entsInt;
			
			vers  += pos;
			
		}
		
		return vers.toLowerCase();
		
	}
	
	
}