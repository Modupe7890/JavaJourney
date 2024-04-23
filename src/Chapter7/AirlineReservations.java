package Chapter7;
import java.util.Scanner;
public class AirlineReservations {

    static boolean[] planeSeats = new boolean[10];
    Scanner input = new Scanner(System.in);

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

    }
}
