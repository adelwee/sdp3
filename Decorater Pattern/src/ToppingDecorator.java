public abstract class ToppingDecorator implements Pizza {
    protected Pizza Pizza;

    public ToppingDecorator(Pizza newPizza) {
        this.Pizza = newPizza;
    }

    @Override
    public String getDescription() {
        return Pizza.getDescription();
    }

    @Override
    public double getCost() {
        return Pizza.getCost();
    }
}
