public class DebuggingExample {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        //было for (int i = 0; i <= numbers.length; i++)
        //ошибка заключалась в том, что была попытка доступа за пределы массива
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Сумма чисел: " + sum);
    }
}
