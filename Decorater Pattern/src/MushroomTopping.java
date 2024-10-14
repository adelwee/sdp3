public class MushroomTopping extends ToppingDecorator {
    public MushroomTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return Pizza.getDescription() + ", Mushrooms";
    }

    @Override
    public double getCost() {
        return Pizza.getCost() + 1.25;
    }
}