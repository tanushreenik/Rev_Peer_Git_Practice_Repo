class RechargePlan {

    int planId;
    String planName;
    int validityDays;
    double price;

    RechargePlan(int id, String name, int validity, double price) {
        this.planId = id;
        this.planName = name;
        this.validityDays = validity;
        this.price = price;
    }

    RechargePlan(RechargePlan p) {
        this.planId = p.planId;
        this.planName = p.planName;
        this.validityDays = p.validityDays;
        this.price = p.price;
    }

    void displayPlanDetails() {
        System.out.println("Plan ID: " + planId);
        System.out.println("Name: " + planName);
        System.out.println("Validity: " + validityDays);
        System.out.println("Price: " + price);
        System.out.println();
    }
}