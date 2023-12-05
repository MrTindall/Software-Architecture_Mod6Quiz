package discount;

public class CustomerOrder {

    private String customerName;
    private double billAmount;
    private DiscountStrategy discountStrategy;

    public CustomerOrder(String customerName, double billAmount, char discountType) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        setDiscountStrategy(discountType);
    }

    public double getBillAmount() {
        return discountStrategy.applyDiscount(billAmount);
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    private void setDiscountStrategy(char discountType) {
        switch (Character.toUpperCase(discountType)) {
            case 'S':
                discountStrategy = new SaleDiscount();
                break;
            case 'D':
                discountStrategy = new Discount();
                break;
            case 'L':
                discountStrategy = new LiquidationDiscount();
                break;
            default:
                discountStrategy = (billAmount) -> billAmount; // No discount
        }
    }
}
