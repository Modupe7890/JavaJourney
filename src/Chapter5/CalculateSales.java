package Chapter5;

public class CalculateSales {
    private double productNumber;
    private double quantitySold;

    public CalculateSales (double productNumber, double quantitySold){
        this.productNumber = productNumber;
        this.quantitySold = quantitySold;
    }

    public void setProductNumber(double productNumber) {
        this.productNumber = productNumber;
    }

    public double getProductNumber() {
        return productNumber;
    }

    public void setQuantitySold(double quantitySold) {
        this.quantitySold = quantitySold;
    }

    public double getQuantitySold() {
        return quantitySold;
    }
}
