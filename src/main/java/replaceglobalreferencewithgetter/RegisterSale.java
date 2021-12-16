package replaceglobalreferencewithgetter;

import java.util.ArrayList;
import java.util.List;

public class RegisterSale {
    private final List<Item> items = new ArrayList<>();

    public void addItem(Barcode code) {
        Item newItem = getInventory().itemForBarcode(code);
        items.add(newItem);
    }

    protected Inventory getInventory() {
        return Inventory.getInventory();
    }

    public List<Item> getItems() {
        return items;
    }
}
