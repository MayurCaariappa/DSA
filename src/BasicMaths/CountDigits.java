package BasicMaths;

import java.util.Arrays;

public class CountDigits {
    public static void main(String[] args) {
        int n = 329823;
//        bruteForce(n);
        optimal(n);
    }

    public static void bruteForce(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println("Count is " + count);
    }

    public static void optimal(int n) {
        int count = (int) Math.log10(n) + 1;
        System.out.println("Count is " + count);
    }
}
