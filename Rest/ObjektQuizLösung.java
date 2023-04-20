/**
package Rest;

import java.util.*;

public class ObjektQuizLösung {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		AntwortChecker AntwortCheckerLösung;
		do {
			int frage = r.nextInt(5);
			boolean check = false;
			switch (frage) {
			case 0:
				System.out.println("Mit welchem Schlüsselwort wird eine Exception gefangen?");
				check = AntwortCheckerLösung.antwortCheck(sc, "catch");
				break;
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("TODO");
			}
			if (check) {
			} else {
			}
			System.out.println("Noch eine Frage?");
		} while (AntwortCheckerLösung.antwortCheck(sc, "catch"));

		sc.close();
	}

}
 */