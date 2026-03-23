public class ProductMain {
    public static void main(String[] args) {

        Product p = new Product(101, "Shoes", 2000, 10, 50);

        p.displayProductDetails();

        p.sellProduct(5);

        p.setDiscount(20);

        p.displayProductDetails();
    }
}
