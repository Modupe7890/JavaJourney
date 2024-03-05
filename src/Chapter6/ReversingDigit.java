package Chapter6;
import java.util.Scanner;
public class ReversingDigit {
    public static int isReversing(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
              number /= 10;
        }
    }
}
