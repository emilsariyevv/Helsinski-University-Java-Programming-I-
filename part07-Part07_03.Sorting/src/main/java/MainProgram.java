import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = { 8, 3, 7, 9, 1, 2, 4 };
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallestValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallestValue) {
                smallestValue = array[i];
            }
        }

        return smallestValue;
    }

    public static int indexOfSmallest(int[] array) {
        int smallestIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestIndex = startIndex;

        for (int i = startIndex + 1; i < table.length; i++) {
            if (table[i] < table[smallestIndex]) {
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {

        int a = array[index1];

        array[index1] = array[index2];
        array[index2] = a;

    }

    public static void sort(int[] array) {

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {

            int indexOfSmallest = indexOfSmallestFrom(array, i);

            swap(array, i, indexOfSmallest);

            System.out.println(Arrays.toString(array));
        }
    }

}