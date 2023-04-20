/**
package Rest;

import java.util.*;
/**
 * Dieses Programm fragt den Benutzer verschiedene fragen. Jede Antwortmöglichkei ist ein verschiedener Parameter. Die Fragen werden per Zufall
 * mit der Klasse Random ausgewählt und der Benuzer kann entscheiden ob er weitere Fragen beantworten möchte oder die 
 * Fragerunde beenden will. Am Ende wird die Anzahl der richtigen und falschen Antworten angezeigt und der Scanner wird geschlossen. 
 * @author Marko Ekmedzic
 * @version 2022-10-09
 *
public class ObjektQuiz {
	/**
	 * Main-Methode
	 * @param args abcdefg
	 *
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		Random r = new Random();
		int falsch = 0;
		int richtig = 0;
		
		boolean wiederholen = false;
		do {
			switch(r.nextInt(5)) {
			case 0:
				System.out.println("Wie werden Variablen, denen man Verweise auf Objekte als Wert zuweisen kann, in Java genau genannt?");
				if(AntwortChecker.antwortCheck(sc, "Referenzvariable")) {
					System.out.println("Richtig!");
					richtig++;
				} else {
					System.out.println("Falsch!");
					falsch++;
				}
				break;
			case 1:
				System.out.println("Wie viele primitive Datentypen gibt es?");
				if(AntwortChecker.antwortCheck(sc, 8)) {
					System.out.println("Richtig!");
					richtig++;
				} else {
					System.out.println("Falsch!");
					falsch++;
				}
				break;
			case 2:
				System.out.println("Vom Wort Objekt ist der 4 Index welcher");
				if(AntwortChecker.antwortCheck(sc, 'k')) {
					System.out.println("Richtig!");
					richtig++;
				} else {
					System.out.println("Falsch!");
					falsch++;
				}
				break;
			case 3:
				System.out.println("Die Methode \"Random\" geht von 0 bis ___?\nKomma als \",\" schreiben!");
				if(AntwortChecker.antwortCheck(sc, 0.9)) {
					System.out.println("Richtig!");
					richtig++;
				} else {
					System.out.println("Falsch!");
					falsch++;
				}
				break;
			case 4:
				System.out.println("Die Gesamtheit der aktuellen Werte aller Attribute eines Objekts werden Zustand genannt?"
						+ "\nFür richtig \"true\" und für falsch \"false\" eingeben.");
				if(AntwortChecker.antwortCheck(sc, true)) {
					System.out.println("Richtig!");
					richtig++;
				} else {
					System.out.println("Falsch!");
					falsch++;
				}
				break;
			}
			System.out.println("Möchten Sie noch eine Frage beantworten?");
			if(sc.nextLine().equals("ja")) {
				wiederholen = true;
			} else if(sc.nextLine().equals("nein")) {
				wiederholen = false;
			}
		} while(wiederholen);
		System.out.println("Sie haben "+richtig+" Antworten richtig und "+falsch+" Antworten falsch beantwortet.");
		sc.close();
	}
}
*/