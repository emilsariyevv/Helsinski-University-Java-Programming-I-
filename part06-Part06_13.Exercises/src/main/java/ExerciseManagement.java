import java.util.ArrayList;
import java.util.List;

public class ExerciseManagement {

    private List<Exercise> list;

    public ExerciseManagement() {
        this.list = new ArrayList<>();
    }

    public void add(String name) {
        this.list.add(new Exercise(name));
    }

    public List<Exercise> exerciseList() {
        return this.list;
    }

    public void markAsCompleted(String name) {
        for (Exercise exercise : this.list) {
            if (exercise.getName().equals(name)) {
                exercise.setCompleted(true);
                break;
            }
        }
    }

    public boolean isCompleted(String name) {
        for (Exercise exercise : this.list) {
            if (exercise.getName().equals(name)) {
                return exercise.isCompleted();
            }
        }
        return false;
    }
}