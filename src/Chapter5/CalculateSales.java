package Chapter5;

public class CalculateSales {
    private int productNumber;
    private int quantitySold;
    private double product1 = 2.97;
    private double product2 = 4.50;
    private double product3 = 9.98;
    private double product4 = 4.49;
    private double product5 = 6.87;

    public CalculateSales (int productNumber, int quantitySold){
        this.productNumber = productNumber;
        this.quantitySold = quantitySold;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public double getProductNumber() {
        return productNumber;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }
    public double getQuantitySold() {
        return quantitySold;
    }
    public void calculateRetailAmount (){
        double totalSales = 0;
        int item1 = 0;
        int item2 = 0;
        int item3 = 0;
        int item4 = 0;
        int item5 = 0;
        System.out.printf("%s%n%s%n%n", "Enter product number and quantity sold for all items sold,",
                "Enter (0) to terminate input,");

    }
}
