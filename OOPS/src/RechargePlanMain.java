public class RechargePlanMain {
    public static void main(String[] args) {

        RechargePlan p1 = new RechargePlan(101, "Basic Plan", 28, 199);

        RechargePlan p2 = new RechargePlan(p1);

        p1.displayPlanDetails();
        p2.displayPlanDetails();

        p2.price = 249;
        p2.validityDays = 30;

        p2.displayPlanDetails();
    }
}