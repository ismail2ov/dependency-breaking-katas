package replaceglobalreferencewithgetter;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RegisterSaleShould {

    @Test
    void add_item() {
//        Inventory.getInstance();
        RegisterSale registerSale = new RegisterSale();
        registerSale.addItem(new Barcode());

        List<Item> actual = registerSale.getItems();

        assertThat(actual).hasSize(1);
    }
}