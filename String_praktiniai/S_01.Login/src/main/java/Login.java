
import java.util.Arrays;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] users = {{"alex", "sunshine"}, {"emma", "haskell"}};

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        boolean logedIn = false;

        for (String[] user : users) {
            if (username.equals(user[0]) && password.equals(user[1])) {
                logedIn = true;
                break;
            }
        }

        if (logedIn){
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
