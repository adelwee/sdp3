public class PizzaShop {
    public static void main(String[] args) {
        Pizza margherita = new MargheritaPizza();
        System.out.println(margherita.getDescription() + " Cost: $" + margherita.getCost());

        Pizza margheritaWithCheese = new CheeseTopping(margherita);
        System.out.println(margheritaWithCheese.getDescription() + " Cost: $" + margheritaWithCheese.getCost());

        Pizza vegetarianWithMushroomAndCheese = new CheeseTopping(new MushroomTopping(new VegetarianPizza()));
        System.out.println(vegetarianWithMushroomAndCheese.getDescription() + " Cost: $" + vegetarianWithMushroomAndCheese.getCost());
    }
}
