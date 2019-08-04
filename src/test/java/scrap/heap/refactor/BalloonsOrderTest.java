package scrap.heap.refactor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BalloonsOrderTest {

    @Test
    public void testBalloonsOrderWithBalloons() {
        BalloonsOrder balloonsOrder = new BalloonsOrder
                .Balloon()
                .setBalloonColor("yellow")
                .setMaterial("gold")
                .setNumber(2)
                .build();
        assertEquals("balloon color should match", balloonsOrder.balloonColor, "yellow");
        assertEquals("balloon material should match", balloonsOrder.material, "gold");
        assertEquals("balloon number should match", balloonsOrder.number, 2);
    }
}
