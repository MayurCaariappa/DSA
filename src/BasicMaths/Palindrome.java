package BasicMaths;

public class Palindrome {
    //A number (or string) that reads the same forward and backward (e.g., 121).
    public static void main(String[] args) {
        int n1 = 4554;
        int n2 = 123;
        System.out.println(checkPalindrome(n1));
    }

    public static Boolean checkPalindrome(int n) {
        int reverse = 0;
        int original = n;
        while (n > 0) {
            int lastNum = n % 10;
            reverse = reverse * 10 + lastNum;
            n = n / 10;
        }

        return reverse == original;
    }
}
