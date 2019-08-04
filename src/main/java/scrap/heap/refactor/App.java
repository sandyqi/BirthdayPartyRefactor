package scrap.heap.refactor;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
         //Place birthday party orders
        OrderHelper orderHelper = new OrderHelper();
        orderHelper.createOrder("red", "mylar", 4, "chocolate", "chocolate", "circle", "large", "brown");
        orderHelper.createOrder("blue", "latex", 7, "Vanilla", "chocelate", "square", "med", "brown");
        orderHelper.createOrder("yellow", "mylar", 4, "vanilla", "vanilla", "square", "small", "yellow");
    }
}
