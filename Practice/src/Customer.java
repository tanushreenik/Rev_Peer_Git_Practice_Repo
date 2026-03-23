class Customer {

    protected int customerId;
    protected String customerName;
    protected String email;

    Customer() {
    }

    Customer(int customerId, String customerName, String email) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
    }

    void registerCustomer() {
        System.out.println("Customer Registered");
    }

    void displayCustomer() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + customerName);
        System.out.println("Email: " + email);
    }
}