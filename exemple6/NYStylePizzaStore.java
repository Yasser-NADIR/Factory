package exemple6;

public class NYStylePizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")) pizza = new NYStyelCheesePizza();
        return pizza;
    }

}
