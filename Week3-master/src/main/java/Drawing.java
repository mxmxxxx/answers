import UI.DrawControls.DrawControlsSettings;
import shapes.Circle;
import shapes.Rect;
import shapes.Square;
import shapes.Shape;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Drawing extends Canvas {
    // Declare the shapes - they can all be private as nothing else needs to access them
    private ArrayList<Shape> shapes=new ArrayList<Shape>();
    private DrawControlsSettings settings;
    public Drawing(DrawControlsSettings settings) {
        // The settings object fields will be changed by the UI - it is mutable
        this.settings=settings;

        setSize(400, 200);
        setBackground(Color.white);
        // Create three default initial shapes for demonstration
        shapes.add((Shape)new Circle(50, new Point(100, 100), Color.red));
        shapes.add((Shape)new Square(50, new Point(200, 100), Color.blue));
        shapes.add((Shape)new Rect(50, 100, new Point(300, 100), Color.green));

        // Set the mouse listener to process clicks when we want to draw a new shape
        setMouseListener(settings);

    }

    // This sets up the mouse listener that will add a new shape to the list when the user clicks
    private void setMouseListener(DrawControlsSettings settings) {
        addMouseListener(new MouseListener(){
            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseClicked(MouseEvent e) {
                // Get the mouse position
                Point p=e.getPoint();
                // Create a new shape based on the settings
                Color col=new Color(settings.redValue.getValue(), settings.greenValue.getValue(), settings.blueValue.getValue());
                int size= settings.sizeValue.getValue();
                Shape s=null;
                switch(settings.shape){
                    case "Circle":
                        s=new Circle(settings.sizeValue.getValue(), p, col);
                        break;
                    case "Square":
                        s=new Square(settings.sizeValue.getValue(), p, col);
                        break;
                    case "Rectangle":
                        s=new Rect(settings.sizeValue.getValue(), settings.sizeValue.getValue(), p, col);
                        break;
                }

                // Add the shape to the list
                shapes.add(s);
                // Repaint the canvas
                repaint();
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

    public void paint(Graphics g) {
        // Draw the shapes
        for(Shape s:shapes)
            s.draw(g);
    }

}
