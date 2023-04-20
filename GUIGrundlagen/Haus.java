package GUIGrundlagen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Haus extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Zeichne Haus
        g.setColor(Color.RED);
        g.fillRect(getWidth() / 2 - 100, getHeight() / 2, 200, 100);

        // Zeichne Dach
        g.setColor(Color.BLUE);
        int[] xPoints = { getWidth() / 2, getWidth() / 2 - 100, getWidth() / 2 + 100 };
        int[] yPoints = { getHeight() / 2 - 100, getHeight() / 2, getHeight() / 2 };
        g.fillPolygon(xPoints, yPoints, 3);

        // Zeichne Tür
        g.setColor(Color.YELLOW);
        g.fillRect(getWidth() / 2 - 20, getHeight() / 2 + 40, 30, 60);

        // Zeichne Fenster
        g.setColor(Color.WHITE);
        g.fillRect(getWidth() / 2 - 70, getHeight() / 2 + 20, 30, 30);
        g.fillRect(getWidth() / 2 + 40, getHeight() / 2 + 20, 30, 30);

        // Zeichne Baum
        g.setColor(new Color(59, 34, 5));
        g.fillRect(getWidth() / 2 - 200, getHeight() / 2 - 100, 50, 200);
        g.setColor(Color.GREEN);
        g.fillOval(getWidth() / 2 - 300, getHeight() / 2 - 200, 150, 150);
        g.fillOval(getWidth() / 2 - 200, getHeight() / 2 - 200, 150, 150);
        g.fillOval(getWidth() / 2 - 250, getHeight() / 2 - 250, 150, 150);
        g.fillOval(getWidth() / 2 - 250, getHeight() / 2 - 150, 150, 150);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("House with Garden");
        Haus h = new Haus();
        frame.add(h);

        // Setze die Größe des Fensters auf die Größe der Grafik plus einen Puffer von 50 Pixeln
        int width = 600;
        int height = 400;
        frame.setSize(new Dimension(width, height));
        frame.setPreferredSize(new Dimension(width, height));
        frame.pack();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
