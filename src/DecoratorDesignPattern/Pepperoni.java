package DecoratorDesignPattern;

public class Pepperoni implements Toppings{
    pizzaBase pizza;
    int cost = 180;

    Pepperoni(pizzaBase pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        if(pizza!=null)
        return pizza.getCost()+cost;
        else
            throw  new IllegalArgumentException("Base Pizza Doesnt exists");
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Pepperoni ";
    }
}
