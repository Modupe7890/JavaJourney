package Chapter3;

public class Invoice {
    private String invoiceNumber;
    private String description;
    private int itemPurchased;
    private double itemPrice;
    public Invoice (String invoiceNumber, String description,int itemPurchased, double itemPrice){
        this.invoiceNumber=invoiceNumber;
        this.description=description;
        this.itemPurchased=itemPurchased;
        this.itemPrice=itemPrice;

        public void setInvoiceNumber(String invoiceNumber){
            this.invoiceNumber = invoiceNumber;
        }

        public String getInvoiceNumber() {
            return invoiceNumber;
        }

}
