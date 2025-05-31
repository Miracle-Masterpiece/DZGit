import java.util.Arrays;
import java.util.Random;

/**
 * Задача 5*: Найти сумму элементов двумерного массива
 * У вас есть двумерный массив чисел, например, матрица.
 * Ваша задача - написать программу, которая находит сумму всех элементов в этом массиве.
 */
public class Task5 {

    public static int sum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            int nestedLength = arr[i].length;
            for (int j = 0; j < nestedLength; ++j) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void fillMatrix(int[][] matrix) {
        Random rnd = new Random(346436);
        for (int i = 0; i < matrix.length; ++i) {
            int nestedLength = matrix[i].length;
            for (int j = 0; j < nestedLength; ++j) {
                matrix[i][j] = rnd.nextInt(10);
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        fillMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));
        int sum = sum(matrix);
        System.out.println("Сумма матрицы равна " + sum);
    }

}
