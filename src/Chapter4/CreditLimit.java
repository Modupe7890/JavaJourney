package Chapter4;

public class CreditLimit {
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
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getBeginingBalance() {
        return beginingBalance;
    }
    public void setBeginingBalance(int beginingBalance) {
        this.beginingBalance = beginingBalance;
    }
    public int getTotalItemsCharged() {
        return totalItemsCharged;
    }
    public void setTotalItemsCharged(int totalItemsCharged) {
        this.totalItemsCharged = totalItemsCharged;
    }
    public int getTotalCreditsApplied() {
        return totalCreditsApplied;


}
