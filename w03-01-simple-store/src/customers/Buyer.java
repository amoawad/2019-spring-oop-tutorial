package customers;

import business.Product;

public class Buyer {

    String name;
    int balance;
    Product[] purchasedProducts
            ;
    int productIndex;

    public Buyer(String name) {
        this.name = name;
        purchasedProducts = new Product[10];
        productIndex = 0;
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
}
