package Chapter7b;

import java.util.Arrays;

public class ArrayList {
    public static void main(String[] args) {

        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
