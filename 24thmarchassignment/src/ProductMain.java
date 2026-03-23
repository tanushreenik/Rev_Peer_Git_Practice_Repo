import java.util.*;

class Product {
    int productId;
    String productName;
    String category;
    String brand;
    double price;
    int stock;
    double rating;
    double discountPercentage;
    boolean inStock;

    Product(int productId, String productName, String category, String brand,
            double price, int stock, double rating, double discountPercentage, boolean inStock) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.stock = stock;
        this.rating = rating;
        this.discountPercentage = discountPercentage;
        this.inStock = inStock;
    }

    public String toString() {
        return productName + " - ₹" + price;
    }
}

public class ProductMain {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "iPhone 15", "Electronics", "Apple", 80000, 5, 4.8, 10, true));
        products.add(new Product(2, "Samsung TV", "Electronics", "Samsung", 55000, 2, 4.5, 15, true));
        products.add(new Product(3, "Nike Shoes", "Fashion", "Nike", 7000, 10, 4.2, 20, true));
        products.add(new Product(4, "T-Shirt", "Fashion", "Puma", 1500, 0, 3.8, 5, false));
        products.add(new Product(5, "Rice Bag", "Grocery", "IndiaGate", 2500, 20, 4.0, 2, true));

        products.forEach(p -> System.out.println(p.productName));

        System.out.println();
        products.stream().filter(p -> p.price > 5000).forEach(System.out::println);

        System.out.println();
        products.stream().filter(p -> p.category.equals("Electronics")).forEach(System.out::println);

        System.out.println();
        products.stream().filter(p -> p.inStock).forEach(System.out::println);

        System.out.println();
        products.stream().sorted((a, b) -> Double.compare(a.price, b.price)).forEach(System.out::println);

        System.out.println();
        products.stream().sorted((a, b) -> Double.compare(b.price, a.price)).forEach(System.out::println);

        System.out.println();
        products.stream().sorted((a, b) -> Double.compare(b.rating, a.rating)).forEach(System.out::println);

        System.out.println();
        products.stream().sorted((a, b) -> a.productName.compareTo(b.productName)).forEach(System.out::println);

        System.out.println();
        System.out.println(products.stream().anyMatch(p -> p.price > 70000));

        System.out.println(products.stream().allMatch(p -> p.rating > 3.5));

        System.out.println(products.stream().noneMatch(p -> p.category.equals("Medical")));

        System.out.println();
        System.out.println(products.stream().max((a, b) -> Double.compare(a.price, b.price)).get());

        System.out.println(products.stream().min((a, b) -> Double.compare(a.price, b.price)).get());

        products.stream().filter(p -> p.category.equals("Electronics"))
                .forEach(p -> p.price = p.price * 1.05);

        products.stream().filter(p -> p.category.equals("Fashion"))
                .forEach(p -> p.discountPercentage += 10);

        products.stream().filter(p -> p.stock == 0)
                .forEach(p -> p.inStock = false);

        System.out.println();
        System.out.println(products.stream().filter(p -> p.category.equals("Fashion")).count());

        System.out.println(products.stream().filter(p -> p.rating > 4.5).count());

        System.out.println(products.stream().filter(p -> !p.inStock).count());
    }
}