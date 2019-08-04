package scrap.heap.refactor;

public class CakeOrder {

    public String flavor;
    public String frostingFlavor;
    public String shape;
    public String size;
    public String cakeColor;

    private CakeOrder() {
    }

    @Override
    public String toString() {
        return "flavor = " + this.flavor + ", frostingFlavor = " + this.frostingFlavor +
                ", shape = " + this.shape + ", size = " + this.size + ", cakeColor = " + this.cakeColor;
    }

    public static class Cake {
        private String shape;
        private String flavor;
        private String frostingFlavor;
        private String size;
        private String cakeColor;

        public Cake setShape(String shape) {
            this.shape = shape;
            return this;
        }

        public Cake setFlavor(String flavor) {
            this.flavor = flavor;
            return this;
        }

        public Cake setFrostingFlavor(String frostingFlavor) {
            this.frostingFlavor = frostingFlavor;
            return this;
        }

        public Cake setSize(String size) {
            this.size = size;
            return this;
        }

        public Cake setCakeColor(String cakeColor) {
            this.cakeColor = cakeColor;
            return this;
        }

        public CakeOrder build() {
            CakeOrder cakeOrder = new CakeOrder();
            cakeOrder.shape = this.shape;
            cakeOrder.flavor = this.flavor;
            cakeOrder.frostingFlavor = this.frostingFlavor;
            cakeOrder.size = this.size;
            cakeOrder.cakeColor = this.cakeColor;
            return cakeOrder;
        }
    }
}
