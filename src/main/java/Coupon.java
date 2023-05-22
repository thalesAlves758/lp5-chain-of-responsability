public class Coupon {
    private String identifier;

    public Coupon(String identifier, float discountPercentage) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
