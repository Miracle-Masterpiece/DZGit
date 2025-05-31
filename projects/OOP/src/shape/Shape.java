package shape;

import java.awt.*;

public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract double getArea();   //Абстрактный метод

    public void printInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return color != null ? color.toString() : "null";
    }
}
