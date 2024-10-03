package DecoratorDesignPattern;

public class Client {
    public static void main(String[] args) {
        pizzaBase p = new Paneer(new Cheese(new Tomato(new BBQChicken())));
        System.out.println(p.getCost()); // should output 370
        System.out.println(p.getDescription());
    }
}
