package Chapter7;
import java.util.Scanner;
public class OneDimensionalArray {
    public static void main(String[] args) {

        // Initializing counts to zero
        int[] counts = new int[10];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
        }
        // Adding one to each of the 15elements
        int[] number = new int[15];
        for (int i = 0; i < number.length; i++) {
            number[i] = i + 1;
        }
        // five values of integer array bestScores
        int[] bestScores = {70, 75, 80, 85, 90};
        System.out.printf("%s: ", "bestScores");

        for (int i = 0; i < bestScores.length; i++) {
            System.out.printf("BestScores", +(i + 1) + ":", +bestScores[i]);
        }
    }
}
