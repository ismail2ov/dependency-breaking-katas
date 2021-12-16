package breakoutmethodobject;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<OrderLine> orderLines = new ArrayList<>();

    public void addProduct(Product arg1, int arg2) {
        for (OrderLine orderLine : orderLines) {
            if (orderLine.getProduct().equals(arg1)) {
                orderLine.increaseQuantity(arg2);
                return;
            }
        }

        orderLines.add(new OrderLine(arg1, arg2));
    }

    public double getTotalAmount() {
        TotalAmountCalculator calculator = new TotalAmountCalculator(this.orderLines);
        return calculator.getTotalAmount();
    }
}