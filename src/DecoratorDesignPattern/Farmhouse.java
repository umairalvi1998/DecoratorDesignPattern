package DecoratorDesignPattern;

public class Farmhouse implements pizzaBase{

    @Override
    public int getCost() {
        return 150;
    }

    @Override
    public String getDescription() {
        return " Farmhouse ";
    }
}
