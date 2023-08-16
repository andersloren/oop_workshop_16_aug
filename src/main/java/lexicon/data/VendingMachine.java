package lexicon.data;

import lexicon.model.Product;

public interface VendingMachine {

    void addCurrency(double amount);

    int getBalance();

    Product request(Product id);

    int endSession();

    String getDescription(Product id);

    String[] getProducts();
}
