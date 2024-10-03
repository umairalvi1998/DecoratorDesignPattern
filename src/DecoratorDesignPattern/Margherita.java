package DecoratorDesignPattern;

public class Margherita implements pizzaBase{
    @Override
    public int getCost() {
        return 200;
    }

    @Override
    public String getDescription() {
        return " Margherita ";
    }
}
