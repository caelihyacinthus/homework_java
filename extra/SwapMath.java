public class SwapMath {
    public static void main(String[] args) {
        //swap to numbers without temp var
        int a = 154;
        int b = 6;
        System.out.println(a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }
}
