package DecoratorDesignPattern;

public class Olive implements  Toppings{
    pizzaBase pizza;
    int cost = 20;

    Olive(pizzaBase pizza){
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        if(pizza != null)
        return pizza.getCost() + cost;
        else
            throw new IllegalArgumentException("pizza is null");
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Olive ";
    }
}
