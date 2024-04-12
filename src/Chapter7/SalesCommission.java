package Chapter7;
import java.util.Scanner;
public class SalesCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] salaryRange = new int[9];
        System.out.print("Enter the number of salespeople");
        int numberOfSalespeople = scanner.nextInt();

        double[] sales = new double[numberOfSalespeople];
        for(int i = 0; i < sales.length; i++){
            System.out.print("Enter gross sales for Salespeople" +(i + 1) + ": $" );
            sales[i] = scanner.nextDouble();
        }
    }

}
