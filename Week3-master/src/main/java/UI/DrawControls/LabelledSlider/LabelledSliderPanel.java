package UI.DrawControls.LabelledSlider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

// This is a panel that has a label, a slider and changes the int value in a mutable object
public class LabelledSliderPanel extends JPanel {
    private JLabel label;
    private JSlider slider;
    private SliderValue sliderValue;
    public LabelledSliderPanel(String labelText, int min, int max, SliderValue sliderValue) {
        label = new JLabel(labelText);
        slider = new JSlider(JSlider.HORIZONTAL, min, max, sliderValue.getValue());
        // Initialize the sliderValue field
        this.sliderValue=sliderValue;
        // A nixe BorderLayout
        setLayout(new BorderLayout());
        add(label, BorderLayout.NORTH);
        add(slider, BorderLayout.CENTER);
        ChangeListener sliderListener=new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                // When the value of the slider is changed, it updates the mutable object passed in
                sliderValue.setValue(slider.getValue());
            }
        };
        slider.addChangeListener(sliderListener);
    }
}
