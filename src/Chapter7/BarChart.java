package Chapter7;

public class BarChart {
    public static void main(String[] args) {
        int [] array = {0,0,0,0,0,0,1,2,4,2,1};

        System.out.println("Grade Distribution");

        for (int counter = 0; counter < array.length; counter++) {

            if (counter == 0) {
                System.out.printf("%5d: ", 100);
            } else
                System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);
        }
    }

}
