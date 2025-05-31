import java.util.Arrays;

public class Main {

    public static int[] merge(int[] a, int[] b) {
        int len1 = a != null ? a.length : 0;
        int len2 = b != null ? b.length : 0;
        int[] result = new int[len1 + len2];

        int aOff = 0;
        int bOff = 0;
        int rOff = 0;

        for ( ; rOff < result.length; ++rOff) {
            if (aOff < len1 && bOff < len2) {
                if (a[aOff] < b[bOff]) {
                    result[rOff] = a[aOff++];
                } else {
                    result[rOff] = b[bOff++];
                }
            } else if (aOff < len1) {
                result[rOff] = a[aOff++];
            } else if (bOff < len2) {
                result[rOff] = b[bOff++];
            }
        }

        return result;
    };

    public static void main(String[] args) {
        int[] arr = {-5,0,1,1,2,3,6,8,22,45,678};
        int[] arr2 = {-10,2,3,6,7,7,7,9,11,1000,1010,1100};
        int[] result = merge(arr, arr2);
        System.out.println(Arrays.toString(result));
        //_assert(Arrays.equals(new int[] { -10,-5,0,1,1,2,2,3,3,6,6,7,7,7,8,9,11,22,45,678,1000,1010,1100}, result));
    }

    private static void _assert(boolean expr) {
        if (!expr)
            throw new AssertionError();
    }
}