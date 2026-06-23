
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number? ");

        int input1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Last number? ");

        int input2 = Integer.valueOf(scanner.nextLine());

        int sum = 0;

        if (input1 <= input2) {
            for (int i = input1; i <= input2; i++) {

                sum = sum + i;

            }
            System.out.println("The sum is " + sum);
        }
    }
}
