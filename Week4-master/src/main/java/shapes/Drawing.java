package shapes;

import java.awt.*;

public class Drawing extends Canvas {
    // Create a shape database to store the shapes that have been added to the drawing by clicking the mouse
    private ShapeDB shapes=new ShapeDB();

    public Drawing() {
        setSize(400, 200);
        setBackground(Color.white);
    }

    public void addCircle(int radius, Point position, Color colour) {
        shapes.addCircle(radius, position, colour);
    }
    public void addRect(int width,int height, Point position, Color colour) {
        shapes.addRect(width, height, position, colour);
    }
    public void addSquare(int width, Point position, Color colour) {
        shapes.addSquare(width, position, colour);
    }

    // Inherited from Canvas - called by Windows when the canvas needs to be redrawn
    @Override
    public void paint(Graphics g) {
        // Called by windows when the drawing is to be drawn - ask the shapeDB to Draw the shapes
        shapes.drawShapes(g);
    }
    public int getNumCircles(){
        return shapes.countClasses(Circle.class);
    }
    public int getNumRects(){
        return shapes.countClasses(Rect.class);
    }
    public int getNumSquares(){
        return shapes.countClasses(Square.class);
    }


}
