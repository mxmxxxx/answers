package shapes;

import java.awt.*;

public abstract class Shape {
    protected Point position;
    protected Color colour;

    // Package-private constructor
    Shape(Point position, Color colour) {
        this.position = position;
        this.colour = colour;
    }
    abstract void draw(Graphics g);
}
