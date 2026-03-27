package BasicMaths;

public class Divisors {
    public static void main(String[] args) {
        int n = 36;
        brute(n);
    }

    public static void brute(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
