
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {

        if (elements.isEmpty()) {

            return null;
        }

        String longestelement = elements.get(0);

        for (int i = 0; i < elements.size() - 1; i++) {

            if (elements.get(i).length() > elements.get(i + 1).length()) {

                longestelement = elements.get(i);
            } else {
                longestelement = elements.get(i + 1);
            }

        }

        return longestelement;
    }
}
