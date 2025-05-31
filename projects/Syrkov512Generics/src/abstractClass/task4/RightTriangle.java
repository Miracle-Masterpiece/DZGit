package abstractClass.task4;

public class RightTriangle extends Shape {

    private double legA;
    private double legB;

    public RightTriangle(double legA, double legB) {
        if (legA <= 0 || legB <= 0) {
            throw new IllegalArgumentException("Катеты должны быть положительными.");
        }
        this.legA = legA;
        this.legB = legB;
    }

    public double getHypotenuse() {
        return Math.sqrt(legA * legA + legB * legB);
    }

    @Override
    public double square() {
        return 0.5 * legA * legB;
    }

    @Override
    public String toString() {
        return "Площадь прямоугольного треугольника с катетами " + legA + " и " + legB + " = " + square();
    }
}