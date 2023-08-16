package lexicon.data;

import lexicon.model.Product;

public class VendingMachineImpl {

    private Product[] products;
    private int depositPool;

    public VendingMachineImpl(Product[] products) {
        this.products = products;
    }
}
