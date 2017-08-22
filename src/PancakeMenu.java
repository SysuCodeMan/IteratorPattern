import java.util.ArrayList;

/*
Created by ChrisChan on 2017/8/21.
*/
public class PancakeMenu {
    ArrayList<MenuItem> menuItems;

    public PancakeMenu() {
        menuItems = new ArrayList<>();
        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);
        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);
        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);
        addItem("Waffles",
                "Waffles, with your choice of blueberries or stawberries",
                true,
                3.59);
    }

    public Iterator createIterator() {
        return new PancakeHouseIterator(menuItems);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
}
