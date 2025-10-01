import ItemManagement.Inventory;
import ItemManagement.Items.Item;

public class Player {
    String name;
    Item inHand;
    Entity character;

    Player(String name, int capacity){
        this.name = name;
        inHand = null;

        character = new Entity(name, capacity);
    }
}
