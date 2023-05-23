import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items;
    private Coupon coupon;
    private float finalValue;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addProduct(Product product, int amount) {
        OrderItem orderItem = new OrderItem(product);
        orderItem.setAmount(amount);

        this.items.add(orderItem);
    }

    public void removeProduct(Product product) {
        this.items.remove(product);
    }

    public void applyCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    public void removeCoupon() {
        this.coupon = null;
    }

    public Coupon getCoupon() {
        return this.coupon;
    }

    public float calculateTotalValue() {
        float total = 0;

        for(OrderItem item : items) {
            total += item.getProduct().getPrice() * item.getAmount();
        }

        return total;
    }

    public int calculateTotalItensAmount() {
        int itensAmount = 0;

        for(OrderItem item : items) {
            itensAmount += item.getAmount();
        }

        return itensAmount;
    }

    public float getFinalValue() {
        return finalValue;
    }

    public void setFinalValue(float finalValue) {
        this.finalValue = finalValue;
    }

    public List<OrderItem> getItems() {
        return items;
    }
}
