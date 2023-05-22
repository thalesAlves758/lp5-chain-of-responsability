public abstract class DiscountHandler {
    private DiscountHandler nextDiscountHandler;
    private float discountPercentage;

    public DiscountHandler(float discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public DiscountHandler getNextDiscountHandler() {
        return nextDiscountHandler;
    }

    public void setNextDiscountHandler(DiscountHandler nextDiscountHandler) {
        this.nextDiscountHandler = nextDiscountHandler;
    }

    public float getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(float discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public abstract float applyDiscount(Order order);
}
