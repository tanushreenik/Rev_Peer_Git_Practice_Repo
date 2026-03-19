package FoodDeliveryApp;

class DeliveryPartner extends AppUser {

    private String vehicleType;

    DeliveryPartner(int userId, String name, String phone, String vehicleType) {
        super(userId, name, phone);
        this.vehicleType = vehicleType;
    }

    void acceptDelivery() {
        System.out.println("Delivery accepted using " + vehicleType);
    }

    void updateDeliveryStatus() {
        System.out.println("Delivery status updated");
    }
}