
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int grade = Integer.parseInt(scan.nextLine());

        if (grade > 100) {
            System.out.println("incredible!");
        } else if (grade < 0) {
            System.out.println("impossible!");
        } else {
            switch (grade / 10) {
                case 10:
                case 9:
                    System.out.println("5");
                    break;
                case 8:
                    System.out.println("4");
                    break;
                case 7:
                    System.out.println("3");
                    break;
                case 6:
                    System.out.println("2");
                    break;
                case 5:
                    System.out.println("1");
                    break;
                default:
                    System.out.println("Failed");
            }
        }

    }
}
