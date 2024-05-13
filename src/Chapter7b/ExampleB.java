package Chapter7b;

import java.util.Arrays;

public class ExampleB {
    public static void main(String[] args) {

        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = 10 - i;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
