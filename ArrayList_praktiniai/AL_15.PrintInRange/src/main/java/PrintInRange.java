
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(10);

        printNumbersInRange(list, 2, 3);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for(int n: numbers){
            if(n >= lowerLimit && n <= upperLimit) System.out.println(n);
        }
    }
}
