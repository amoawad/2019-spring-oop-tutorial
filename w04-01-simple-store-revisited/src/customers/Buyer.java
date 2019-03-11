package customers;

import business.Product;

public class Buyer {

    String name;
    int balance;
    Product[] purchasedProducts;
    int productIndex;
    PaymentMethod paymentMethod;

    public Buyer(String name) {
        this.name = name;
        purchasedProducts = new Product[10];
        productIndex = 0;
        paymentMethod = new Cash(100);
    }

    public void buy(Product product) {
        purchasedProducts[productIndex++] = product;
    }

    public double checkout() {
        double amount = 0;

        for(Product product : purchasedProducts) {
            if(product != null) {
                amount += product.getPrice();
            }
        }

        return amount;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void pay(double amount) {
        paymentMethod.pay(amount);
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

}
