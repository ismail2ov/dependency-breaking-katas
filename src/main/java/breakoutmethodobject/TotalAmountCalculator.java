package breakoutmethodobject;

import java.util.List;

public class TotalAmountCalculator {
    private final List<OrderLine> orderLines;

    public TotalAmountCalculator(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }


    public double getTotalAmount() {
        double result = 0;

        for (OrderLine each : orderLines) {
            double thisAmount = 0;
            double thisDiscount = 0;

            // determine amounts for each order line
            switch (each.getProduct().getType()) {
                case Product.REGULAR:
                    thisAmount = each.getQuantity() * each.getProduct().getPrice();
                    break;
                case Product.PROMOTED:
                    thisAmount = each.getQuantity() * each.getProduct().getPrice();
                    break;
                case Product.SECOND_70_PERCENT_LESS:
                    if (each.getQuantity() >= 2) {
                        int itemsToDiscount = each.getQuantity() / 2;
                        thisDiscount = itemsToDiscount * each.getProduct().getPrice() * 0.7;
                        thisAmount = each.getQuantity() * each.getProduct().getPrice() - thisDiscount;
                    } else {
                        thisAmount = each.getQuantity() * each.getProduct().getPrice();
                    }
                    break;
                case Product.PROMO_3x2:
                    if (each.getQuantity() >= 3) {
                        int itemsToDiscount = each.getQuantity() / 3;
                        thisDiscount = itemsToDiscount * each.getProduct().getPrice();
                        thisAmount = each.getQuantity() * each.getProduct().getPrice() - thisDiscount;
                    } else {
                        thisAmount = each.getQuantity() * each.getProduct().getPrice();
                    }
                    break;
            }

            result += thisAmount;
        }

        return result;

    }
}
