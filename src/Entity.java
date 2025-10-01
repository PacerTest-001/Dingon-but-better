import ItemManagement.Inventory;

public class Entity {
    Inventory inventory;

    String name;
    int posX;
    int posY;

    Entity(String name) {
        this.name = name;
        inventory = new Inventory(5);
    }

    Entity(String name, int invCapacity) {
        this.name = name;
        inventory = new Inventory(invCapacity);
    }

    @Override
    public String toString() {
        return "name: " + name + " | position: " + posX + ", " + posY;
    }
}
