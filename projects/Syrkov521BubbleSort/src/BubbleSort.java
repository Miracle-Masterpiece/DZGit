import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[100];
        {
            for (int i = 0; i < array.length; ++i)
                array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Before sorting " + Arrays.toString(array));
        long lastTime = System.nanoTime();
        bubleSort(array);
        long now = System.nanoTime();
        System.out.println("After sorting " + Arrays.toString(array));
        System.out.println("ns " + (now - lastTime));
    }

    public static void bubleSort(int[] arr) {
        while (true) {
            boolean sorted = false;
            for (int i = 0; i < arr.length - 1; ++i) {
                int current = arr[i];
                int next    = arr[i + 1];
                if (current > next) {
                    sorted = true;
                    arr[i]      = next;
                    arr[i + 1]  = current;
                }
            }
            if (!sorted)
                break;
        }
    }
}