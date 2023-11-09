
package Chapter3;
import java.util.Scanner;
public class HeartRateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Patient's First Name Here: ");
        String firstName = input.nextLine();
        System.out.println("Enter Patient's Last Name Here: ");
        String lastName = input.next();

        System.out.println("Enter the Patient's month of Birth: ");
        int month = input.nextInt();
        System.out.println("Enter the Patient's day of Birth: ");
        int day = input.nextInt();
        System.out.println("Enter the Patient's Year of birth" );
        int year = input.nextInt();

        String dateOfBirth = month + "/" + day + "/" + year;
        System.out.printf("Patient's Date of Birth is %s%n", dateOfBirth);

        int calculateAge = 2023 - year;
        System.out.printf("Patient's Age is %d%n",calculateAge);

        int maxHeartRate = 220 - calculateAge;
        double targetHeartRate = maxHeartRate * 0.5;

        System.out.printf("Patient's Names: " +firstName +lastName, "Patient's DOB " +dateOfBirth,
                "Patient's Age " +calculateAge, "Heart Range is " +targetHeartRate);




    }
}
