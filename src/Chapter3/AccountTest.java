package Chapter3;
import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.0);
        Account account2 = new Account("John Blue", -7.35);

        System.out.printf("%s balance: %n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %n",
                account2.getName(), account2.getBalance());

        Scanner input = new Scanner (System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%s adding  to account1 balance %s%n",
                depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s balance: %n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %n",
                account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%n adding  to account2 balance %s%n",
                depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("%s balance: %n",
                account1.getName(), account1.getBalance());
        System.out.printf("%d balance: %n",
                account2.getName(), account2.getBalance());

    }
}
