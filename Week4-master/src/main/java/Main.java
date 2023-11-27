import drawingUI.DrawingUIController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        DrawingUIController dui=new DrawingUIController();

        JFrame f=new JFrame();
        f.setSize(1000, 400);
        f.setLayout(new GridLayout(1, 2));
        f.setVisible(true);
        f.add(dui.getMainPanel());

        f.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }
}
