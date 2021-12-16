package replaceglobalreferencewithgetter;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

class RegisterSaleShould {

    @Test
    void add_item() {
        RegisterSale registerSale = new TestableRegisterSale();
        registerSale.addItem(new Barcode());

        List<Item> actual = registerSale.getItems();

        assertThat(actual).hasSize(1);
    }

    private class TestableRegisterSale extends RegisterSale {
        @Override
        protected Inventory getInventory() {
            return mock(Inventory.class);
        }
    }
}