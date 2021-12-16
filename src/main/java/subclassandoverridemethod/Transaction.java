package subclassandoverridemethod;

import lombok.Value;

import java.util.Date;

@Value
public class Transaction {
    Date date;
    double amount;
}
