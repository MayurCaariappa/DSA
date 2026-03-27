package BasicMaths;

public class Prime {
    public static void main(String[] args) {
        int n = 23;
        System.out.println(brute(n));
    }

    public static Boolean brute(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
