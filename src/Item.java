import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Item {
    private File text = new File("Items_File");
    private Random R = new Random();

    String itemName;

    Item(String name) {
        this.itemName = name;
    }

    public String[] randomList() {
        try {
            File obj = text;
            Scanner reader = new Scanner(obj);
            int amount = 0;

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                if (data.length() <= 1) {
                    continue;
                }
                amount += 1;
            }

            String[] holder = new String[amount];
            int randomAmount = R.nextInt(4);

            String[] pass = new String[randomAmount];

            for (int i = randomAmount; i < randomAmount; i++) {
                pass[i] = holder[R.nextInt(holder.length)];
            }

            return  pass;

        } catch (RuntimeException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public Item[] createItemArray(String[] itemNames) {
        try {
            File obj = text;
            Scanner reader = new Scanner(obj);

            Item[] newItemList = new Item[itemNames.length];
            int i = 0;
            int current = 0;

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                if (data.length() <= 1) {
                    continue;
                }
                for (String name : itemNames) {
                    if (data.equalsIgnoreCase(name)) {
                        newItemList[i] = new Item(data);
                        break;
                    }
                }
            }

            return newItemList;
        } catch (RuntimeException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
