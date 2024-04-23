package Chapter7;
import java.util.Scanner;
public class AirlineReservations {

    static boolean[] planeSeats = new boolean[10];
    static Scanner input = new Scanner(System.in);

    public static void firstClassChoice(){
        for(int seatNumber = 0; seatNumber < planeSeats.length; seatNumber++){
            if (!planeSeats[seatNumber]) {
                System.out.println("Your seat Number is " +seatNumber + "\n First Class");
                planeSeats[seatNumber] = true;
                break;
            }
        }
    }
    public  static void economyChoice(){
        for(int seatNumber = 5; seatNumber < planeSeats.length; seatNumber++){
            if (!planeSeats[seatNumber]) {
                System.out.println("Your seat Number is " +seatNumber + "\n First Class");
                planeSeats[seatNumber] = true;
                break;
            }
        }
    }
    public static void alternativePlacementForFirstClass(){
        System.out.println("Do you mind being placed in the economy section?");
        System.out.println("Enter 1 for yes" + "\n2 for No");

        int userSecondChoice = input.nextInt();
        if(userSecondChoice == 1){
            System.out.println("Next flight leaves in 3hours ");
        } else if (userSecondChoice ==2){
            economyChoice();
        } else {
            System.out.println("Wrong Input");
        }
    }
    public static void alternativePlacementForEconomy(){
        System.out.println("Do you mind being placed in the First class section?");
        System.out.println("Enter 1 for yes" + "\n2 for No");

        int userSecondChoice = input.nextInt();
        if(userSecondChoice == 1){
            System.out.println("Next flight leaves in 3hours ");
        } else if (userSecondChoice ==2){
            firstClassChoice();
        } else {
            System.out.println("Wrong Input");
        }
    }
}
