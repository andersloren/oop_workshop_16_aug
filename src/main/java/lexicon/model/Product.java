package lexicon.model;

public abstract class Product {

    // ******
    // Fields
    // ******

    private int id;
    private double price;
    private String productName;

    // **************
    // Constructor(s)
    // **************

    public Product(int id, double price, String productName) {
        this.id = id;
        this.price = price;
        this.productName = productName;
    }

    // *******
    // Methods
    // *******

    public abstract String examine();
    public abstract String use();

    // *****************
    // Getters & Setters
    // *****************


    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }
}
