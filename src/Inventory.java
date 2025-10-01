public class Inventory {
    Item[] items = new Item[20];
    Item[] inUseItems = new Item[5];

    Inventory(Item[] items) {
        this.items = items;
    }

    public Item getItem(String name) {
        for (Item item: items) {
            if (item.itemName.equalsIgnoreCase(name)) {
                return item;
            }
        }
        throw new RuntimeException("No item found by name.");
    }
}
