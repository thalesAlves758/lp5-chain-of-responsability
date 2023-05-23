import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DiscountTest {
    private DiscountHandler discountByValue;
    private DiscountHandler discountByItensAmount;
    private DiscountHandler couponDiscount;

    @BeforeAll
    void setUp() {
        couponDiscount = new CouponDiscount(5f, "COUPON_IDENTIFIER");
        discountByValue = new DiscountByValue(10f, 300);
        discountByItensAmount = new DiscountByItensAmount(15f, 3);

        couponDiscount.setNextDiscountHandler(discountByValue);
        discountByValue.setNextDiscountHandler(discountByItensAmount);
    }

    @Test
    void shouldApplyCouponDiscount() {
        Product smartphone = new Product("Smartphone", 2000f);

        Order order = new Order();
        order.addProduct(smartphone, 1);

        Coupon coupon = new Coupon("COUPON_IDENTIFIER");
        order.applyCoupon(coupon);

        float expectedResult = order.calculateTotalValue() * 0.05f;

        assertEquals(expectedResult, couponDiscount.applyDiscount(order));
    }

    @Test
    void shouldApplyDiscountByValue() {
        Product smartphone = new Product("Smartphone", 2000f);

        Order order = new Order();
        order.addProduct(smartphone, 1);

        float expectedResult = order.calculateTotalValue() * 0.10f;

        assertEquals(expectedResult, couponDiscount.applyDiscount(order));
    }

    @Test
    void shouldApplyDiscountByItensAmount() {
        Product smartphone = new Product("Pencil", 4f);

        Order order = new Order();
        order.addProduct(smartphone, 6);

        float expectedResult = order.calculateTotalValue() * 0.15f;

        assertEquals(expectedResult, couponDiscount.applyDiscount(order));
    }

    @Test
    void shouldNotApplyAnyDiscount() {
        Product smartphone = new Product("Pencil", 4f);

        Order order = new Order();
        order.addProduct(smartphone, 2);

        float expectedResult = 0;

        assertEquals(expectedResult, couponDiscount.applyDiscount(order));
    }
}
