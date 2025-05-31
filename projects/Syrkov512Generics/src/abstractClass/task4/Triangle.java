package abstractClass.task4;

public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if (!isValidTriangle(a, b, c))
            throw new IllegalArgumentException("Треугольник с такими сторонами не существует.");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    @Override
    public double square() {
        double s = (a + b + c) * 0.5;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String toString() {
        return "Площадь треугольника со сторонами " + a + " и " + b + ", и " + c + " = " + square();
    }
}

