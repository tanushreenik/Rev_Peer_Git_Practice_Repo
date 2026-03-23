package CorporateAccessManagementSystem;

class Manager extends Employee implements Authenticatable, ReportAccessible {

    int teamSize;

    Manager(int personId, String name, String department, String employeeCode, int teamSize) {
        super(personId, name, department, employeeCode);
        this.teamSize = teamSize;
    }

    void approveLeave() {
        System.out.println("Leave Approved");
    }

    void conductTeamMeeting() {
        System.out.println("Team Meeting Conducted");
    }

    public void login() {
        System.out.println("Manager Logged In");
    }

    public void accessReports() {
        System.out.println("Accessing Reports");
    }
}