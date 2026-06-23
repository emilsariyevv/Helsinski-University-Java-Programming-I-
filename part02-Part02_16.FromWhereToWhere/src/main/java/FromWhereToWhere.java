
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to? ");

        int input1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Where from? ");

        int input2 = Integer.valueOf(scanner.nextLine());

        if (input1 >= input2){
            for (int i = input2; i <= input1; i++) {

                System.out.println(i);
            }

            
        }

    }
}
