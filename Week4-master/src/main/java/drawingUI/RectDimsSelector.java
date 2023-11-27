package drawingUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
// The jpanel containing the sliders to set the width and height of a rectangle
public class RectDimsSelector extends JPanel {
    private int width=30;
    private int height=50;
    public RectDimsSelector() {
        JLabel rectTextWidth=new JLabel("Rectangle width");
        JSlider widthSlider=new JSlider(0, 100, width);
        JLabel rectTextHeight=new JLabel("Rectangle height");
        JSlider heightSlider=new JSlider(0, 100, height);
        widthSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
              width = widthSlider.getValue();
            }
        });
        heightSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                height = heightSlider.getValue();
            }
        });
        add(rectTextWidth);
        add(widthSlider);
        // Add a border so that the slider is not right up against the edge of the panel
        widthSlider.setBorder(new EmptyBorder(10, 10, 10, 10));
        add(rectTextHeight);
        add(heightSlider);
        // Add a border so that the slider is not right up against the edge of the panel
        heightSlider.setBorder(new EmptyBorder(10, 10, 10, 10));
    }
    // Careful here not to use getWidth and getHeight as they are already defined in JPanel
    public int getRectWidth(){
        return width;
    }
    public int getRectHeight(){
        return height;
    }
}
