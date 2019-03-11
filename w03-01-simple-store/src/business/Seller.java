package business;

public class Seller {

    String name;
    Store store;

    public Seller(String name, Store store) {
        this.name = name;
        this.store = store;
    }

    public void addProductToStore(String name, int price) {
        Product product = new Product(name, price);
        store.addProduct(product);
    }

}
