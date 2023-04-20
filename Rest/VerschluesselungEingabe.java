import javax.swing.JOptionPane;
/**
 * Eingabe und Ausgabe vom Verschl�sseln
 * @author Marko Ekmedzic
 * @version 2022-09-20
 */
public class VerschluesselungEingabe {
	/**
	 * Main-Methode
	 * @param args ist eine Array von String
	 */
	public static void main(String[] args) {
		int wahl = Integer.parseInt(JOptionPane.showInputDialog(null, "Was möchten Sie tun?\r\n"
				+ "1) Einen Text mittels Standard-Caesar-Verschlüsselung verschlüsseln.\r\n"
				+ "2) Einen Text durch Eingabe eines eigenen Verschiebewertes verschlüsseln.\r\n"
				+ "3) Einen Text durch Eingabe eines eigenen Schlüsselbuchstabens verschlüsseln.\r\n"
				+ "4) Einen Text mittels Standard-Caesar-Verschlüsselung entschlüsseln.\r\n"
				+ "5) Einen Text durch Eingabe eines eigenen Verschiebewertes entschlüsseln.\r\n"
				+ "6) Einen Text durch Eingabe eines eigenen Schlüsselbuchstabens entschlüsslen."));
		if(wahl == 1) {
			String entschlüsselt = JOptionPane.showInputDialog(null, "Der zu verschlüsselnde Wert: ");
			JOptionPane.showMessageDialog(null, "Das Ergebnis: " + Verschluesselung.verschluesseln(entschlüsselt));
		}
		if(wahl == 2) {
			String entschlüsselt = JOptionPane.showInputDialog(null, "Der zu verschlüsselnde Wert: ");
			int abs = Integer.parseInt(JOptionPane.showInputDialog(null, "Der Verschiebewert: "));
			JOptionPane.showMessageDialog(null, "Das Ergebnis: " + Verschluesselung.verschluesseln(entschlüsselt, abs));
		}		
		if(wahl == 3) {
			String entschlüsselt = JOptionPane.showInputDialog(null, "Der zu verschlüsselnde Wert: ");
			char abs = (JOptionPane.showInputDialog(null, "Der Schlüsselbuchstabe: ")).charAt(0);
			JOptionPane.showMessageDialog(null, "Das Ergebnis: " + Verschluesselung.verschluesseln(entschlüsselt, abs));
		}		
		if(wahl == 4) {
			String entschlüsselt = JOptionPane.showInputDialog(null, "Der zu entschlüsselnde Wert: ");
			JOptionPane.showMessageDialog(null, "Das Ergebnis: " + Verschluesselung.entschluesseln(entschlüsselt));
		}		
		if(wahl == 5) {
			String entschlüsselt = JOptionPane.showInputDialog(null, "Der zu entschlüsselnde Wert: ");
			int abs = Integer.parseInt(JOptionPane.showInputDialog(null, "Der Verschiebewert: "));
			JOptionPane.showMessageDialog(null, "Das Ergebnis: " + Verschluesselung.entschluesseln(entschlüsselt, abs));
		}
		if(wahl == 6) {
			String entschlüsselt = JOptionPane.showInputDialog(null, "Der zu verschlüsselnde Wert: ");
			char abs = (JOptionPane.showInputDialog(null, "Der Schl�sselbuchstabe: ")).charAt(0);
			JOptionPane.showMessageDialog(null, "Das Ergebnis: " + Verschluesselung.entschluesseln(entschlüsselt, abs));
		}
		
	}
	
}