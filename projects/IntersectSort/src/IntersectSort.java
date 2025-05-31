import java.util.Arrays;
import java.util.Random;

public class IntersectSort {
    public static void main(String[] args) throws Throwable {
        final int ARRAY_LENGTH = 5;
        int[] arr = new int[ARRAY_LENGTH];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = new Random().nextInt(100);
        }

        System.out.println("No sorted: " + Arrays.toString(arr));
        intersectSort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));
    }

    public static void intersectSort(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int off = i;
            while (off > 0) {
                int current = arr[off];
                int prev    = arr[off-1];
                if (current < prev) {
                    arr[off]        = prev;
                    arr[off - 1]    = current;
                    --off;
                    continue;
                }
                break;
            }
        }
    }
}