import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        // implement here the program that allows the user to enter
        // book information and to examine them
        while (true) {

            System.out.println("Title: ");

            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");

            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year: ");

            int publicationyear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, publicationyear));

        }

        System.out.println("What information will be printed? ");

        String whatInformation = scanner.nextLine();

        for (Book elements : books) {
            if (whatInformation.equals("everything")) {

                System.out.println(elements);
            } else if (whatInformation.equals("name")) {
                System.out.println(elements.getTitle());
            }
        }
    }
}
