package shapes;

import java.awt.*;

public abstract class Shape implements Drawable{
    protected Point position;
    protected Color colour;
    public Shape(Point position, Color colour) {
        this.position = position;
        this.colour = colour;
    }

}
