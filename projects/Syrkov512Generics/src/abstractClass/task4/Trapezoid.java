package abstractClass.task4;

public class Trapezoid extends Shape {

    private double base1;
    private double base2;
    private double height;

    public Trapezoid(double base1, double base2, double height) {
        if (base1 <= 0 || base2 <= 0 || height <= 0)
            throw new IllegalArgumentException("Основания и высота должны быть положительными.");
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double square() {
        return 0.5 * (base1 + base2) * height;
    }

    @Override
    public String toString() {
        return "Площадь трапеции с нижним основанием " + base1 + ", верхним основанием " + base2 +  ", и высотой " + height + " = " + square();
    }
}
