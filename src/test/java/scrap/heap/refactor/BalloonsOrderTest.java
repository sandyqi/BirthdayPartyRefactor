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
        assertEquals(balloonsOrder.balloonColor, "yellow");
        assertEquals(balloonsOrder.material, "gold");
        assertEquals(balloonsOrder.number, 2);
    }
}
