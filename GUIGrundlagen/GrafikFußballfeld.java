package GUIGrundlagen;

import java.awt.*;
import javax.swing.*;

/**
 * Erstelle ein GUI-Fenster mit einer selbst gewählte Grafik. Diese Grafik soll in einer eigenen JPanel-Klasse
 * erstellt werden und mithilfe der draw- und fill-Methoden der Klasse java.awt.Graphics gezeichnet werden
 * (z.B. ein Haus mit Garten, ein Auto, ...). Die Grafik soll mindesten 5 unterschiedliche Grafikarten (Rechteck, Oval, ...)
 * enthalten, davon zumindest ein Polygon (Methode draw bzw. fillPolygon(Polygon p)) und ein Kreisbogen
 * (Methode draw bzw. fillArc(int x, int y, int width, int height, int startAngle, int arcAngle)).
 * Die Grafik soll weiters mindestens 10 Zeichnungselemente enthalten und aus zumindest 4 unterschiedliche Farben bestehen.
 * Mindestens eines dieser Zeichenelemente soll dynamisch platziert sein, d.h. sich an die Größe des Fensters anpassen
 * oder immer zentriert gezeichnet werden.
 *
 */
public class GrafikFußballfeld extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Zeichne Fußballfeldmuster
        g.setColor(Color.WHITE);
        g.fillRect(getWidth() / 2, 0, 7, getHeight());
        g.fillOval(getWidth() / 2 - 23, getHeight() / 2 - 25, 50, 50);
        g.setColor(Color.GREEN);
        g.fillOval(getWidth() / 2 - 18, getHeight() / 2 - 20, 40,40);

        //Strafraum
        //Lila punkt vorm strafraum
        g.setColor(new Color(150, 70, 201));
        g.fillOval(getWidth() / 6, getHeight() / 2 - 25, 50, 50);
        //grüner punkt zum ausfüllen
        g.setColor(Color.GREEN);
        g.fillOval(getWidth() / 6 + 5, getHeight() / 2 - 20 , 40, 40);
        //lilane linie beim strafraumbeginn
        g.setColor(new Color(150, 70, 201));
        g.fillRect(getWidth() / 6 + 20, getHeight() / 2 - 125 ,10 ,250);

        //lilane linie oben
        g.fillRect(0, getHeight() / 2 - 125, getWidth() / 6 + 30, 5);
        //lilane linie unten
        g.fillRect(0, getHeight() / 2 + 125, getWidth() / 6 + 30, 5);
        //grüner feld zum abdecken der linien
        g.setColor(Color.GREEN);
        g.fillRect(0, getHeight() / 2 - 120, getWidth() / 6 + 25, 245);
        //elfmeterpunkt
        g.setColor(new Color(150, 70, 201));
        g.fillOval(getWidth() / 7, getHeight() / 2, 5, 5);
        //innerer strafraum
        g.setColor(new Color(150, 70, 201));
        g.fillRect(0, getHeight() / 2 - 50, getWidth() / 10 , 100);
        //innerer strafraum abdeckung für linie
        g.setColor(Color.GREEN);
        g.fillRect(0, getHeight() / 2 - 45, getWidth() / 10 - 5, 90);
        //tor
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, getHeight() / 2 - 20, 10, 40 );

    }
}
