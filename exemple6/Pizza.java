package exemple6;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    void prepare(){
        System.out.println("Preparing "+name);
        System.out.println("Tossing dough ....");
        System.out.println("Adding sauce ....");
        System.out.println("Adding topping: ");
        for (String topping : toppings) {
            System.out.println("    "+topping);
        }
    }

    void bake(){
        System.out.println("Baking for 25 min at 350");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }
    
}