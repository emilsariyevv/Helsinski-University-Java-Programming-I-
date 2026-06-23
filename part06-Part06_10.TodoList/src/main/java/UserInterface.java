
import java.util.Scanner;

public class UserInterface {

    private TodoList todolist;

    private Scanner scanner;

    public UserInterface(TodoList todolist, Scanner scanner) {

        this.todolist = todolist;

        this.scanner = scanner;
    }

    public void start() {

        while (true) {

            System.out.println("Command: ");

            String command = scanner.nextLine();

            if (command.equals("stop")) {

                break;
            }

            if (command.equals("add")) {

                System.out.println("To add: ");

                String toadd = scanner.nextLine();

                todolist.add(toadd);
            }

            if (command.equals("list")) {

                todolist.print();
            }

            if (command.equals("remove")) {

                System.out.println("Which one is removed? ");

                int removed = Integer.valueOf(scanner.nextLine());

                todolist.remove(removed);

            }
        }

    }

}
