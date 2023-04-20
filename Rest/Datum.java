package Rest;

import java.time.LocalDate;
import java.util.*;
import java.time.Period;
/**
 * Dieses Programm lässt den Benutzer ein Datum eingeben und berechnet die Zeit
 * die entweder von dem Datum vergangen ist oder noch zum Datum fehlen. Außerdem
 * @author Marko Ekmedzic
 * @verison  2022-10-11
 */
public class Datum {
	/**
	 * Diese Methode überprüft die Gültigkeit der Eingabe in der Main-Methode
	 * @param max zahl der Eingabe
	 * @return eine Zahl zwischen 1 und maximal erlaubter Wert
	 */

	@SuppressWarnings("resource")
	private static int prufen(int max) {
		int i = -1;
		try {
			i = new Scanner(System.in).nextInt();
			if(1 > i || i > max) {
				System.out.println("ungültige Eingabe! Nur Zahlen zwischen 1 und " + max + " sind erlaubt!");
				return -1;
			}

		} catch(InputMismatchException ime) {
			System.err.print("Eingabe ungültig!");
		}
		return i;
	}
	/**
	 * Main-Methode
	 * @param args ist ein Array von String
	 */
	public static void main(String[] args) {
		int tag;
		int monat;
		int jahr;
		int jahr2;
		
		System.out.println("Bitte geben Sie einen beliebigen Tag ein: "); //Frage
		tag = prufen(31);
		while(tag == -1) {
			System.out.println("Versuchen Sie es nochmal: ");
			tag = prufen(31);
		}
		
		System.out.println("Bitte geben Sie einen beliebigen Monat ein: "); //Frage
		monat = prufen(12);
		while(monat == -1) {
			System.out.println("Versuchen Sie es nochmal: ");
			monat = prufen(12);
		}
		
		System.out.println("Bitte geben Sie ein beliebiges Jahr ein: "); //Frage
		jahr = prufen(Integer.MAX_VALUE);
		while(jahr == -1) {
			System.out.println("Versuchen Sie es nochmal: ");
			jahr = prufen(Integer.MAX_VALUE);
		}
		
		System.out.println("Bitte geben Sie noch ein beliebiges Jahr ein: "); //Frage
		jahr2 = prufen(Integer.MAX_VALUE);
		while(jahr2 == -1) {
			System.out.println("Versuchen Sie es nochmal: ");
			jahr2 = prufen(Integer.MAX_VALUE);
		}
			
		jahr = LocalDate.now().getYear();
	

		int naechstesJahr = LocalDate.now().getYear() + 1; //Variable für das nächste Jahr wird deklariert und initialisert

		LocalDate from = LocalDate.of(jahr, monat, tag); //Eingegebene Daten werden als Datum gespeichert
		LocalDate to = LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth()); //Eingegebene Daten werden als Datum gespeichert
		LocalDate to2 = LocalDate.of(naechstesJahr, monat, tag); //Eingegebene Daten werden als Datum gespeichert

		Period zeitraum = Period.between(from, to); //Abstand zwischen den Daten werden berechnet
		Period naechsterZeitraum = Period.between(to, to2); //Abstand zwischen den Daten werden berechnet

		System.out.println("Eingegebenes Datum: " + tag + "." + monat + "." + jahr);
		System.out.println("Zusätzlich eingegebenes Jahr: " + jahr2);
		System.out.println("Monate seit dem eingegebenen Datum: " + zeitraum.getMonths());
		System.out.println("Tage seit dem eingegebenen Datum: " + zeitraum.getDays());
		System.out.println("Jahre bis zu dem eingegebenen Datum im nächsten Jahr: " + naechsterZeitraum.getYears());
		System.out.println("Monate bis zu dem eingegebenen Datum im nächsten Jahr: " + naechsterZeitraum.getMonths());
		System.out.println("Tage bis zu dem eingegebenen Datum im nächsten Jahr: " + naechsterZeitraum.getDays());
		System.out.println("Jahre seit dem zweiten eingegebenen Jahr bis zum jetzigen Jahr: " + (LocalDate.now().getYear() - jahr2));

		int h = monat, k = jahr; 
		if (monat < 3) { //Werte falls das Datum ein Schaltjahr ist
			h = monat + 12;
			k = jahr - 1;
		}

		int k2 = jahr2;
		if (monat < 3) { //Werte falls das Datum ein Schaltjahr ist
			h = monat + 12;
			k = naechstesJahr - 1;
		}

		int wochentag = (tag + 2 * h + (3 * h + 3) / 5 + k + k / 4 - k / 100 + k / 400 + 1) % 7; //Berechnung des Wochentags 
		int wochentag2 = (tag + 2 + h + (3 + h + 3) / 5 + k2 + k2 / 4 - k2 / 100 + k2 / 400 + 1) % 7; //Berechnung des Wochentags

		switch (wochentag) { //Wechselt zwischen den Wochentage die Ausgegeben werden je nach Datum
		case 0:
			System.out.println("Das von ihnen eingegebene Datum: " + tag + "." + monat + "." + jahr + " entspricht den Wochentag Sonntag");
			break;
		case 1:
			System.out.println("Das von ihnen eingegebene Datum: " + tag + "." + monat + "." + jahr + " entspricht den Wochentag Montag");
			break;
		case 2:
			System.out.println("Das von ihnen eingegebene Datum: " + tag + "." + monat + "." + jahr + " entspricht den Wochentag Dienstag");
			break;
		case 3:
			System.out.println("Das von ihnen eingegebene Datum: " + tag + "." + monat + "." + jahr + " entspricht den Wochentag Mittwoch");
			break;
		case 4:
			System.out.println("Das von ihnen eingegebene Datum: " + tag + "." + monat + "." + jahr + " entspricht den Wochentag Donnerstag");
			break;
		case 5:
			System.out.println("Das von ihnen eingegebene Datum: " + tag + "." + monat + "." + jahr + " entspricht den Wochentag Freitag");
			break;
		case 6:
			System.out.println("Das von ihnen eingegebene Datum: " + tag + "." + monat + "." + jahr + " entspricht den Wochentag Samstag");
			break;
		}

		switch (wochentag2) { //Wechselt zwischen den Wochentage die Ausgegeben werden je nach Datum
		case 0:
			System.out.println("Das von ihnen eingegebene Datum: " + tag + "." + monat + "." + naechstesJahr + " entspricht den Wochentag Sonntag");
			break;
		case 1:
			System.out.println("Das von ihnen eingegebene Datum: " + tag + "." + monat + "." + naechstesJahr + " entspricht den Wochentag Montag");
			break;
		case 2:
			System.out.println("Das von ihnen eingegebene Datum: " + tag + "." + monat + "." + naechstesJahr + " entspricht den Wochentag Dienstag");
			break;
		case 3:
			System.out.println("Das von ihnen eingegebene Datum: " + tag + "." + monat + "." + naechstesJahr + " entspricht den Wochentag Mittwoch");
			break;
		case 4:
			System.out.println("Das von ihnen eingegebene Datum: " + tag + "." + monat + "." + naechstesJahr + " entspricht den Wochentag Donnerstag");
			break;
		case 5:
			System.out.println("Das von ihnen eingegebene Datum: " + tag + "." + monat + "." + naechstesJahr + " entspricht den Wochentag Freitag");
			break;
		case 6:
			System.out.println("Das von ihnen eingegebene Datum: " + tag + "." + monat + "." + naechstesJahr + " entspricht den Wochentag Samstag");
			break;
		}
	}
}