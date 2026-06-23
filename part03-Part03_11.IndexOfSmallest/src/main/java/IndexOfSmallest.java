
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {

            int input = Integer.valueOf(scanner.nextLine());


            if (input == 9999){

                break;
            }

            list.add(input);

        }

        int smallestNumber = list.get(0);

        for ( int i = 0; i < list.size(); i++){

            int number = list.get(i);

            if(smallestNumber > number){

                smallestNumber = number;
            }
        }

        System.out.println("Smallest number: " + smallestNumber);

        int b = 0;

        while(b < list.size()){

            if (list.get(b) == smallestNumber){

                System.out.println("Found at index: " + b);
            }


            b++;
        }

    }
}
