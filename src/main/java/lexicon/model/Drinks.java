package lexicon.model;

public class Drinks extends Product {

    private boolean alcohol;
    private boolean sugarFree;

    public Drinks(int id, double price, String productName, boolean alcohol, boolean sugarFree) {
        super(id, price, productName);
        this.alcohol = alcohol;
        this.sugarFree = sugarFree;
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
