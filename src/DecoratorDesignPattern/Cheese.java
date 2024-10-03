package DecoratorDesignPattern;

public class Cheese implements  Toppings{

    pizzaBase pizza;
    int cost = 80;
    public  Cheese(pizzaBase pizza ) {
        this.pizza = pizza;
    }
    @Override
    public int getCost() {
        if (pizza !=null)
        return pizza.getCost() + cost;
        else
            throw new IllegalArgumentException("pizza is null");
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Cheese ";
    }
}
