package shape;

import java.awt.*;

public class Rectangle extends Shape {
    private final double sideA;
    private final double sideB;

    public Rectangle(Color color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRectangle{A=" + sideA + ", B=" + sideB + "}";
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
