package customers;

public class PremiumBuyer extends Buyer {

    public PremiumBuyer(String name) {
        super(name);
    }

    public double checkout() {
        double originalPrice = super.checkout();
        double discountedRate = getDiscountedRate(originalPrice);
        return discountedRate;
    }


    private double getDiscountedRate(double amount) {
        return amount / 1.2;
    }

}
