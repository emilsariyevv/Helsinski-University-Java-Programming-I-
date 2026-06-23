
import java.util.ArrayList;

public class Stack {

    private ArrayList<String> x;

    public Stack() {

        this.x = new ArrayList<>();
    }

    public boolean isEmpty() {

        if (x.isEmpty()) {
            return true;
        }

        return false;
    }

    public void add(String value) {

        this.x.add(value);
    }

    public ArrayList<String> values() {

        return x;
    }

    public String take() {

        String lastvalue = x.get(x.size() - 1);
        x.remove(x.size() - 1);

        return lastvalue;
    }
}
