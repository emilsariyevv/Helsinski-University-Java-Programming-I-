
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        divisibleByThreeInRange(0, 10);
    }

    public static void divisibleByThreeInRange(int beginning, int end) {

        for (int i = beginning; i <= end; i++) {

            if (i == 0) {
                continue;
            }

            if (i % 3 == 0) {

                System.out.println(i);
            }

        }
    }
}
