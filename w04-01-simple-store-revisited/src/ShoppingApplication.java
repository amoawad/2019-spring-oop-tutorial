import business.Product;
import business.Seller;
import business.Store;
import customers.Buyer;
import customers.CreditCard;
import customers.PremiumBuyer;

public class ShoppingApplication {

    public static void main(String[] args) {

        Store carrefour = new Store();
        Seller mohamed = new Seller("Mohamed", carrefour);
        Buyer ahmed = new Buyer("Ahmed");
        PremiumBuyer salwa = new PremiumBuyer("Salwa");
        salwa.setPaymentMethod(new CreditCard());

        mohamed.addProductToStore("Gebna", 10);
        mohamed.addProductToStore("Zatoon", 5);
        mohamed.addProductToStore("Tissues", 6);

        Product[] availableProducts = carrefour.showProducts();

        ahmed.buy(availableProducts[0]);
        ahmed.buy(availableProducts[1]);
        ahmed.buy(availableProducts[2]);

        salwa.buy(availableProducts[0]);
        salwa.buy(availableProducts[1]);
        salwa.buy(availableProducts[2]);

        double ahmedInvoice = ahmed.checkout();
        double salwaInvoice = salwa.checkout();

        ahmed.pay(ahmedInvoice);
        salwa.pay(salwaInvoice);
    }

}
