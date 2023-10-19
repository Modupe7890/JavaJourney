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

        if (number2 % number1 >=1){
            System.out.printf("The first number is a multiple of the second number %d%n", number2);
        }
        if (number2 % number1 !=1){
            System.out.printf("The first number is not a multiple of the second number %d%n", number2);
        }
    }
}
