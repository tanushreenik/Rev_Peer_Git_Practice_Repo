class customer {

    private int customerId;
    private String customerName;
    private String email;
    private String phoneNumber;
    private String address;

    customer() {
    }

    customer(int customerId, String customerName, String email, String phoneNumber, String address) {
        setCustomerId(customerId);
        this.customerName = customerName;
        setEmail(email);
        setPhoneNumber(phoneNumber);
        this.address = address;
    }

    int getCustomerId() {
        return customerId;
    }

    void setCustomerId(int customerId) {
        if (customerId > 0) {
            this.customerId = customerId;
        }
    }

    String getCustomerName() {
        return customerName;
    }

    void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    String getEmail() {
        return email;
    }

    void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        }
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 10) {
            this.phoneNumber = phoneNumber;
        }
    }

    String getAddress() {
        return address;
    }

    void setAddress(String address) {
        this.address = address;
    }

    void displayCustomer() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + customerName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println();
    }
}