package Chapter2;
// Exercise 2.28
import java.util.Scanner;
public class Exercise24 {
    // A program that calculate the Diameter, Circumference and area of a Circle
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r;
        double pi = 3.14159;
        int diameter;
        double circumference;
        double area;

        System.out.println("Enter the radius: ");
        r = input.nextInt();

        diameter = 2*r;
        System.out.printf("The Diameter of the circle is %d%n", diameter);

        circumference = 2 * 3.14159 * r;
        System.out.printf("The Circumference of the circle is %s%n", circumference);

        area = 3.14159 * r *r;
        System.out.printf("The Area of the circle is %s%n", area);






    }
}
