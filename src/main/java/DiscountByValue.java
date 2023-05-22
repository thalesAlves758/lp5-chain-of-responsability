public class DiscountByValue extends DiscountHandler {
    private float minValue;

    public DiscountByValue(float discountPercentage, float minValue) {
        super(discountPercentage);
        this.minValue = minValue;
    }

    public float applyDiscount(Order order) {
        if(order.calculateTotalValue() >= minValue) {
            return order.calculateTotalValue() * (this.getDiscountPercentage() / 100);
        } else if(this.getNextDiscountHandler() != null) {
            return this.getNextDiscountHandler().applyDiscount(order);
        }

        return 0;
    }
}
