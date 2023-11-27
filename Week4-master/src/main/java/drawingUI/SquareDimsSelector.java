package drawingUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
// The jpanel containing the slider to set the side length of a square
public class SquareDimsSelector extends JPanel {
    private int side=30;
    public SquareDimsSelector() {
        JLabel squareTextSide=new JLabel("Square side");
        JSlider sideSlider=new JSlider(0, 100, side);

        sideSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                side = sideSlider.getValue();
            }
        });

        add(squareTextSide);
        add(sideSlider);
        // Add a border so that the slider is not right up against the edge of the panel
        sideSlider.setBorder(new EmptyBorder(10, 10, 10, 10));
    }
    public int getSide(){
        return side;
    }

}
