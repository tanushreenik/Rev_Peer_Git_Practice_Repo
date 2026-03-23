package FoodDeliveryApp;

class AppUser {

    protected int userId;
    protected String name;
    protected String phone;

    AppUser(int userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }

    void login() {
        System.out.println(name + " logged in");
    }

    void logout() {
        System.out.println(name + " logged out");
    }
}