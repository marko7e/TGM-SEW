import java.util.*;

public class AntwortCheckerLösung {

	public static boolean antwortCheck(Scanner sc, String pw) {
		try {
			String input = sc.nextLine();
			return input.equals(pw);
		} catch (NoSuchElementException nsee) {
			System.err.println("Keine Eingabe vorhanden!");
			return false;
		} catch (IllegalStateException ise) {
			System.err.println("Scanner geschlossen!");
			return false;
		}
	}

	public static boolean antwortCheck(Scanner sc, int pruefWert) {
		try {
			int input = sc.nextInt();
			return input == pruefWert;
		} catch (InputMismatchException ime) {
			System.err.println("Ungültige Eingabe!");
			return false;
		} catch (NoSuchElementException nsee) {
			System.err.println("Keine Eingabe vorhanden!");
			return false;
		} catch (IllegalStateException ise) {
			System.err.println("Scanner geschlossen!");
			return false;
		}
	}

}