package subclassandoverridemethod;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

class AccountShould {

    @Test
    void returns_last_transaction_date() {
        Date expected = new Date();
        Account account = new TestableAccount(expected);
        account.debit(100);

        Date actual = account.getLastTransactionDate();

        assertThat(actual).isEqualTo(expected);
    }

    private class TestableAccount extends Account {
        private final Date date;

        public TestableAccount(Date date) {
            this.date = date;
        }

        @Override
        protected Date getDate() {
            return this.date;
        }
    }
}