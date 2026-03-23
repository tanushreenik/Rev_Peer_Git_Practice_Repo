import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        byte age = sc.nextByte();

        System.out.print("Enter experience in months: ");
        short experienceOfMonths = sc.nextShort();

        System.out.print("Enter employee ID: ");
        int employeeId = sc.nextInt();

        System.out.print("Enter mobile number: ");
        long mobileNumber = sc.nextLong();

        System.out.print("Enter working hours per day: ");
        float workingHoursPerDay = sc.nextFloat();

        System.out.print("Enter monthly salary: ");
        double monthlySalary = sc.nextDouble();

        System.out.print("Enter gender (M/F): ");
        char gender = sc.next().charAt(0);

        System.out.print("Is employee active (true/false): ");
        boolean isActiveEmployee = sc.nextBoolean();

        sc.nextLine();
        System.out.print("Enter employee name: ");
        String employeeName = sc.nextLine();

        System.out.print("Enter performance grade: ");
        char performanceGrade = sc.next().charAt(0);

        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employeeName);
        System.out.println("ID: " + employeeId);
        System.out.println("Age: " + age);
        System.out.println("Experience: " + experienceOfMonths + " months");
        System.out.println("Mobile: " + mobileNumber);
        System.out.println("Working Hours: " + workingHoursPerDay);
        System.out.println("Salary: " + monthlySalary);
        System.out.println("Gender: " + gender);
        System.out.println("Active Employee: " + isActiveEmployee);
        System.out.println("Performance Grade: " + performanceGrade);

        sc.close();
    }
}