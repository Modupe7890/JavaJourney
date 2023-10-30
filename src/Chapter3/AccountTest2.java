package Chapter3;
//Fig 3.6: AccountTest2.Java
// Using Account constructor to initialize the name instance
// variable at the time each Account object is created
public class AccountTest2 {
    public static void main (String[] args){
    // Create two Account object
    Account account1 = new Account ("Jane Green");
    Account account2= new Account ("John Blue");

    // Display initial value of name for each Account
        System.out.printf("account name is: %s%n", account1.getName());
        System.out.printf("account name is: %s%n", account2.getName());
    }
}

