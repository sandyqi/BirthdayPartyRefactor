package scrap.heap.refactor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class OrderTest {
    @Mock
    BalloonsOrder balloonsOrderMock;
    @Mock
    CakeOrder cakeOrderMock;

    @Test
    public void testOrderWithBalloonsAndCake() {
        Order order = new Order
                .OrderDetail()
                .addBalloonsOrder(balloonsOrderMock)
                .addCakeOrder(cakeOrderMock)
                .build();

        assertEquals("order should have balloons order", order.balloonsOrder, balloonsOrderMock);
        assertEquals("order should have cake order", order.cakeOrder, cakeOrderMock);
    }

    @Test
    public void testOrderWithBalloonsOnly() {
        Order order = new Order
                .OrderDetail()
                .addBalloonsOrder(balloonsOrderMock)
                .build();

        assertEquals("order should have balloons order", order.balloonsOrder, balloonsOrderMock);
        assertNull("order should not have cake order", order.cakeOrder);
    }

    @Test
    public void testOrderWithCakeOnly() {
        Order order = new Order
                .OrderDetail()
                .addCakeOrder(cakeOrderMock)
                .build();

        assertEquals("order should have cake order", order.cakeOrder, cakeOrderMock);
        assertNull("order should not have balloons order", order.balloonsOrder);
    }
}
