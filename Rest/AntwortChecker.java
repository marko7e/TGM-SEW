import java.util.*;
/**
 * Diese Klasse beinhaltet überladene Methoden die Eingaben vom Benutzer überprüfen können und Exceptions fangen und prüfen.
 * @author Marko Ekmedzic
 * @version 2022-10-09
 */
public class AntwortChecker {
	/**
	 * Diese Methode prüft einen String
	 * @param sc Eingabe vom Benutzer
	 * @param s Text zum prüfen
	 * @return den Text als String
	 */
	public static boolean antwortCheck(Scanner sc, String s) {
		return sc.nextLine().equals(s);
	}
	/**
	 * Diese Methode prüft einen Integer und eine Exception
	 * @param sc Eingabe vom Benutzer
	 * @param i Zahl zum Prüfen
	 * @return den gültigen oder ungültigen Integer
	 */
	public static boolean antwortCheck(Scanner sc, int i) {
		try {
			int eingabe = sc.nextInt();
			return eingabe == i;
		} catch (InputMismatchException ime) {
			System.err.print("Eingabe ungültig!");
			return false;
		}
	}
	/**
	 * Diese Methode prüft einen Char und eine Exception
	 * @param sc Eingabe vom Benutzer
	 * @param c Char zum prüfen
	 * @return den gültigen oder ungültigen Char
	 */
	public static boolean antwortCheck(Scanner sc, char c) {
		try {
			char eingabe = sc.nextLine().charAt(0);
			return eingabe == c;
		} catch(NoSuchElementException nsee) {
			System.err.print("Keine eingabe vorhanden");
			return false;
		} catch(StringIndexOutOfBoundsException sioobe) {
			System.err.print("Eingabe ungültig!");
			return false;
		}
	}
	/**
	 * Diese Methode prüft einen double und eine Exception
	 * @param sc Eingabe vom Benutzer
	 * @param d double zum Prüfen
	 * @return den gültigen oder ungpltigen double
	 */
	public static boolean antwortCheck(Scanner sc, double d) {
		try {
			double eingabe = sc.nextDouble();
			return eingabe == d;
		} catch(InputMismatchException ime) {
			System.err.print("Eingabe ungültig!");
			return false;
		}
	}
	/**
	 * Diese Methode prüft einen boolean und eine Exception
	 * @param sc Eingabe vom Benutzer
	 * @param b Boolean zum prüfen
	 * @return den gültigen oder ungültigen boolean
	 */
	public static boolean antwortCheck(Scanner sc, boolean b) {
		try {
			boolean eingabe = sc.nextBoolean();
			return eingabe == b;
		} catch(InputMismatchException ime) {
			System.err.print("Eingabe ungültig!");
			return false;
		}
	}
}
