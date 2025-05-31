package genericsClasses.task2;
import java.util.Scanner;

interface Add<T> {
    T add(T a, T b);
}

interface Mul<T> {
    T mul(T a, T b);
}

interface Sub<T> {
    T sub(T a, T b);
}

public class Matrix<T extends Number> {

    private final T[][] matrix;

    @SuppressWarnings("unchecked")
    public Matrix(int size) {
        matrix = (T[][]) new Number[size][size];
    }

    @SuppressWarnings("unchecked")
    public Matrix(int row, int col) {
        matrix = (T[][]) new Number[row][col];
    }

    public T get(int row, int col) {
        return matrix[row][col];
    }

    public void set(int row, int col, T value) {
        matrix[row][col] = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T[] row : matrix) {
            for (T v : row) {
                sb.append(v).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public double min() {
        double min = Double.MAX_VALUE;
        for (T[] row : matrix) {
            for (T v : row) {
                min = Math.min(min, v == null ? 0 : v.doubleValue());
            }
        }
        return min;
    }

    public double max() {
        double max = Double.MIN_NORMAL;
        for (T[] row : matrix) {
            for (T v : row) {
                max = Math.max(max, v == null ? 0 : v.doubleValue());
            }
        }
        return max;
    }

    public double avg() {
        double sum  = 0;
        int size    = 0;
        for (T[] row : matrix) {
            for (T v : row) {
                sum += v == null ? 0 : v.doubleValue();
                ++size;
            }
        }
        if (size == 0)
            return 0;
        return sum / size;
    }

    Matrix<T> add(Matrix<T> m, Add<T> func) {
        Matrix<T> result = new Matrix<>(matrix.length);
        int sz = matrix.length;
        for (int i = 0; i < sz; ++i) {
            for (int j = 0; j < sz; ++j) {
                result.set(i, j, func.add(get(i, j), m.get(i, j)));
            }
        }
        return result;
    }

    Matrix<T> sub(Matrix<T> m, Sub<T> func) {
        Matrix<T> result = new Matrix<>(matrix.length);
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                result.set(i, j, func.sub(get(i, j), m.get(i, j)));
            }
        }
        return result;
    }

    public Matrix<T> mul(Matrix<T> m, Mul<T> mulFunc, Add<T> addFunc) {
        int n = this.matrix.length;
        int mCols = m.matrix[0].length;
        int common = this.matrix[0].length;

        Matrix<T> result = new Matrix<>(n, mCols);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < mCols; j++) {
                T sum = mulFunc.mul(this.matrix[i][0], m.matrix[0][j]);
                for (int k = 1; k < common; k++) {
                    T product = mulFunc.mul(this.matrix[i][k], m.matrix[k][j]);
                    sum = addFunc.add(sum, product);
                }
                result.matrix[i][j] = sum;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)){
            System.out.print("Введите размерность матрицы: ");
            int dim = s.nextInt();
            Matrix<Float> mat4 = new Matrix<>(dim,dim);

            System.out.println("Заполните матрицу: ");
            for (int i = 0; i < dim; ++i) {
                for (int j = 0; j < dim; ++j) {
                    mat4.set(i, j, s.nextFloat());
                }
            }
            System.out.println(mat4);

            System.out.println("min: " + mat4.min());
            System.out.println("max: " + mat4.max());
            System.out.println("avg: " + mat4.avg());
        }

//        Matrix<Float> a = new Matrix<>(4, 4);
//        Matrix<Float> b = new Matrix<>(4, 4);
//        for (int i = 0; i < 4; ++i) {
//            for (int j = 0; j < 4; ++j) {
//                a.set(i, j, 1f);
//                b.set(i, j, 1f);
//            }
//        }
//
//        System.out.println(a.add(b, (aValue, bValue)-> aValue + bValue));



    }
}
