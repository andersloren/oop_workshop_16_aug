package lexicon.model;

public class Fruits extends Product {


    public Fruits(int id, int price, String productName) {
        super(id, price, productName);
    }

    @Override
    public String examine() { // should provide all the info
        return "All info";
    }

    @Override
    public String use() { // should provide summary of info for the customer
        return "Product name: " + getProductName() + ", Price is: " + getPrice();
    }
}
