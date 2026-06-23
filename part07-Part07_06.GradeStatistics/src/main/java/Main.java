import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int count = 0;

        double sumOfPassed = 0;
        int countOfPassed = 0;

        // GRADE COUNTERS (əlavə edildi)
        int grade0 = 0;
        int grade1 = 0;
        int grade2 = 0;
        int grade3 = 0;
        int grade4 = 0;
        int grade5 = 0;

        System.out.println("Enter point totals, -1 stops: ");

        while (true) {

            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            if (input < 0 || input > 100) {
                continue;
            }

            count++;
            sum += input;

            if (input >= 50) {
                countOfPassed++;
                sumOfPassed += input;
            }

            if (input < 50) {
                grade0++;
            } else if (input < 60) {
                grade1++;
            } else if (input < 70) {
                grade2++;
            } else if (input < 80) {
                grade3++;
            } else if (input < 90) {
                grade4++;
            } else {
                grade5++;
            }
        }

        System.out.println("Point average (all): " + sum / count);

        if (countOfPassed == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + sumOfPassed / countOfPassed);
        }

        System.out.println("Pass percentage: " + 100.0 * countOfPassed / count);

        System.out.println("Grade distribution:");
        System.out.println("5: " + stars(grade5));
        System.out.println("4: " + stars(grade4));
        System.out.println("3: " + stars(grade3));
        System.out.println("2: " + stars(grade2));
        System.out.println("1: " + stars(grade1));
        System.out.println("0: " + stars(grade0));
    }

    public static String stars(int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += "*";
        }
        return result;
    }
}