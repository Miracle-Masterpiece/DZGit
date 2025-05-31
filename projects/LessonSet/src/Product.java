import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Сортировка товаров по цене и рейтингу
 * Условие:
 * Создайте класс Product с полями name, price (double) и rating (int). Отсортируйте товары:
 * Сначала по цене (от дешевых к дорогим).
 * Если цена одинаковая – по рейтингу (от высокого к низкому).
 */
public class Product implements Comparable<Product> {

    private String  name;
    private double  price;
    private int     rating;

    public Product(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public int compareTo(Product o) {
        int nameCmp = name.compareTo(o.name);
        if (nameCmp == 0) {
            int priceCmp = Double.compare(price, o.price);
            if (priceCmp == 0) {
                return Integer.compare(o.rating, rating);
            } else {
                return priceCmp;
            }
        } else {
            return nameCmp;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }

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
