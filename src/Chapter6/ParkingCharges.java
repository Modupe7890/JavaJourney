package Chapter6;
import java.util.Scanner;
public class ParkingCharges {

    public static double calculateCharges(int hours) {

        double charges  = 0.0;

        if((hours >= 1)&&(hours <=3)){
            charges = 2.0;
        }
        else if((hours >3)&&(hours < 19)) {
            charges = ((hours - 3) * 0.5)+ 2.0;
        }
        else if(hours > 19) {
            charges = 10.0;
        }

        return charges;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the parking Space!");
        System.out.println();


        int count;
        double totalCharges = 0;

        for(int d = 1; d <= count; d++) {
            System.out.println("Enter total number of hours used in the park: ");
            int hoursParked = input.nextInt();

            System.out.printf("Customer charge is: %.2f%n", calculateCharges(hoursParked));
            totalCharges += calculateCharges(hoursParked);
        }

        double charge = calculateCharges(totalCharges);
        System.out.printf("Parking charge: $%.2f%n", charge);

        totalCharges += charge;
        System.out.printf("%nRunning total of yesterday's receipts is: %.2f", calculculateCharge());
        System.out.printf("%nRunning total of yesterday's receipts is: %.2f", calculculateCharge());
        System.out.printf("%nRunning total of yesterday's receipts is: %.2f", calculculateCharge());
    }
}
