package Chapter3;

public class Invoice {
    private String invoiceNumber;
    private String description;
    private int itemPurchased;
    private double itemPrice;
    public Invoice (String invoiceNumber, String description,int itemPurchased, double itemPrice) {
        this.invoiceNumber = invoiceNumber;
        this.description = description;
        this.itemPurchased = itemPurchased;
        this.itemPrice = itemPrice;
    }

        public void setInvoiceNumber (String invoiceNumber){
            this.invoiceNumber = invoiceNumber;
        }
        public String getInvoiceNumber() {
            return invoiceNumber;
        }
        public void setDescription (String description){
            this.description = description;
        }
        public String getDescription() {
            return description;
        }
        public void setItemPurchased (int itemPurchased){
            this.itemPurchased = itemPurchased;
        }
        public int getItemPurchased() {
            return itemPurchased;
        }
        public void setItemPrice (double itemPrice){
            this.itemPrice = itemPrice;
        }
        public double getItemPrice(){
            return itemPrice;
        }
}
