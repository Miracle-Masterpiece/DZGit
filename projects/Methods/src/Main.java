public class Main {

    public static void main(String[] args) {
        System.out.println(max(100, 20, 300, 4));
    }

    public static int fact(int v) {
        if (v == 0 || v == 1)
            return 1;
        return fact(v - 1 ) * v;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int max(int a, int b, int c, int d) {
        return Math.max(a,
                Math.max(b, Math.max(c, d))
        );
    }
}