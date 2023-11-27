package UI.DrawControls;

import UI.DrawControls.LabelledSlider.LabelledSliderPanel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// This panel holds the five draw controls: RGB and size sliders, and the shape drop down list
public class DrawControlsPanel extends JPanel {
    // The fields in this mutable object are updated by the sliders and the drop down list
    private DrawControlsSettings settings;

    public DrawControlsPanel(DrawControlsSettings settings){
        setSize(600, 400);
        setBorder( new EmptyBorder(10, 10, 10, 10) ); // A nice margin
        setLayout(new GridLayout(5,1));

        // The RGB sliders
        LabelledSliderPanel spRed = new LabelledSliderPanel("Red", 0, 255, settings.redValue);
        LabelledSliderPanel spGreen = new LabelledSliderPanel("Green", 0, 255, settings.greenValue);
        LabelledSliderPanel spBlue = new LabelledSliderPanel("Blue", 0, 255, settings.blueValue);

        add(spRed);
        add(spGreen);
        add(spBlue);


        //	Select Circle, Square or Rectangle from a drop down list
        String[] shapes = {"Circle", "Square", "Rectangle"};
        JComboBox shapeList = new JComboBox(shapes);
        add(shapeList);
        shapeList.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                settings.shape=(String)shapeList.getSelectedItem();
            }
        });

        //	Have a slider that can set a shape length (This length can correspond to side length or radius)
        LabelledSliderPanel sizeSlider = new LabelledSliderPanel("Size", 0, 255, settings.sizeValue);

        add(sizeSlider);
    }
}
