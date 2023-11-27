package drawingUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
// The jpanel containing the slider to set the radius of the circle

public class CircleDimsSelector extends JPanel {
    private int radius=30;
    public CircleDimsSelector(){
        JLabel radiusText=new JLabel("Circle radius");
        JSlider radiusSlider=new JSlider(0, 100, radius);
        radiusSlider.addChangeListener(e -> {
            radius=radiusSlider.getValue();
        });
        radiusSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                radius=radiusSlider.getValue();
            }
        });
        add(radiusText);
        add(radiusSlider);
        // Add a border so that the slider is not right up against the edge of the panel
        radiusSlider.setBorder(new EmptyBorder(10, 10, 10, 10));
    }
    public int getRadius(){
        return radius;
    }
}
