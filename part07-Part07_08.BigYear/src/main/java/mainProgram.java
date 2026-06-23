import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();

        while (true) {

            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {

                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Name in Latin: ");
                String latin = scanner.nextLine();

                birds.add(new Bird(name, latin));
            }

            else if (command.equals("Observation")) {

                System.out.print("Bird? ");
                String searched = scanner.nextLine();

                boolean found = false;

                for (Bird b : birds) {
                    if (b.getName().equals(searched)) {
                        b.addObservation();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Not a bird!");
                }
            }

            else if (command.equals("All")) {

                for (Bird b : birds) {
                    System.out.println(b);
                }
            }

            else if (command.equals("One")) {

                System.out.print("Bird? ");
                String searched = scanner.nextLine();

                for (Bird b : birds) {
                    if (b.getName().equals(searched)) {
                        System.out.println(b);
                        break;
                    }
                }
            }
        }
    }
}