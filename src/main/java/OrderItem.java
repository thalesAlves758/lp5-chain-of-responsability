public class OrderItem {
    private Product product;
    private int amount;

    public OrderItem(Product product) {
        this.product = product;
        this.amount = 1;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
