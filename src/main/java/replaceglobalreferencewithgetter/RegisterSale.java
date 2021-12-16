package replaceglobalreferencewithgetter;

import java.util.ArrayList;
import java.util.List;

public class RegisterSale {
    private final List<Item> items = new ArrayList<>();

    public void addItem(Barcode code) {
        Item newItem = Inventory.getInventory().itemForBarcode(code);
        items.add(newItem);
    }

    public List<Item> getItems() {
        return items;
    }
}
