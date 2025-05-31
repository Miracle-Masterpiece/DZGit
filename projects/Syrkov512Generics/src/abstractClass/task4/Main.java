package abstractClass.task4;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
               new Circle(45),
               new Rectangle(10, 20),
               new RightTriangle(5, 10),
               new Trapezoid(30, 20, 4),
               new Triangle(3, 4, 5)
        };

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }

    }
}
