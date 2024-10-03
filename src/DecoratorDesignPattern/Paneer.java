package DecoratorDesignPattern;

public class Paneer implements  Toppings{
   pizzaBase pizza;
   int cost = 60;

   Paneer(pizzaBase pizza) {
       this.pizza = pizza;
   }

    @Override
    public int getCost() {
       if(pizza != null) {
           return pizza.getCost()+cost;
       }
       else
           throw new IllegalStateException();

    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Paneer ";
    }
}
