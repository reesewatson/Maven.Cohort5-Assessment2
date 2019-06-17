package rocks.zipcode.assessment2.collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.lang.String;
import java.util.ArrayList;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    private Map<String, Integer> inventory;
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        this.inventory = new TreeMap<>();
        for (String str : strings) {
            inventory.put(str, 1); }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        this.inventory = new TreeMap<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        if(inventory.containsKey(item)) {
            inventory.put(item, inventory.get(item) + 1);
        } else {
            inventory.put(item, 1);
        }
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
            inventory.put(item, inventory.get(item) - 1);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        if(inventory.containsKey(item)) {
            return inventory.get(item); }
        return 0;
    }
}

