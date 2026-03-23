class PremiumCustomer extends Customer {

    private String membershipLevel;
    private int rewardPoints;

    PremiumCustomer(int customerId, String customerName, String email,
                    String membershipLevel, int rewardPoints) {

        super(customerId, customerName, email);
        this.membershipLevel = membershipLevel;
        this.rewardPoints = rewardPoints;
    }

    void applyPremiumBenefits() {
        System.out.println("Free delivery and early access applied");
    }

    void displayPremiumCustomer() {
        displayCustomer();
        System.out.println("Membership Level: " + membershipLevel);
        System.out.println("Reward Points: " + rewardPoints);
    }
}