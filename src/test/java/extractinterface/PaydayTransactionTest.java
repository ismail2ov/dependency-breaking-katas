package extractinterface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PaydayTransactionTest {

    @Test
    void runTest() {
        Transaction t = new PaydayTransaction(getTestingDatabase(), getTransactionLog());
        t.run();
        assertEquals(getSampleCheck(12), getTestingDatabase().findCheck(12));
    }

    private int getSampleCheck(int index) {
        return index;
    }

    private PayrollDatabase getTestingDatabase() {
        return new PayrollDatabase();
    }

    private TransactionLog getTransactionLog() {
        return new TransactionLog();
    }
}