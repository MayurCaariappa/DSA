package BasicMaths;

public class GreastCommonDivisor {
    public static void main(String[] args) {
        int a = 20;
        int b = 15;
        brute(a, b);
        better(a, b);
        System.out.println(best(a, b));
    }

    public static void brute(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (a % i == 0 && b % i == 0) {
                    gcd = i;
                }
            }
        }
        System.out.println(gcd);
    }

    public static void better(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }

    // put b -> temp
    // remainder
    // put temp -> a
    // return a
    public static int best(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
