package customers;

public class Cash implements PaymentMethod {

    int balance;

    public Cash(int balance) {
        this.balance = balance;
    }

    @Override
    public void pay(double amount) {
        if(balance >= amount) {
            System.out.println("Paying: " + amount + " using cash");
            balance -= amount;
        }

    }

}
