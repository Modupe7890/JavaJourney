package Chapter5;
import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        int amount;
        int principal;
        double rate;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Amount: ");
        amount = input.nextInt();
        System.out.println("Enter the Principal amount: ");
        principal = input.nextInt();
        System.out.println("Enter the rate: ");
        rate = input.nextInt();

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for (int year = 1; year <= 10; ++year){
            amount = principal * Math.pow(1.0 + rate);

            System.out.printf("%4d%,20.2f%n", year, amount);

        }

    }
}
