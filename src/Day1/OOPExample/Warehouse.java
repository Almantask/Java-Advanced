package Day1.OOPExample;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private final Map<Integer, Item> items = new HashMap<>();

    public Warehouse(){
        items.put(1, new Item("Flour", 1, 1));
        items.put(2, new Item("Book", 30, 2));
        items.put(3, new Item("CD", 0.5, 1));
    }

    // Create a method that given item id, returns item
    public Item getItem(Integer id){
        return items.get(id);
    }

    // fields

    // constructor

    // methods
}
