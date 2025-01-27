import java.awt.*;

public abstract class Polygon {

    Point centerPoint;

    public Polygon(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public abstract void paint(Graphics g); // Abstract method for subclasses to implement
}


