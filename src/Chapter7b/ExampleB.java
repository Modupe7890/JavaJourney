package Chapter7b;

import java.util.Arrays;

public class ExampleB {
    public static void main(String[] args) {
    //10-element array with numbers from 10 to 1
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = 10 - i;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers));
    }
}
