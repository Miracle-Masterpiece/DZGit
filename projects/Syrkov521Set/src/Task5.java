import java.util.Set;
import java.util.TreeSet;

/**
 * Создайте класс Product с полями name, price (double) и rating (int). Отсортируйте товары:
 * Сначала по цене (от дешевых к дорогим).
 * Если цена одинаковая – по рейтингу (от высокого к низкому).
 */
public class Task5 {

    public static void main(String[] args) {
        Set<Product> products = new TreeSet<>();
        products.add(new Product("Яблоки", 70, 1));
        products.add(new Product("Яблоки", 75, 0));
        products.add(new Product("Груши", 80, 0));
        products.add(new Product("Курица", 240, 0));
        products.add(new Product("Сахар", 80, 0));
        products.add(new Product("Сахар", 80, 1));
        products.add(new Product("Сахар", 80, 2));
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
