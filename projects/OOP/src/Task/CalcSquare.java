package Task;

public class CalcSquare {

    public static int totalCallcs = 0;

    public static double calcRectangleSquare(double w, double h) {
        ++totalCallcs;
        return w * h;
    }

    public static double calcTriangleSquare(double base, double h) {
        ++totalCallcs;
        return (base * h) / 2;
    }

    public static double calcTriangleSquare(double a, double b, double c) {
        ++totalCallcs;
        double d = (a + b + c) / 2;
        return Math.sqrt(d * (d - a) * (d - b) * (d - c));
    }

    public static double calcRhombSquare(double aDiagonal, double bDiagonal) {
        ++totalCallcs;
        return (aDiagonal * bDiagonal) / 2;
    }

    public static void main(String[] args) {
        System.out.println("Rectangle w4 h7: " + calcRectangleSquare(4, 7));
        System.out.println("Triangle  b3 h2: " + calcTriangleSquare(3, 2));
        System.out.println("Triangle  a6 b10 c8: " + calcTriangleSquare(5, 10, 8));
        System.out.println("Rhomb  a5 b6: " + calcRhombSquare(5, 6));
        System.out.println("Total calls: " + totalCallcs);
    }
}
