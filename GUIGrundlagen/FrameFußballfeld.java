package GUIGrundlagen;

import javax.swing.*;
import java.awt.*;

public class FrameFußballfeld {

    public static void main(String[] args) {
        JFrame jf = new JFrame("Fußballfeld");
        GrafikFußballfeld f = new GrafikFußballfeld();
        f.setBackground(Color.GREEN);
        jf.add(f);

        int hoehe = 600;
        int breite = 800;
        jf.setSize(new Dimension(breite, hoehe));
        //jf.pack();

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

    }
}
