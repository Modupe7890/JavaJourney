package Chapter3;
// Creating and manipulating an Account object
import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {
        // Create a scanner object to obtain input from the command window
        Scanner input = new Scanner (System.in);
        // create an Account and assign it to myAccount

        Account myAccount = new Account();
        // Display initial value of name (null)
        System.out.printf("Initial name is: %s%n", myAccount.getName());
        // prompt for and read me
        System.out.println("Please enter the name:");

        String theName = input.nextLine(); // read a line of text
        myAccount.setName(theName); // put theName in myAccount
        System.out.println(); // output a blank line

        // Displayed the name stored in object myAccount
        System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());


    }
}
