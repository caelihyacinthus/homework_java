
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num == -1) {
                break;
            }
            numbers.add(num);
        }

        System.out.println("Average: " + average(numbers));

    }

    public static float average(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return (float) sum / numbers.size();
    }
}
