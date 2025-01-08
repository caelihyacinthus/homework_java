
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println();

        System.out.println("The greatest number: " + greatestNumber(list));
    }

    public static int greatestNumber(ArrayList<Integer> list) {
        int max = 0;

        for (int n : list) {
            if (n > max) max = n;
        }

        return max;
    }
}
