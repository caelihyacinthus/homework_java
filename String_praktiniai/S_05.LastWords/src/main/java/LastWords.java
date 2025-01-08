
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) break;

            String[] words = input.split(" ");

            String lastWorld = words[words.length - 1];

            System.out.println(lastWorld);

        }
    }
}
