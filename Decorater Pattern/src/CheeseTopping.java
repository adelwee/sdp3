public class CheeseTopping extends ToppingDecorator {
    public CheeseTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return Pizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return Pizza.getCost() + 1.50;
    }
}