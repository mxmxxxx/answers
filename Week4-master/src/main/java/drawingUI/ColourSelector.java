package drawingUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// The jpanel containing a colour picker laumched from a button
public class ColourSelector extends JPanel {
    private Color currentColour=Color.BLUE; // Default colour
    public ColourSelector(){
        JButton colourButton=new JButton("Choose Colour");
        colourButton.setBackground(currentColour);
        colourButton.setForeground(getInverseCurrentColour());
        // We have to give the colour chooser dialog a parent reference - ie the jpanel in which it is launched
        // We cannot use 'this' as the colour chooser dialog parent when inside the anonymous class
        // as 'this' inside the anonymouse class would refer to the anonymous class object
        // and not the ColourSelector object - so we need to store the parent in a variable
        JPanel parent=this;
        colourButton.addActionListener(new ActionListener() {
            @Override
            // This event is fired when the button is pressed
            // it launches a colour chooser dialog initialized with the current colour
            public void actionPerformed(ActionEvent e) {
                 // Cannot use 'this' as the dialog parent when inside the anonymous class
                  currentColour = JColorChooser.showDialog(
                         parent,  // The parent panel for the dialog
                         "Choose Background Color",
                         currentColour);
                  // Set the button background to the new colour
                  colourButton.setBackground(currentColour);
                  // Set the text so that it is visible on the new background
                  colourButton.setForeground(getInverseCurrentColour());
            }
        });
        add(colourButton);
    }
    public Color getCurrentColour(){
        return currentColour;
    }
    private Color getInverseCurrentColour(){
        return new Color(255-currentColour.getRed(),255-currentColour.getGreen(), 255-currentColour.getBlue());
    }
}
