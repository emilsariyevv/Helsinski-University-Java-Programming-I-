import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Recipe> recipes = new ArrayList<>();

        System.out.print("File to read: ");
        String file = scanner.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(file))) {

            while (fileReader.hasNextLine()) {

                String name = fileReader.nextLine();
                int time = Integer.valueOf(fileReader.nextLine());

                Recipe recipe = new Recipe(name, time);

                while (fileReader.hasNextLine()) {

                    String line = fileReader.nextLine();

                    if (line.isEmpty()) {
                        break;
                    }

                    recipe.addIngredient(line);
                }

                recipes.add(recipe);
            }

        } catch (Exception e) {
            System.out.println("Error reading file.");
        }

        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {

            System.out.println("");
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {

                System.out.println("");
                System.out.println("Recipes:");

                for (Recipe r : recipes) {
                    System.out.println(r);
                }
            }

            else if (command.equals("find name")) {

                System.out.print("Searched word: ");
                String word = scanner.nextLine();

                System.out.println("");
                System.out.println("Recipes:");

                for (Recipe r : recipes) {
                    if (r.getName().contains(word)) {
                        System.out.println(r);
                    }
                }
            }

            else if (command.equals("find cooking time")) {

                System.out.print("Max cooking time: ");
                int max = Integer.valueOf(scanner.nextLine());

                System.out.println("");
                System.out.println("Recipes:");

                for (Recipe r : recipes) {
                    if (r.getCookingTime() <= max) {
                        System.out.println(r);
                    }
                }
            }

            else if (command.equals("find ingredient")) {

                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();

                System.out.println("");
                System.out.println("Recipes:");

                for (Recipe r : recipes) {
                    if (r.hasIngredient(ingredient)) {
                        System.out.println(r);
                    }
                }
            }
        }
    }
}