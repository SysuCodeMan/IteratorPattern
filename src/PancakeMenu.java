import java.util.ArrayList;

/*
Created by ChrisChan on 2017/8/21.
*/
public class PancakeMenu {
    ArrayList<MenuItem> menuItems;

    public Iterator createIterator() {
        return new PancakeHouseIterator(menuItems);
    }
}
