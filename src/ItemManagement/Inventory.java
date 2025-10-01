package ItemManagement;

import ItemManagement.Items.Item;

public class Inventory {
    ItemStacker[] holder;
    int capacity;

    public Inventory(int capacity) {
        this.capacity = capacity;
        holder = new ItemStacker[capacity];
    }

    public void setItemInHolder(int position, Item item, int amount) {
        if (item.name.equalsIgnoreCase(holder[position].itemName)) {
            holder[position].currentAmount = amount;
        } else {
            holder[position] = new ItemStacker(item.name, 64);
        }
    }
    public void setItemInHolder(int position, Item item, int amount, int limit) {
        if (item.name.equalsIgnoreCase(holder[position].itemName)) {
            holder[position].currentAmount = amount;
        } else {
            holder[position] = new ItemStacker(item.name, limit);
        }
    }
}
