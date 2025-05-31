import java.util.Scanner;

public class Main {

    public static void goTo(int x, int y, Robot robot) {

        if (x > robot.getX()) {
            robot.turnRight();
            for (int xSteps = robot.getX(); xSteps < x; ++xSteps)
                robot.stepForward();
        }

        if (x < robot.getX()) {
            robot.turnLeft();
            int oldX = robot.getX();
            for (int xSteps = x; xSteps < oldX; ++xSteps)
                robot.stepForward();
        }

        if (y > robot.getY()) {
            robot.turnUp();
            for (int ySteps = robot.getY(); ySteps < y; ++ySteps)
                robot.stepForward();
        }

        if (y < robot.getY()) {
            robot.turnDown();
            int oldY = robot.getY();
            for (int ySteps = y; ySteps < oldY; ++ySteps)
                robot.stepForward();
        }
    }

    public static void main(String[] args) {
        Robot robot = new Robot();
        System.out.println(robot);
        goTo(10, -4, robot);
        System.out.println(robot);
    }

//    public static void main0(String[] args) {
//        Robot robot = new Robot();
//
//        final char ROBOT = '#';
//        final char FIELD = '0';
//        final int X_SIZE = 8;
//        final int Y_SIZE = 8;
//
//        Scanner scanner = new Scanner(System.in);
//        String input = null;
//
//        System.out.println("==============Чтобы ходить, вводите символы \'wasd\'==============");
//        System.out.println("Чтобы повернуть налево, введите \'a\'");
//        System.out.println("Чтобы повернуть направо, введите \'d\'");
//        System.out.println("Чтобы повернуть вверх, введите \'w\'");
//        System.out.println("Чтобы повернуть вниз, введите \'s\'\n\n\n");
//
//        do {
//
//            for (int y = 0; y < Y_SIZE; ++y) {
//                for (int x = 0; x < X_SIZE; ++x) {
//                    if (robot.getX() == x && robot.getY() == y) {
//                        System.out.print(ROBOT + " ");
//                    } else {
//                        System.out.print(FIELD + " ");
//                    }
//                }
//                System.out.println();
//            }
//
//            input = scanner.next().toLowerCase();
//            if (input.equals("s")) {
//                robot.turnUp();
//            } else if (input.equals("w")) {
//                robot.turnDown();
//            } else if (input.equals("a")) {
//                robot.turnLeft();
//            } else if (input.equals("d")) {
//                robot.turnRight();
//            }
//
//            if (!input.equals("stop")) {
//                robot.stepForward();
//                if (robot.getX() < 0 || robot.getY() < 0 || robot.getX() >= X_SIZE || robot.getY() >= Y_SIZE) {
//                    throw new IllegalStateException("Robots coord must be inside field!");
//                }
//            }
//
//        } while (!input.equals("stop"));
//
//    }
}