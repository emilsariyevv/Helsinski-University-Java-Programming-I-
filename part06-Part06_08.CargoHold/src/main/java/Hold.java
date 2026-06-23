import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;
    private int finalWeight = 0;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {

        if (finalWeight + suitcase.totalWeight() <= maximumWeight) {
            this.suitcases.add(suitcase);
            this.finalWeight += suitcase.totalWeight();
        }
    }

    @Override
    public String toString() {
        return suitcases.size() + " suitcases (" + finalWeight + " kg)";
    }

    public void printItems() {

        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
}