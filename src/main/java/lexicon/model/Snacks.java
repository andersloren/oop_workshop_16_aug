package lexicon.model;

public class Snacks extends Product {

    private boolean salt;
    private boolean sweet;
    private boolean sour;


    public Snacks(int id, double price, String productName, boolean salt, boolean sweet, boolean sour) {
        super(id, price, productName);
        this.salt = salt;
        this.sweet = sweet;
        this.sour = sour;
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
