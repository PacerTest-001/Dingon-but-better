package ItemManagement.Items;

public abstract class Item {
    public String name;
    public String type;

    public Item(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
