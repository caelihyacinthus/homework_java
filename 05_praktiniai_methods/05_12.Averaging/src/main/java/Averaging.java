
public class Averaging {

    public static int sum(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        int summed = sum(number1, number2, number3, number4);
        return (double) summed / 4;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
