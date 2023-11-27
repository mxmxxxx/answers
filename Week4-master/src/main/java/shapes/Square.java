package shapes;

import java.awt.*;
public class Square extends Rect {
    // Package-private constructor
    Square(int width, Point position, Color colour) {
        // Call the Rect constructor - width and height are the same
        super(width, width, position, colour);
    }
}
