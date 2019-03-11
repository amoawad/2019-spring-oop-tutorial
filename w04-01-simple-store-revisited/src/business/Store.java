package business;

public class Store {

    String name;
    Product[] products;
    private int productIndex;

    public Store() {
        products = new Product[100];
        productIndex = 0;
    }

    public Product[] showProducts() {
        return products;
    }

    void addProduct(Product product) {
        products[productIndex++] = product;
    }
}
