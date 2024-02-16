package Chapter6;
import java.util.Scanner;
public class ParkingCharges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalCharges = 0.0;

        System.out.println("Welcome to the parking Space!");
        System.out.println("Enter parking hours (or -1 to exit): ");
        double hoursParked = input.nextDouble();

        if (hoursParked == -1) {
            break;
        }
        double charge = calculateCharges(hoursParked);
        System.out.printf("Parking charge: $%.2f%n", charge);

        totalCharges += charge;
    }
    public static double calculateCharges(double hoursParked) {
        double minimumFee = 2.00;
        double hourlyRate = 0.50;
        double maximumDailyCharge = 10.00;
        int maximumHours = 3;
        int maximumHours = 3;
        int maximumHours = 3;
        int maximumHours = 3;
        int maximumHours = 3;
        int maximumHours = 3;
        int maximumHours = 3;
    }
}
