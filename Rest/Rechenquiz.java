package Rest;

import java.util.*;
/**
 * Dieses Programm fragt den Benutzer ob die Toleranz berücksichtigt werden soll oder nicht. Dann fragt es 
 * den Benutzer verschiedene Rechnungen die er zu beantworten hat, dabei wird mitgezählt wie viele richtig und 
 * falsch beantwortet wurden. Er wird nach jeder Rechnung gefragt ob er eine weitere beantworten will oder nicht. 
 * Am Ende wird der Punktestand ausgegeben.
 * @author Marko Ekmedzic
 * @version 2022-11-12
 *
public class Rechenquiz {

	public static void main(String[] args) {
		Random r = new Random();
		int richtig = 0, falsch = 0;
		boolean weiter;
		
		System.out.println("Möchten Sie, dass die Toleranz berücksichtigt wird oder nicht?\nFür ja \"true\" und nein \"false\" eingeben.");
		boolean b = bEingabe(); 
		do {
			switch(r.nextInt(3)) {
			case 0:
				Rechenaufgabe r1 = new Rechenaufgabe("4*4", 16, 1.6);
				System.out.println(r1.getRechnung() + " ergibt: ");
				double a1 = dEingabe();
				if(r1.checkAntwort(a1, b) ) {
					System.out.println("Richtig!");
					richtig++;
				} else {
					System.out.println("Falsch!");
					falsch++;
				}
				break;
			case 1:
				Rechenaufgabe r2 = new Rechenaufgabe("6+6", 12, 1.2);
				System.out.println(r2.getRechnung() + " ergibt: ");
				double a2 = dEingabe();
				if(r2.checkAntwort(a2, b)) {
					System.out.println("Richtig!");
					richtig++;
				} else {
					System.out.println("Falsch!");
					falsch++;
				}
				break;
			case 2:
				Rechenaufgabe r3 = new Rechenaufgabe("30/6", 5, 0.5);
				System.out.println(r3.getRechnung() + " ergibt: ");
				double a3 = dEingabe();
				if(r3.checkAntwort(a3, b)) {
					System.out.println("Richtig!");
					richtig++;
				} else {
					System.out.println("Falsch!");
					falsch++;
				}
				break;
			case 3:
				Rechenaufgabe r4 = new Rechenaufgabe("4^6", 4096, 409.6);
				System.out.println(r4.getRechnung() + " ergibt: ");
				double a4 = dEingabe();
				if(r4.checkAntwort(a4, b)) {
					System.out.println("Richtig!");
					richtig++;
				} else {
					System.out.println("Falsch!");
					falsch++;
				}
				break;
			}
			System.out.print("Möchten Sie weiter machen?\nFür ja \"true\" und nein \"false\" eingeben: ");
			weiter = bEingabe();
		}while(weiter);
		
		System.out.print("Richtige Antworten: " + richtig + "\nFalsche Antworten: " + falsch);
	}
	@SuppressWarnings("resource")
	private static boolean bEingabe() {
        try {
            return new Scanner(System.in).nextBoolean();
        } catch (InputMismatchException ime) {
            System.out.println("Eingabe ungültig!");
            return bEingabe();
        }
    }
	@SuppressWarnings("resource")
	private static double dEingabe() {
        try {
            return new Scanner(System.in).nextDouble();
        } catch (InputMismatchException ime) {
            System.out.print("Eingabe ungültig!");
            return dEingabe();
        }
    }
}
 */