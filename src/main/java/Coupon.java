public class Coupon {
    private String identifier;
    private float discountPercentage;

    public Coupon(String identifier, float discountPercentage) {
        this.identifier = identifier;
        this.discountPercentage = discountPercentage;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public float getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(float discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
