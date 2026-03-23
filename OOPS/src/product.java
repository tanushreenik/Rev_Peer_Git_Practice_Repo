class Product {

    private int productId;
    private String productName;
    private double price;
    private double discount;
    private int stock;

    Product(int id, String name, double price, double discount, int stock) {
        productId = id;
        setProductName(name);
        setPrice(price);
        setDiscount(discount);
        setStock(stock);
    }

    int getProductId() {
        return productId;
    }

    String getProductName() {
        return productName;
    }

    void setProductName(String name) {
        if (name != null && !name.isEmpty()) {
            productName = name;
        } else {
            System.out.println("Invalid name");
        }
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price");
        }
    }

    double getDiscount() {
        return discount;
    }

    void setDiscount(double discount) {
        if (discount >= 0 && discount <= 60) {
            this.discount = discount;
        } else {
            System.out.println("Invalid discount");
        }
    }

    int getStock() {
        return stock;
    }

    void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Invalid stock");
        }
    }

    double calculateDiscountAmount() {
        return price * discount / 100;
    }

    double calculateFinalPrice() {
        return price - calculateDiscountAmount();
    }

    void sellProduct(int qty) {
        if (qty <= stock) {
            stock = stock - qty;
            System.out.println("Product sold.Remaining stock: " + stock);
        } else {
            System.out.println("Not enough stock");
        }
    }

    void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + calculateFinalPrice());
        System.out.println("Stock: " + stock);
        System.out.println();
    }
}