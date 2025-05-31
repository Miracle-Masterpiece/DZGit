package abstractClass.task4;

public class Rectangle extends Shape {

    private double aSide;
    private double bSide;

    public Rectangle(double aSide, double bSide) {
        if (aSide <= 0 || bSide <= 0)
            throw new IllegalArgumentException("Стороны должны быть положительными!");
        this.aSide = aSide;
        this.bSide = bSide;
    }

    @Override
    public double square() {
        return aSide * bSide;
    }

    @Override
    public String toString() {
        return "Площадь прямоугольника " + aSide + " и " + bSide + " = " + square();
    }
}
