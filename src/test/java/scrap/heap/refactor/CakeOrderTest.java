package scrap.heap.refactor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CakeOrderTest {

    @Test
    public void testCakeOrderWithCake() {
        CakeOrder cakeOrder = new CakeOrder
                .Cake()
                .setFlavor("chocolate")
                .setFrostingFlavor("vanilla")
                .setShape("square")
                .setSize("large")
                .setCakeColor("blue")
                .build();
        assertEquals("cake flavor should match", cakeOrder.flavor, "chocolate");
        assertEquals("cake frostingFlavor should match", cakeOrder.frostingFlavor, "vanilla");
        assertEquals("cake shape should match", cakeOrder.shape, "square");
        assertEquals("cake size should match", cakeOrder.size, "large");
        assertEquals("cake color should match", cakeOrder.cakeColor, "blue");
    }
}
