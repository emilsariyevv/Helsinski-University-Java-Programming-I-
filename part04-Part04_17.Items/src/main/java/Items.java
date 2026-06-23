
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Name: ");

            String inputName = scanner.nextLine();

            if(inputName.isEmpty()){
                
                break;
            }

            items.add(new Item(inputName));


        }

        for(Item item : items){

            System.out.println(item);
        }

    }
}
