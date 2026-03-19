package CorporateAccessManagementSystem;

public class CorporateMain {
    public static void main(String[] args) {

        Manager m = new Manager(1, "Tanu", "IT", "EMP101", 5);

        m.displayPersonInfo();
        m.accessEmployeePortal();
        m.approveLeave();
        m.conductTeamMeeting();

        m.login();
        m.accessReports();
    }
}