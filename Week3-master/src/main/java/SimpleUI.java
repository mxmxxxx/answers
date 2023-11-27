import UI.DrawControls.DrawControlsPanel;
import UI.DrawControls.DrawControlsSettings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleUI {
    static GraphicsConfiguration gc;
    public static void main(String[] args) {

        // Instantiate a DrawControlsSettings mutable object and pass it into the
        // constructors of the DrawControlsPanel and Drawing objects
        // DrawControlsPanel will change the settings fields when controls are adjusted
        // Drawing will read the settings fields when it draws the shape
        DrawControlsSettings settings=new DrawControlsSettings();
        DrawControlsPanel dcp=new DrawControlsPanel(settings);
        Drawing drawing=new Drawing(settings);

        // Create a JFrame and add the drawing canvas to it
        JFrame f=new JFrame();
        f.setLayout(null);
        f.setSize(800, 400);
        f.setLayout(new GridLayout(1, 2));

        // Add the controls panel and the drawing panel to the frame in a 2 column grid
        f.add(dcp);
        f.add(drawing);
        f.setVisible(true);

        // Add a window listener to end the program for when the window is closed
        f.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

    }
}
