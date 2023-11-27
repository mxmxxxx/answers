package drawingUI;

import javax.swing.*;

// The jpanel containing the number of shapes of each type

public class ShapeInfoPanel extends JPanel {
    private JLabel numRectsText;
    private JLabel numCirclesText;
    private JLabel numSquaresText;
    public ShapeInfoPanel(){
        numRectsText=new JLabel();
        numCirclesText=new JLabel();
        numSquaresText=new JLabel();
        // Initialize labels to 0
        setNumShapes(0,0,0);
        add(numCirclesText);
        add(numRectsText);
        add(numSquaresText);
    }
    public void setNumShapes(int circles, int rects, int squares){
        numRectsText.setText("Number of Rectangles:"+rects);
        numCirclesText.setText("Number of Circles:"+circles);
        numSquaresText.setText("Number of Squares:"+squares);
    }
}
