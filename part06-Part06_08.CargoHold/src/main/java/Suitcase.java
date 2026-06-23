import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maximumWeight;
    private int finalWeight = 0;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {

        if (finalWeight + item.getWeight() <= maximumWeight) {
            this.items.add(item);
            this.finalWeight += item.getWeight();
        }
    }

    @Override
    public String toString() {

        if (items.size() == 0) {
            return "no items (0 kg)";
        }

        if (items.size() == 1) {
            return "1 item (" + finalWeight + " kg)";
        }

        return items.size() + " items (" + finalWeight + " kg)";
    }

    public void printItems() {
        for (Item myItems : items) {

            System.out.println(myItems);
        }
    }

    public int totalWeight() {

        return finalWeight;
    }

    public Item heaviestItem() {

        if (items.isEmpty()) {
            return null;
        }

        Item heaviest = items.get(0);

        for (int i = 1; i < items.size(); i++) {
            if (items.get(i).getWeight() > heaviest.getWeight()) {
                heaviest = items.get(i);
            }
        }

        return heaviest;
    }

}