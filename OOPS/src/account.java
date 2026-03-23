/*public class account {
    int accountnumber;
    String customername;
    double balance;

    void displayaccountinfo(){
        System.out.println("Acount number: "+accountnumber);
        System.out.println("cutomer number: "+customername);
        System.out.println("balance: "+balance);
 }

}*/

class Employee {

    private int employeeId;
    private String employeeName;
    private double basicSalary;
    private double allowance;
    private double taxPercentage;

    Employee(int id, String name, double salary, double allowance, double tax) {
        employeeId = id;
        setEmployeeName(name);
        setBasicSalary(salary);
        this.allowance = allowance;
        setTaxPercentage(tax);
    }

    int getEmployeeId() {
        return employeeId;
    }

    String getEmployeeName() {
        return employeeName;
    }

    void setEmployeeName(String name) {
        if (name != null && !name.isEmpty()) {
            employeeName = name;
        } else {
            System.out.println("Invalid name");
        }
    }

    double getBasicSalary() {
        return basicSalary;
    }

    void setBasicSalary(double salary) {
        if (salary >= 0) {
            basicSalary = salary;
        } else {
            System.out.println("Invalid salary");
        }
    }

    double getTaxPercentage() {
        return taxPercentage;
    }

    void setTaxPercentage(double tax) {
        if (tax >= 0 && tax <= 30) {
            taxPercentage = tax;
        } else {
            System.out.println("Invalid tax percentage");
        }
    }

    double calculateGrossSalary() {
        return basicSalary + allowance;
    }

    double calculateTaxAmount() {
        return calculateGrossSalary() * taxPercentage / 100;
    }

    double calculateNetSalary() {
        return calculateGrossSalary() - calculateTaxAmount();
    }

    void displaySalarySlip() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Tax: " + calculateTaxAmount());
        System.out.println("Net Salary: " + calculateNetSalary());
        System.out.println();
    }
}
