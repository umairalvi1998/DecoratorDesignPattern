package DecoratorDesignPattern;

public class Tomato implements Toppings{
    pizzaBase pizza;
    int cost = 30;

    Tomato(pizzaBase pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        if (pizza != null) {
            return pizza.getCost() + cost;
        }
        else
            throw new IllegalArgumentException("pizza is null");
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + " Tomato ";
    }
}
