package FoodDeliveryApp;

public class FoodDeliveryAppMain {
    public static void main(String[] args) {

        Customer c = new Customer(1, "Tanu", "9876543210", "Punjab");
        DeliveryPartner d = new DeliveryPartner(2, "Rahul", "9123456789", "Bike");
        RestaurantOwner r = new RestaurantOwner(3, "Amit", "9988776655", "Food Hub");

        System.out.println("Customer:");
        c.login();
        c.placeOrder();
        c.viewOrderHistory();
        c.logout();

        System.out.println();

        System.out.println("Delivery Partner:");
        d.login();
        d.acceptDelivery();
        d.updateDeliveryStatus();
        d.logout();

        System.out.println();

        System.out.println("Restaurant Owner:");
        r.login();
        r.addMenuItem();
        r.updateOrderStatus();
        r.logout();
    }
}