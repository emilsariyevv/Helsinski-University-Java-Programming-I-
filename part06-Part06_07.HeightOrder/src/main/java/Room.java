
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> persons;

    public Room() {

        this.persons = new ArrayList<>();

    }

    public void add(Person person) {

        this.persons.add(person);
    }

    public boolean isEmpty() {

        if (persons.isEmpty()) {

            return true;
        }

        return false;
    }

    public ArrayList<Person> getPersons() {

        return persons;
    }

    public Person shortest() {
        if (persons.isEmpty()) {

            return null;
        }

        Person x = persons.get(0);

        for (int i = 0; i <= persons.size() - 1; i++) {

            if (persons.get(i).getHeight() < x.getHeight()) {

                x = persons.get(i);
            }

        }
        return x;
    }

    public Person take() {

        if (persons.isEmpty()) {
            return null;
        }

        Person shortest = persons.get(0);

        for (int i = 1; i < persons.size(); i++) {
            if (persons.get(i).getHeight() < shortest.getHeight()) {
                shortest = persons.get(i);
            }
        }

        persons.remove(shortest);

        return shortest;
    }
}
