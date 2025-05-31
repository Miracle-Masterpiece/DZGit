public class DebuggingFactorial {
    public static void main(String[] args) {
        int n = 5;
        int result = computeFactorial(n);
        System.out.println(n + "! = " + result);
    }

    public static int computeFactorial(int n) {
        //было n == 2
        //слишком ранний выход из функции
        if (n == 1) {
            return 1;
        } else {
            return n * computeFactorial(n - 1);
        }
    }
}
