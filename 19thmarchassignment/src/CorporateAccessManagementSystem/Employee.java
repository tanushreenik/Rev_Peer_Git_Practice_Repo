package CorporateAccessManagementSystem;

class Employee extends Person {

    String department;
    String employeeCode;

    Employee(int personId, String name, String department, String employeeCode) {
        super(personId, name);
        this.department = department;
        this.employeeCode = employeeCode;
    }

    void accessEmployeePortal() {
        System.out.println("Accessing Employee Portal");
    }
}