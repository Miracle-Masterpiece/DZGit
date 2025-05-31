package shape;

import java.awt.*;

public class Circle extends Shape{

    private final double radius;

    public Circle(Color color, double diameter) {
        super(color);
        this.radius = diameter;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + getClass().getName() + "has radius: " + radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
