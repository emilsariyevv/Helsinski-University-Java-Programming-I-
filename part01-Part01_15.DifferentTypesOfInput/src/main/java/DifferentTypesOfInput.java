
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String givenstringinput = scan.nextLine();

        System.out.println("Give an integer:");

        int givenintegerinput = Integer.valueOf(scan.nextLine());

        System.out.println("Give a double:");
        
        double givendoubleinput = Double.valueOf(scan.nextLine());

        System.out.println("Give a boolean:");

        boolean givenbooleaninput = Boolean.valueOf(scan.nextLine());


        System.out.println("You gave the string " + givenstringinput);
        System.out.println("You gave the integer " + givenintegerinput);
        System.out.println("You gave the double " + givendoubleinput);
        System.out.println("You gave the boolean " + givenbooleaninput);

    }
}
