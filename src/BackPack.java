import java.util.ArrayList;

public class BackPack extends Item {
    ArrayList<Item> inventory = new ArrayList<>();
    int maxSize = 2;

    public BackPack(String inType, String inDescription){ super(inType, inDescription); }

    public void addItemInBackpack(Item inItem) {
        if (inventory.size() < maxSize) {
            inventory.add(inItem);
        }
    }
    

}
