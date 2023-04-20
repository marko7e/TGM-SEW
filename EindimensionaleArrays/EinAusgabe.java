package EindimensionaleArrays;
import javax.swing.*;

/**
 * Diess Programm fragt den Benutzer nach einer Eingabe und testet Methoden mit dem übergebenen Wert
 * @author Marko Ekmedzic
 * @version 2022-11-30
 */
public class EinAusgabe {
    /**
     * Ein- und Ausgaben
     * @param args Array von String
     */
    public static void main(String[] args) {
        int eingabe = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte eine Anzahl der Zahlen eingeben:"));
        int von = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte eine Zahl für den Mindestwert eingeben:"));
        int bis = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte eine Zahl für den Maximalwert eingeben:"));
        int[] array = ArrayMethoden.zufallsArray(eingabe);
        JOptionPane.showMessageDialog(null, ArrayMethoden.arrayToText(array));
        JOptionPane.showMessageDialog(null, ArrayMethoden.arrayToText(ArrayMethoden.fillArray(array, eingabe)));
        JOptionPane.showMessageDialog(null, ArrayMethoden.arrayToText(ArrayMethoden.fillZufallArray(array, von, bis)));
        JOptionPane.showMessageDialog(null, ArrayMethoden.arrayToText(ArrayMethoden.vertausche(array, von, eingabe-1)));
    }
}
