package Chapter4;

public class CreditLimitTest {

    private int accountNumber;
    private int beginingBalance;
    private int totalItemsCharged;
    private int totalCreditsApplied;
    private int creditLimit;
    private int newBalance;
    public CreditLimit(int accountNumber, int beginingBalance, int totalItemsCharged, int totalCreditsApplied,
                       int creditLimit) {

        this.accountNumber = accountNumber;
        this.beginingBalance = beginingBalance;
        this.totalItemsCharged = totalItemsCharged;
        this.totalCreditsApplied = totalCreditsApplied;
        this.creditLimit = creditLimit;
    }
}