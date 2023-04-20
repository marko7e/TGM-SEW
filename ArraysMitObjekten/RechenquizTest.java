package ArraysMitObjekten;

/**
 * Dieses Programm testet die Methoden aus Rechenquiz und Rechenaufgabe
 * @author Marko Ekmedzic
 * @verison 2023-02-22
 */
public class RechenquizTest {
    public static void main(String[] args) {
        Rechenquiz quiz = new Rechenquiz(5);
        quiz.neueRechnung("5 + 5", 10, 0, 1);
        Rechenaufgabe r1 = new Rechenaufgabe("2 * 2", 4, 0.1, 1);
        quiz.neueRechnung(r1);
        System.out.println(quiz.checkErgebnis("5 + 5", 10));
        System.out.println(quiz.checkErgebnis("2 * 2", 4));
        quiz.delete("2 * 2");
        quiz.neueRechnung("6 + 8", 14, 0.5, 1);
        quiz.setMinimumToleranz(1);
        System.out.println(quiz.punktestand());
        System.out.println(quiz.quizText());

        Rechenaufgabe klon = r1.clone();
        System.out.println(klon.getPunkte());

    }
}
