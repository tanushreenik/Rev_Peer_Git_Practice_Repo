import java.util.Scanner;
public class electricitybill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        double bill = 0;

        if (units <= 100)
            bill = units * 5;

        else if (units <= 250)
            bill = (100 * 5) + (units - 100) * 8.5;

        else if (units <= 500)
            bill = (100 * 5) + (150 * 8.5) + (units - 250) * 12.5;

        else
            bill = (100 * 5) + (150 * 8.5) + (250 * 12.5) + (units - 500) * 15;

        System.out.println("Total Bill = ₹" + bill);
    }
}