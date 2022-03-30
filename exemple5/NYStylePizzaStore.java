package exemple5;


public class NYStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        
        if(type.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        }else if(type.equals("greek")){
            pizza = new NYStyleGreekPizza();
        }else if(type.equals("pepperoni")){
            pizza = new NYStylePepperoniPizza();
        }

        return pizza;
    }

    
}