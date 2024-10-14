public class RestaurantApp {
    public static void main(String[] args) {
        MenuComponent breakfastMenu = new Menu("Breakfast Menu", "Morning Meals");
        MenuComponent lunchMenu = new Menu("Lunch Menu", "Afternoon Meals");

        MenuComponent pancake = new MenuItem("Pancake", "Delicious pancake", 5.99);
        MenuComponent burger = new MenuItem("Burger", "Beef burger with cheese", 8.99);

        breakfastMenu.add(pancake);
        lunchMenu.add(burger);

        MenuComponent mainMenu = new Menu("Main Menu", "All Available Menus");
        mainMenu.add(breakfastMenu);
        mainMenu.add(lunchMenu);

        mainMenu.print();
    }
}
