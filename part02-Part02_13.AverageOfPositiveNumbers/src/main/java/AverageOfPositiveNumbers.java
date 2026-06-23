
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumofpositivenumbers = 0;
        int numberofpositivenumbers = 0;

        while (true) {

            System.out.println("Give a number:");

            int input = Integer.valueOf(scanner.nextLine());

            if(input == 0){
                break;
            }

            if (input > 0) {

                sumofpositivenumbers = sumofpositivenumbers + input;
                numberofpositivenumbers = numberofpositivenumbers + 1;
            }

        }

        double averageofpositivenumbers = (double)sumofpositivenumbers / numberofpositivenumbers;

        if (numberofpositivenumbers > 0) {
            System.out.println(averageofpositivenumbers);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}