package Chapter2;
import java.util.Scanner;
public class Exercise13 {
    // A program that compares two integers
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Enter the first Integer: ");
        number1= input.nextInt();
        System.out.print("Enter the second Integer: ");
        number2= input.nextInt();

            if (number1 == number2);
            System.out.printf("%d%n The number is equal" );

            if(number1 > number2);
            System.out.printf("%d%n number1 is greater than number2" );
    }
}
