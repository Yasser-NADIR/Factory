package exemple4;

public class App {
    public static void main(String[] args) {
        NYPizzaFactory factory1 = new NYPizzaFactory();
        PizzaStore story1 = new PizzaStore(factory1);
        story1.orderPizza("Veggie");

        ChicagoPizzaFactory factory2 = new ChicagoPizzaFactory();
        PizzaStore story2 = new PizzaStore(factory2);
        story2.orderPizza("Veggie");
    }
}
