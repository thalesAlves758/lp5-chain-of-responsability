public class DiscountByItensAmount extends DiscountHandler {
    private int minAmount;

    public DiscountByItensAmount(float discountPercentage, int minAmount) {
        super(discountPercentage);
    }

    public int getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(int minAmount) {
        this.minAmount = minAmount;
    }

    public float applyDiscount(Order order) {
        if(order.calculateTotalItensAmount() >= minAmount) {
            return order.calculateTotalValue() * (this.getDiscountPercentage() / 100);
        } else if(this.getNextDiscountHandler() != null) {
            return this.getNextDiscountHandler().applyDiscount(order);
        }

        return 0;
    }
}
