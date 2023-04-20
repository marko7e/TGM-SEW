package ArraysMitObjekten;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

/**
 * Die Klasse Rechenquiz ermöglicht das Erstellen, Speichern und Überprüfen von Rechenaufgaben.
 * @author Marko Ekmedzic
 * @version 2022-11-12
 */
public class Rechenquiz {
    private int erreichtePunkte;
    private int erreichbarePunkte;
    Rechenaufgabe[] rechenaufgaben;
    private final Random zufallsgenerator;

    /**
     * Erstellt ein Array für 10 Rechenaufgaben und setzt die Punkte-Attribute auf 0.
     */
    public Rechenquiz() {
        this(10);
    }

    /**
     * Erstellt ein Array für die angegebene Anzahl von Rechenaufgaben und setzt die Punkte-Attribute auf 0.
     * @param maxAnzahl die maximale Anzahl von Rechenaufgaben
     */
    public Rechenquiz(int maxAnzahl) {
        rechenaufgaben = new Rechenaufgabe[maxAnzahl];
        erreichtePunkte = 0;
        erreichbarePunkte = 0;
        zufallsgenerator = new Random();
    }

    /**
     * Gibt die Anzahl der erreichten Punkte zurück.
     * @return die erreichten Punkte als ganze Zahl
     */
    public int getErreichtePunkte() {

        return this.erreichtePunkte;
    }

    /**
     * Gibt die Anzahl der erreichbaren Punkte zurück.
     * @return die erreichbaren Punkte als ganze Zahl
     */
    public int getErreichbarePunkte() {

        return this.erreichbarePunkte;
    }

    /**
     * Setzt die Punkte-Attribute auf 0 zurück.
     */
    public void reset() {
        erreichtePunkte = 0;
        erreichbarePunkte = 0;
    }

    /**
     * Fügt eine neue Rechenaufgabe zum Array hinzu.
     * @param aufgabe die neue Rechenaufgabe
     * @return true, wenn das Hinzufügen erfolgreich war, sonst false (z.B. wenn das Array schon voll war)
     */
    public boolean neueRechnung(Rechenaufgabe aufgabe) {
        for (int i = 0; i < rechenaufgaben.length; i++) {
            if (rechenaufgaben[i] == null) {
                rechenaufgaben[i] = aufgabe;
                erreichbarePunkte += aufgabe.getPunkte();
                return true;
            }
        }
        return false;
    }

    /**
     * Diese Methode erstellt eine neue Rechnung
     * @param rechnung die Rechnung als String
     * @param antwort die Antwort der Rechnung
     * @param toleranz die Toleranz die nicht überschritten werden darf
     * @param punkte die punkte
     * @return die neue Rechnung
     */
    public boolean neueRechnung(String rechnung, double antwort, double toleranz, int punkte) {
        return neueRechnung(new Rechenaufgabe(rechnung, antwort, toleranz, punkte));
    }

    /**
     * Sucht eine zufällige Aufgabe aus dem Array und gibt die Rechnung (ohne Lösung) als Text zurück.
     * @return die Rechnung als Text
     */
    public String zufallsRechnung() {
        int index = zufallsgenerator.nextInt(rechenaufgaben.length);
        while (rechenaufgaben[index] == null) {
            index = zufallsgenerator.nextInt(rechenaufgaben.length);
        }
        return rechenaufgaben[index].getRechnung();
    }

    /**
     * Sucht die Rechenaufgabe mit der übergebenen Rechnung und überprüft das Ergebnis mit der übergebenen Antwort.
     * @param rechnung die Rechnung als Text
     * @param antwort  die Antwort als Double
     * @return true, wenn das Ergebnis richtig ist, sonst false
     */
    public boolean checkErgebnis(String rechnung, double antwort) {
        for (Rechenaufgabe aufgabe : rechenaufgaben) {
            if (aufgabe != null && aufgabe.getRechnung().equals(rechnung)) {
                boolean isCorrect = aufgabe.checkAntwort(antwort);
                if (isCorrect) {
                    erreichtePunkte += aufgabe.getPunkte();
                }
                return isCorrect;
            }
        }
        return false;
    }

    /**
     * Diese Methode löscht eine Rechnung
     * @param rechnung die Rechnung die gelöscht werden soll
     */
    public void delete(String rechnung) {
        for (int i = 0; i < rechenaufgaben.length; i++) {
            if (rechenaufgaben[i] != null && rechenaufgaben[i].getRechnung().equals(rechnung)) {
                erreichbarePunkte -= rechenaufgaben[i].getPunkte();
                rechenaufgaben[i] = null;
                return;
            }
        }
    }

    /**
     * Diese Methode setzt einen Wert für die Toleranz
     * @param toleranz die toleranz
     */
    public void setMinimumToleranz(double toleranz) {
        for(Rechenaufgabe rechenaufgabe : rechenaufgaben ) {
            if(rechenaufgabe != null && rechenaufgabe.getToleranz() < toleranz) {
                rechenaufgabe.setToleranz(toleranz);
            }
        }
    }

    /**
     * Diese Methode gibt den Punktestand zurück
     * @return den String mit den Punkten
     */
    public String punktestand() {
        return "Erreichte Punkte: " + getErreichtePunkte() + " Erreichbare Punkte: " + getErreichbarePunkte() + "\n";
    }

    /**
     * Diese Methode gibt alle Informationen zur Rechnung aus
     * @return den String mit den Informationen
     */
    public String quizText() {
        String text = "Erreichte Punkte: " + this.erreichtePunkte + " Erreichbare Punkte: " + this.erreichbarePunkte + "\n ";
        for(int i = 0; i < this.rechenaufgaben.length; i++) {
            if(rechenaufgaben[i] == null) {
                continue;
            }
            if(i == 0) {
                text += this.rechenaufgaben[i].getRechnung() + " = " + this.rechenaufgaben[i].getAntwort();
            } else {
                text += "; " + this.rechenaufgaben[i].getRechnung() + " = " + this.rechenaufgaben[i].getAntwort();
            }
        }
        return text;
    }

    /**
     * Diese Methode vergleicht zwei Objekte
     * @param q1 das neue Objekt
     * @return Ob die gleich sind oder nicht
     */
    public boolean equals(Rechenquiz q1) {
        if (!(this.getErreichbarePunkte() == q1.getErreichbarePunkte() && this.getErreichtePunkte() == q1.getErreichtePunkte())) {
            return false;
        }
        for(int i = 0; i < this.rechenaufgaben.length; i++) {
            if (!(this.rechenaufgaben[i] == q1.rechenaufgaben[i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * Diese Methode kopiert ein Objekt
     * @return das geklonte Objekt
     */
    public Rechenquiz clone() {
        Rechenquiz cloneObj = new Rechenquiz(this.rechenaufgaben.length);
        cloneObj.rechenaufgaben = new Rechenaufgabe[this.rechenaufgaben.length];
        for(int i = 0; i < this.rechenaufgaben.length; i++) {
            cloneObj.rechenaufgaben[i] = this.rechenaufgaben[i].clone();
        }
        cloneObj.erreichbarePunkte = this.erreichbarePunkte;
        cloneObj.erreichtePunkte = this.erreichtePunkte;
        return cloneObj;
        }
}

