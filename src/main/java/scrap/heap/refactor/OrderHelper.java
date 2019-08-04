package scrap.heap.refactor;


public class OrderHelper {
    public Order createOrder(String balloonColor, String material, int number, String flavor, String frostingFlavor, String shape, String size, String cakeColor) {
        return new Order
                .OrderDetail()
                .addBalloonsOrder(
                        new BalloonsOrder
                                .Balloon()
                                .setBalloonColor(balloonColor)
                                .setMaterial(material)
                                .setNumber(number)
                                .build())
                .addCakeOrder(
                        new CakeOrder
                                .Cake()
                                .setFlavor(flavor)
                                .setFrostingFlavor(frostingFlavor)
                                .setShape(shape)
                                .setSize(size)
                                .setCakeColor(cakeColor)
                                .build())
                .build();
    }
}

