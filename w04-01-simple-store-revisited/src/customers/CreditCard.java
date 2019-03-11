package customers;

public class CreditCard implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Connect to bank network");
        System.out.println("Check card is valid");
        System.out.println("Check card has enough balance");
        System.out.println("Paying: " + amount + " using credit card");
    }

}
