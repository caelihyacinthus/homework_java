
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
    }

    public static void removeLast(ArrayList<String> words) {
        if (!words.isEmpty()) {
            words.remove(words.size() - 1);
        }
    }
}
