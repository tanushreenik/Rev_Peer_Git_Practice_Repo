public class customermain {
    public static void main(String[] args) {

        PremiumCustomer p = new PremiumCustomer(
                101, "Tanu", "tanu@gmail.com", "Gold", 500
        );

        p.registerCustomer();
        p.applyPremiumBenefits();
        p.displayPremiumCustomer();
    }
}