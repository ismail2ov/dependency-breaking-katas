package replaceglobalreferencewithgetter;

public class Inventory {
    private static Inventory instance;

    public static Inventory getInstance() {
        if (instance == null) {
            instance = new Inventory();
        }
        return instance;
    }

    public static Inventory getInventory() {
        return instance;
    }

    public Item itemForBarcode(Barcode code) {
        return null;
    }
}
