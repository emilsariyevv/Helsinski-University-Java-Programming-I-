import java.util.Scanner;

public class TextUI {

    private Scanner scanner;

    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {

        this.scanner = scanner;
        this.dictionary = dictionary;

    }

    public void start() {

        while (true) {

            System.out.println("Command: ");

            String input = scanner.nextLine();

            if (input.equals("end")) {

                System.out.println("Bye bye!");

                break;
            } else if (input.equals("add")) {

                System.out.println("Word: ");

                String word = scanner.nextLine();

                System.out.println("Translation: ");

                String translation = scanner.nextLine();

                dictionary.add(word, translation);

            } else if (input.equals("search")) {

                System.out.println("To be translated: ");

                String translated = scanner.nextLine();

                String translation = dictionary.translate(translated);

                if (translation == null) {
                    System.out.println("Word " + translated + " was not found");

                } else {
                    System.out.println("Translation: ");
                    System.out.print(translation);

                }

            }

            else {

                System.out.println("Unknown command");

            }

        }

    }

}