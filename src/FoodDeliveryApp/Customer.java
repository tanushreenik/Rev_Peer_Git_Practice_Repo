package FoodDeliveryApp;

class Customer extends AppUser {

    private String deliveryAddress;

    Customer(int userId, String name, String phone, String deliveryAddress) {
        super(userId, name, phone);
        this.deliveryAddress = deliveryAddress;
    }

    void placeOrder() {
        System.out.println("Order placed to: " + deliveryAddress);
    }

    void viewOrderHistory() {
        System.out.println("Viewing order history");
    }
}