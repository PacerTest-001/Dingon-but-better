package ItemManagement;

public class ItemStacker {
    int limit;
    int currentAmount;
    String itemName;
    Item[] items;

    ItemStacker(String itemName, int limit) {
        items = new Item[limit];

        this.currentAmount = 0;
        this.limit = limit;
        this.itemName = itemName;
    }
}
