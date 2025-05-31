package abstractClass.task4;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double square() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Площадь круга с радиусом " + radius + " == " + square();
    }
}
