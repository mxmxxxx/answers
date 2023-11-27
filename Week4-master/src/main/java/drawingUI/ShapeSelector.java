package drawingUI;

import javax.swing.*;
// The jpanel containing the radio buttons to select the shape
public class ShapeSelector extends JPanel{
    // The strings to be used for the radio buttons
    public static String CIRCLE="Circle";
    public static String RECTANGLE="Rectangle";
    public static String SQUARE="Square";

    private JRadioButton bCirc=new JRadioButton(CIRCLE);
    private JRadioButton bRect=new JRadioButton(RECTANGLE);
    private JRadioButton bSquare=new JRadioButton(SQUARE);
    ButtonGroup shapeGroup=new ButtonGroup();
    public ShapeSelector(){
        // Add each button to the button group so that only one radio button can be selected at any time
        shapeGroup.add(bCirc);
        shapeGroup.add(bRect);
        shapeGroup.add(bSquare);
        add(bCirc);
        add(bRect);
        add(bSquare);
        // Default to circle selected
        bCirc.setSelected(true);
    }

    public String getCurrentShape(){
        if (bCirc.isSelected()){
           return CIRCLE;
        }
        else if (bRect.isSelected()){
            return RECTANGLE;
        }
        else if (bSquare.isSelected()){
            return SQUARE;
        }
        else{
            return CIRCLE;// Default to Circle selected
        }
    }
}
