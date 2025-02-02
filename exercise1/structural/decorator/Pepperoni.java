package structural.decorator;

public class Pepperoni extends ToppingDecorator {
    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Pepperoni";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 2;
    }
}
