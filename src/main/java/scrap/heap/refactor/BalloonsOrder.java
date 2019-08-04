package scrap.heap.refactor;


public class BalloonsOrder {
    public String balloonColor;
    public String material;
    public int number;

    public BalloonsOrder() {
    }

    @Override
    public String toString() {
        return "color = " + this.balloonColor + ", material = " + this.material +
                ", number = " + this.number;
    }

    public static class Balloon {
        private String balloonColor;
        private String material;
        private int number;

        public Balloon setBalloonColor(String balloonColor) {
            this.balloonColor = balloonColor;
            return this;
        }

        public Balloon setMaterial(String material) {
            this.material = material;
            return this;
        }

        public Balloon setNumber(int number) {
            this.number = number;
            return this;
        }

        public BalloonsOrder build() {
            BalloonsOrder balloonsOrder = new BalloonsOrder();
            balloonsOrder.balloonColor = this.balloonColor;
            balloonsOrder.material = this.material;
            balloonsOrder.number = this.number;
            return balloonsOrder;
        }

    }
}
