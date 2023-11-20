package Chapter4;
import java.util.Scanner;
public class IdentifyErrorX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 1, total = 0;
        while (x <= 10) {
            total += x;
            ++x;
        }
    }
}
