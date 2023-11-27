package drawingUI;
import shapes.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawingUIController {
    Drawing drawing=new Drawing();
    JPanel controlsPanel=new JPanel();
    JPanel mainPanel=new JPanel();
    ShapeSelector sSel=new ShapeSelector();
    ColourSelector cSel=new ColourSelector();
    CircleDimsSelector circDims=new CircleDimsSelector();
    RectDimsSelector rectDims=new RectDimsSelector();
    SquareDimsSelector squareDims=new SquareDimsSelector();
    ShapeInfoPanel shapeInfoPanel=new ShapeInfoPanel();
    public DrawingUIController(){
        // mainPanel holds the controlsPanel and the drawing in a two column grid
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        mainPanel.setLayout(new GridLayout(1,2));
        // controlsPanel holds the shape selector, colour selector, and the shape dimension selectors and the info jpanels in a 2 column 3 row grid
        controlsPanel.setLayout(new GridLayout(3,2));
        controlsPanel.add(sSel);
        controlsPanel.add(cSel);
        controlsPanel.add(circDims);
        controlsPanel.add(rectDims);
        controlsPanel.add(squareDims);
        controlsPanel.add(shapeInfoPanel);
        mainPanel.add(controlsPanel);
        mainPanel.add(drawing);
        // Now add the mouse listener to the drawing 'canvas' so that a click triggers the adding of the currently selected shape
        addMouseListenerToDrawing();
    }
    private void addMouseListenerToDrawing(){
        drawing.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(sSel.getCurrentShape().equals(ShapeSelector.CIRCLE)){
                    drawing.addCircle(circDims.getRadius(),e.getPoint(), cSel.getCurrentColour());
                }
                else if(sSel.getCurrentShape().equals(ShapeSelector.RECTANGLE)){
                    drawing.addRect(rectDims.getRectWidth(), rectDims.getRectHeight(), e.getPoint(), cSel.getCurrentColour());
                }
                else if(sSel.getCurrentShape().equals(ShapeSelector.SQUARE)){
                    drawing.addSquare(squareDims.getSide(), e.getPoint(), cSel.getCurrentColour());
                }
                drawing.repaint();
                shapeInfoPanel.setNumShapes(drawing.getNumCircles(), drawing.getNumRects(), drawing.getNumSquares());
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }
    public JPanel getMainPanel(){
        return mainPanel;
    }

}
