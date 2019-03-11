import business.Product;
import business.Seller;
import business.Store;
import customers.Buyer;

public class ShoppingApplication {

    public static void main(String[] args) {

        Store carrefour = new Store();
        Seller mohamed = new Seller("Mohamed", carrefour);
        Buyer ahmed = new Buyer("Ahmed");

        mohamed.addProductToStore("Gebna", 10);
        mohamed.addProductToStore("Zatoon", 5);
        mohamed.addProductToStore("Tissues", 6);

        Product[] availableProducts = carrefour.showProducts();

        ahmed.buy(availableProducts[0]);
        ahmed.buy(availableProducts[1]);
        ahmed.buy(availableProducts[2]);

        double amount = ahmed.checkout();

        System.out.println(ahmed.getName() + " should pay: " + amount);
    }

}
