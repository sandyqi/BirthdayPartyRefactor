package scrap.heap.refactor;


public class Order { // maybe more order types will come
    public BalloonsOrder balloonsOrder;
    public CakeOrder cakeOrder;

    private Order() {

    }

    public static class OrderDetail {
        private BalloonsOrder balloonsOrder;
        private CakeOrder cakeOrder;

        public OrderDetail addBalloonsOrder(BalloonsOrder balloonsOrder) {
            this.balloonsOrder = balloonsOrder;
            System.out.println("Balloons ordered; " + balloonsOrder);
            return this;
        }

        public OrderDetail addCakeOrder(CakeOrder cakeOrder) {
            this.cakeOrder = cakeOrder;
            System.out.println("Cake ordered; " + cakeOrder);
            return this;
        }

        public Order build() {
            Order order = new Order();
            order.balloonsOrder = this.balloonsOrder;
            order.cakeOrder = this.cakeOrder;
            return order;
        }

    }
}
