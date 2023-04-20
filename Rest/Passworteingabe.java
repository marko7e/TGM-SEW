import javax.swing.*;
/**
 * In diesem Programm kann man ein Passwort eingeben und je nach Richtlinien bzw Übereinstimmung des Passwort
 * wird der Zugriff gewährt oder abgelehnt
 * @author Marko Ekmedzic
 * @version 2022-09-07
 */
public class Passworteingabe {
	/**
	 * Die Mainmethode die das Passwort checkt
	 * @param args ist eine Array von Strings
	 */
	public static void main(String[]args) {
		String eingabe;
		String passwort = "Sew2022";
		do {
			eingabe = JOptionPane.showInputDialog(null, "Bitte geben sie ein Passwort ein: ");
			if(PasswortCheck.istPasswortGueltig(eingabe, true)== false) {
				JOptionPane.showMessageDialog(null, "Das Passwort entspricht nicht den Richtlinien!");
			} else if(PasswortCheck.istPasswortGueltig(eingabe, true) == true && !(eingabe.equals(passwort))) {
				JOptionPane.showMessageDialog(null, "Zugriff verweigert!");
			} else if(PasswortCheck.istPasswortGueltig(eingabe, true) == true && (eingabe.equals(passwort))) {
				JOptionPane.showMessageDialog(null, "Zugriff gestattet!");
			}
			
		}while(!(eingabe.equals(passwort)));
		
	}	
}
