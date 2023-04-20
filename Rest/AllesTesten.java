package Rest;

public class AllesTesten {
	/**
	 private static void eins() {
	 Calendar c = new GregorianCalendar();
	 int abfdf =c.get(Calendar.MONTH);
	 System.out.print(abfdf);
	 }
	 */
	/**
	 * private static void zwei() {
	 * String eingabe = JOptionPane.showInputDialog(null, "Datum eingeben:");
	 * DateTimeFormatter formatter = DateTimeFormat.forPattern("dd.MM.yyyy");
	 * DateTime d1 = DateTime.parse(eingabe, formatter);
	 * DateTime d2 = DateTime.parse(eingabe, formatter); // 1972 ist Schaltjahr
	 * int daysBetween = Days.daysBetween(d1, d2).getDays();
	 * }
	 *

	private static void drei() {
		int zufall = (int) (Math.random() * 18 - 4);
		System.out.print(zufall);

	}

	public class Rechenquiz {
		public static void main(String[] args) {
			Random random = new Random();

			int beanworteteFragen = 0, korrekteFragen = 0;
			String fragenPool = "";

			System.out.println("Soll eine Toleranz berücksichtigt werden?");
			boolean toleranz = booleanEingabe();
			do {
				int zufallszahl = random.nextInt(3);

				while (fragenPool.contains(String.valueOf(zufallszahl))) {
					zufallszahl = random.nextInt(3);
				}
				fragenPool += zufallszahl;

				if (quizFragen(zufallszahl, toleranz)) {
					System.out.println("Richtig!");
					korrekteFragen++;
				} else {
					System.out.println("Falsch");
				}
				beanworteteFragen++;

				if (fragenPool.length() < 3)
					System.out.print("\nMöchten Sie weitermachen? (true/false): ");
			} while (fragenPool.length() < 3 && booleanEingabe());

			System.out.println("Es würden insgesamt " + beanworteteFragen + " Fragen beanwortet. Davon sind " + korrekteFragen + " richtig und " + (beanworteteFragen - korrekteFragen) + " falsch!");
		}

		/**
		 * Gibt die Rechenaufgabe aus und je nachdem, ob die Toleranz
		 * berücksichtigt werden soll, diesen Wert auch mit dazu.
		 *
		 * @param frage       eine Zahl, welche die Frage auswählt
		 * @param istToleranz ob beim Beantworten eine Toleranz berücksichtigt werden soll
		 * @return ob die Frage korrekt beantwortet wurde
		 *
		private static boolean quizFragen(int frage, boolean istToleranz) {
			switch (frage) {
				case 0:
					Rechenaufgabe ra1 = new Rechenaufgabe("15*4", 60, 5);
					System.out.print("Was ergibt " + ra1.getRechnung() + " ");
					if (istToleranz) {
						System.out.println("(Toleranz: " + ra1.getToleranz() + ")");
					}
					return ra1.checkAntwort(doubleEingabe(), istToleranz);
				case 1:
					Rechenaufgabe ra2 = new Rechenaufgabe("4^3", 64, 6);
					System.out.print("Was ergibt " + ra2.getRechnung() + " ");
					if (istToleranz) {
						System.out.println("(Toleranz: " + ra2.getToleranz() + ")");
					}
					return ra2.checkAntwort(doubleEingabe(), istToleranz);
				case 2:
					Rechenaufgabe ra3 = new Rechenaufgabe("111+217", 328, 8);
					System.out.print("Was ergibt " + ra3.getRechnung() + " ");
					if (istToleranz)
						System.out.println("(Toleranz: " + ra3.getToleranz() + ")");
					return ra3.checkAntwort(doubleEingabe(), istToleranz);
			}
		}
	}
	*/
}