/*
Created by ChrisChan on 2017/8/21.
*/
public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public Iterator createIterator() {
        return new DinnerMenuIterator(menuItems);
    }
}
