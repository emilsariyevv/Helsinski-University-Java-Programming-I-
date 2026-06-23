
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        int sum = 0;
        int numbers = 0;
        int numberOdd = 0;
        int numberEven = 0;

        while (true) {

            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {

                System.out.println("Thx! Bye!");

                break;

            }

            if (input % 2 == 0) {

                numberEven = numberEven + 1;
            } else {
                numberOdd = numberOdd + 1;
            }

            sum = sum + input;
            numbers = numbers + 1;
        }

        double average = (double) sum / numbers;
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + numberEven);
        System.out.println("Odd: " + numberOdd);
    }
}
