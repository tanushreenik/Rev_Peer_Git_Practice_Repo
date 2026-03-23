public class customerMain {
    public static void main(String[] args) {

        customer c = new customer(1, "Tanu", "tanu@gmail.com", "9431546614", "Punjab");

        c.displayCustomer();

        c.setAddress("Delhi");
        c.setPhoneNumber("9123456789");

        c.displayCustomer();
    }
}