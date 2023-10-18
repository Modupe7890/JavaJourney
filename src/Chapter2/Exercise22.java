package Chapter2;
// Exercise2.26
import java.util.Scanner;
public class Exercise22 {
    public static void main(String[] args) {
        // A program that accept 2 integers and determines the multiple
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Enter the first integer: ");
        number1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        number2 = input.nextInt();

        if (number1 % number2 == 0){
            System.out.println("The first number is a multiple of the second number");
        }
        if (number1 % number2 == 1){
            System.out.println("The first number is not a multiple of the second number");
        }
    }
}
