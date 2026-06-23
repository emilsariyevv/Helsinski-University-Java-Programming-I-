
import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> myPackage;


    public Package(){

        myPackage = new ArrayList<>();
    }
    public void addGift(Gift gift) {

        myPackage.add(gift);

    }

    public int totalWeight() {

        int sum = 0;

        for (Gift mygifts : myPackage) {

            sum = sum + mygifts.getWeight();
        }

        return sum;
    }

}
