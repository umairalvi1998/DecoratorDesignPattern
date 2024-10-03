package DecoratorDesignPattern;

public class BBQChicken implements pizzaBase{
    @Override
    public int getCost() {
        return 200;
    }

    @Override
    public String getDescription() {
        return " BBQChicken ";
    }
}
