package exemple1;


public class Pizza {
    Pizza orderPizza(){
        Pizza pizza = new Pizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    private void box() {
    }

    private void cut() {
    }

    private void bake() {
    }

    private void prepare() {
    }
    
}