package BasicMaths;

public class Reverse {
    public static void main(String[] args) {
        int n = 12345;
        brute(n);
    }

    public static void brute(int n) {
        int reverse = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n / 10;
        }
        System.out.println("Output is " + reverse);
    }
}
