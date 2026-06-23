
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        int longestNameSize = 0;
        int count = 0;
        int sum = 0;
        String longestName = "";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] splitedParts = input.split(",");

            count = count + 1;

            sum = sum + Integer.valueOf(splitedParts[1]);

            if (splitedParts[0].length() > longestNameSize) {

                longestNameSize = splitedParts[0].length();

                longestName = splitedParts[0];
            }

        }

        double average = 1.0 * sum / count;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years:" + average);

    }
}
