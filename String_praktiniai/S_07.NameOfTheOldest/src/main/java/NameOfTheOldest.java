
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = 0;
        String oldestName = "";

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) break;

            String[] people = input.split(",");
            int age = Integer.parseInt(people[1]);

            if ( age > oldestAge) {
                oldestAge = age;
                oldestName = people[0];
            }
        }
        System.out.println("Age of the oldest: " + oldestName);

    }
}
