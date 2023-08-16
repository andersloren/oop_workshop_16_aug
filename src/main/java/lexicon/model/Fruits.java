package lexicon.model;

public class Fruits extends Product {

    private boolean organic;

    public Fruits(int id, double price, String productName, boolean organic) {
        super(id, price, productName);
        this.organic = organic;
    }

    @Override
    public String examine() { // should provide all the info
        return null;
    }

    @Override
    public String use() { // should provide summary of info for the customer
        return null;
    }
}
