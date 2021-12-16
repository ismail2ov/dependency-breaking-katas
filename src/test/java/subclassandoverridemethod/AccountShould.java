package subclassandoverridemethod;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AccountShould {

    @Test
    void returns_last_transaction_date() {
        Date expected = new Date();
        Account account = new Account();
        account.debit(100);

        Date actual = account.getLastTransactionDate();

        assertThat(actual).isEqualTo(expected);
    }
}