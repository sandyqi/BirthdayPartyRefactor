package scrap.heap.refactor;

import org.junit.Test;
import org.mockito.internal.matchers.Or;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class OrderHelperTest {

    @Test
    public void testOrderHelperWithCreateOrder() {
        OrderHelper orderHelper = new OrderHelper();
        Order order = orderHelper.createOrder("red", "mylar", 4, "chocolate", "chocolate", "circle", "large", "brown");
        assertTrue("createOrder should return an order", order instanceof Order);
    }
}
