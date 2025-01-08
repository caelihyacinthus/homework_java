
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 9999) {
                break;
            }

            numbers.add(number);
        }

        int smallest = smallestNumber(numbers);
        System.out.println("Smallest number: " + smallest);
        ArrayList<Integer> idxList = allIndexesOf(numbers, smallest);
        for (int i : idxList) {
            System.out.println("Found at index: " + i);
        }
    }

    public static int smallestNumber(ArrayList<Integer> numbers) {
        int smallest = numbers.get(0);

        for (int n : numbers) {
            if (n < smallest) smallest = n;
        }

        return smallest;
    }

    public static ArrayList<Integer> allIndexesOf(ArrayList<Integer> numbers, int number) {
        ArrayList<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (number == numbers.get(i)) indexes.add(i);
        }

        return indexes;
    }
}
