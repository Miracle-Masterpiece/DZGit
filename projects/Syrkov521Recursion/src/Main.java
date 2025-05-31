import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            System.out.print("Input: ");
            int count = fibonacci(in.hasNextInt() ? in.nextInt() : 0);
            System.out.println("Count: " + count);
        }
    }

    public static int fibonacci(int n) {
        return fibonacci(0, 1, 0, n);
    }

    //TODO: fibonacci sequence 0, 1, 1, 2, 3, 5, 8, 13
    private static int fibonacci(int current, int next, int depth, int limit) {
        if (current > limit)
            return depth;
        System.out.printf("%d ".trim(), current);
        return fibonacci(next, current + next, depth + 1, limit);
    }

//    public static int fibonacci(int max) {
//        int current     = 0;
//        int prev        = 1;
//        int result      = 0;
//        int iteration   = 0;
//        while (result < max) {
//            result  = current + prev;
//            prev    = current;
//            current = result;
//            System.out.println(result);
//            ++iteration;
//        }
//        return iteration;
//    }
}