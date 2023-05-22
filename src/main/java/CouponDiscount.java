public class CouponDiscount extends DiscountHandler {
    private String couponIdentifier;

    public CouponDiscount(float discountPercentage, String couponIdentifier) {
        super(discountPercentage);

        this.couponIdentifier = couponIdentifier;
    }

    public String getCouponIdentifier() {
        return couponIdentifier;
    }

    public void setCouponIdentifier(String couponIdentifier) {
        this.couponIdentifier = couponIdentifier;
    }

    public float applyDiscount(Order order) {
        if(order.getCoupon().getIdentifier().equals(couponIdentifier)) {
            return order.calculateTotalValue() * (this.getDiscountPercentage() / 100);
        } else if(this.getNextDiscountHandler() != null) {
            return this.getNextDiscountHandler().applyDiscount(order);
        }

        return 0;
    }
}
