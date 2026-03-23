package FoodDeliveryApp;

class RestaurantOwner extends AppUser {

    private String restaurantName;

    RestaurantOwner(int userId, String name, String phone, String restaurantName) {
        super(userId, name, phone);
        this.restaurantName = restaurantName;
    }

    void addMenuItem() {
        System.out.println("Menu item added in " + restaurantName);
    }

    void updateOrderStatus() {
        System.out.println("Order status updated in " + restaurantName);
    }
}
